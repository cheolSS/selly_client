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

    @Autowired
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
    public String processingPage(@RequestParam("file1") MultipartFile file1,
                                 @RequestParam("file2") MultipartFile file2,
                                 @RequestParam("testUrl") String testUrl,
                                 @RequestParam("browser") String webBrowserType,
                                 ModelMap modelMap) {

        System.out.println(file1.getOriginalFilename());
        System.out.println(file2.getOriginalFilename());
        System.out.println(testUrl);
        System.out.println(webBrowserType);


        modelMap.addAttribute("file1", file1.getOriginalFilename());
        modelMap.addAttribute("file2", file2.getOriginalFilename());
        modelMap.addAttribute("testUrl", testUrl);
        modelMap.addAttribute("browser", webBrowserType);

        myService.doAsyncWork(webSocketMessagingService);   // <-여기서 셀리 실행하세요


        return "processing";
    }
//
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public String greeting(String message) throws Exception {
//        System.out.println(message);
//        return "Hello, " + message + "!";
//    }

    @GetMapping("/result")
    public String resultPage(Model model) {

        model.addAttribute("result",new SellyTestResult());   //여기엔 값이 들어있는게 전달 되어야 함
        model.addAttribute("resultCount",new ProgressBarVo());
        return "result";
    }

}
