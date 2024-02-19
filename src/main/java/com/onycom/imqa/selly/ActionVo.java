package com.onycom.imqa.selly;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = ActionVo.class)
public class ActionVo {

    private String actionName;
    private String actionCode;
    private String desc;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    //    @Autowired
//    private String ActionName;
//
//    @Autowired
//    private String ActionCode;
//
//    @Autowired
//    private String Desc;
//
//    public String getActionName() {
//        return ActionName;
//    }
//
//    public void setActionName(String actionName) {
//        ActionName = actionName;
//    }
//
//    public String getActionCode() {
//        return ActionCode;
//    }
//
//    public void setActionCode(String actionCode) {
//        ActionCode = actionCode;
//    }
//
//    public String getDesc() {
//        return Desc;
//    }
//
//    public void setDesc(String desc) {
//        Desc = desc;
//    }
}

