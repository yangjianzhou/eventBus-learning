package com.iwill.eventBus.event;

public class RegisterEvent {

    private String mobile ;

    private String addr ;

    public RegisterEvent(String mobile, String addr) {
        this.mobile = mobile;
        this.addr = addr;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
