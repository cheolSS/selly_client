package com.onycom.imqa.selly;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DriverVo.class)
public class DriverVo {


    private String whatDriver;

    private String whatDriverSetupFolderDir;

    public String getWhatDriverSetupFolderDir() {
        return whatDriverSetupFolderDir;
    }

    public void setWhatDriverSetupFolderDir(String whatDriverSetupFolderDir) {
        this.whatDriverSetupFolderDir = whatDriverSetupFolderDir;
    }

    public String getWhatDriver() {
        return whatDriver;
    }

    public void setWhatDriver(String whatDriver) {
        this.whatDriver = whatDriver;
    }

}
