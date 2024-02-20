package com.onycom.imqa.selly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackageClasses = PoiReadExcel.class)
@ComponentScan("imqa.dashboard.vo")
public class PoiReadExcel {

  @Autowired
  RunFileVo runFileVo;
}
