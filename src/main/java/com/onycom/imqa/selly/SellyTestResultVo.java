package com.onycom.imqa.selly;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class SellyTestResultVo {//수철씨꺼 jar가 잘 안되서 임시로 만듬

    String scenarioListDir;
    String testUrl;
    String webBrowserType;
    List<ImgScrDirWithTestResultVo> testReport = new ArrayList<>();
    ProgressBarVo progressBarVo;

}
