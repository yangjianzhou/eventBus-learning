package com.iwill.eventBus.service;

import com.google.common.eventbus.EventBus;
import com.iwill.eventBus.event.LoginEvent;
import com.iwill.eventBus.event.RegisterEvent;
import com.iwill.eventBus.listener.EventListener;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements InitializingBean {

    @Autowired
    private EventListener eventListener ;

    @Autowired
    private EventBus eventBus ;

    public void postEvent(){
        eventBus.register(eventListener);
        eventBus.post(new RegisterEvent("13800138000","shanghai"));
       // eventBus.post(new LoginEvent("qingyang","123456"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //eventBus.register(eventListener);
    }
}
