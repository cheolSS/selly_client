package com.onycom.imqa.selly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@ComponentScan("imqa.dashboard.runner")
public class ViewController {

    RunFileVo runFileVo;
    SellyTestResult sellyTestResult;
    DriverVo driverVo;
    MyService myService;
    @Autowired
    WebSocketMessagingService webSocketMessagingService;


    @GetMapping("/")
    public String mainPage() {
        return "index";
    }



    @GetMapping("/input")
    public String uploadFormPage() {
        return "inputForm";
    }


    @PostMapping("/processing")
    public String processingPage(@RequestParam("elementListDir") MultipartFile elementListDir,
                                 @RequestParam("scenarioListDir") MultipartFile scenarioListDir,
                                 @RequestParam("testUrl") String testUrl,
                                 @RequestParam("excelDownloadDir") String excelDownloadDir,
                                 @RequestParam("whatDriver") String whatDriver,
                                 @RequestParam("whatDriverSetupFolderDir") String whatDriverSetupFolderDir,
                                 ModelMap modelMap) {


        modelMap.addAttribute("elementListDir", elementListDir.getOriginalFilename());
        modelMap.addAttribute("scenarioListDir", scenarioListDir.getOriginalFilename());
        modelMap.addAttribute("testUrl", testUrl);
        modelMap.addAttribute("excelDownloadDir", excelDownloadDir);
        modelMap.addAttribute("whatDriver", whatDriver);
        modelMap.addAttribute("whatDriverSetupFolderDir", whatDriverSetupFolderDir);

        runFileVo.setMetricList(elementListDir.getOriginalFilename());
        runFileVo.setScenarioList(scenarioListDir.getOriginalFilename());
        sellyTestResult.setTestUrl(testUrl);
        sellyTestResult.setExcelDownloadDir(excelDownloadDir);
        driverVo.setWhatDriver(whatDriver);
        driverVo.setWhatDriverSetupFolderDir(whatDriverSetupFolderDir);

        myService.doAsyncWork(webSocketMessagingService);
        return "processing";
    }

    @GetMapping("/result")
    public String resultPage(Model model) {

        model.addAttribute("result",new SellyTestResult());
        model.addAttribute("resultSuccessCount",new ProgressBarVo().getFailTestResultCount());
        model.addAttribute("resultFailCount",new ProgressBarVo().getSuccessTestResultCount());
        return "result";
    }

}
