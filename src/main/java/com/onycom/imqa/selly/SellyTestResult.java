package com.onycom.imqa.selly;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackageClasses = SellyTestResult.class)
//SellyTestResult -> SellyTestResultVo로 수정해야 함
public class SellyTestResult {

    private String printLog;
    private int successTestResultCount;
    private int failTestResultCount;
    private String testUrl;
    private String webBrowserType;
    private List<ImgScrDirWithTestResultVo> testReport = new ArrayList<>();
    private String ExcelDownloadDir;

    //    private String scenarioListDir;
    // -> RunfileVo의 값 가져오기
    private RunFileVo runFileVo;
    public RunFileVo getRunFileVo() {
        return runFileVo;
    }


    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getWebBrowserType() {
        return webBrowserType;
    }

    public void setWebBrowserType(String webBrowserType) {
        this.webBrowserType = webBrowserType;
    }

    public List<ImgScrDirWithTestResultVo> getTestReport() {
        return testReport;
    }

    public void setTestReport(List<ImgScrDirWithTestResultVo> testReport) {
        this.testReport = testReport;
    }

    public String getPrintLog() {
        return printLog;
    }

    public void setPrintLog(String printLog) {
        this.printLog = printLog;
    }

    public int getSuccessTestResultCount() {
        return successTestResultCount;
    }

    public void setSuccessTestResultCount(int successTestResultCount) {
        this.successTestResultCount = successTestResultCount;
    }

    public int getFailTestResultCount() {
        return failTestResultCount;
    }

    public void setFailTestResultCount(int failTestResultCount) {
        this.failTestResultCount = failTestResultCount;
    }

    public String getExcelDownloadDir() {
        return ExcelDownloadDir;
    }

    public void setExcelDownloadDir(String excelDownloadDir) {
        ExcelDownloadDir = excelDownloadDir;
    }

}
