package com.onycom.imqa.selly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ImgScrDirWithTestResultVo.class)
public class ImgScrDirWithTestResultVo {

    private String imgScrDir;
    private String testResult;

    public String getImgScrDir() {
        return imgScrDir;
    }

    public void setImgScrDir(String imgScrDir) {
        this.imgScrDir = imgScrDir;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}
