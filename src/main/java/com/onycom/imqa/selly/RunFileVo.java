package com.onycom.imqa.selly;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = RunFileVo.class)
public class RunFileVo {

    private String metricList;
    private String scenarioList;

    public String getScenarioList() {
        return scenarioList;
    }

    public void setScenarioList(String scenarioList) {
        this.scenarioList = scenarioList;
    }

    public String getMetricList() {
        return metricList;
    }

    public void setMetricList(String metricList) {
        this.metricList = metricList;
    }
}
