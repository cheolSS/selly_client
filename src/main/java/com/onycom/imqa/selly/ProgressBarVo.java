package com.onycom.imqa.selly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = ProgressBarVo.class)
public class ProgressBarVo {

    private int successTestResultCount;
    private int failTestResultCount;

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
}
