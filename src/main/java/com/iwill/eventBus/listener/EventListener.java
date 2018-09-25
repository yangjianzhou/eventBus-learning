package com.iwill.eventBus.listener;

import com.google.common.eventbus.Subscribe;
import com.iwill.eventBus.event.LoginEvent;
import com.iwill.eventBus.event.RegisterEvent;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @Subscribe
    public void subscribeLoginEvent1(LoginEvent event){
        System.out.println("method 1 : receive login event ");
    }

    @Subscribe
    public void subscribeLoginEvent2(LoginEvent event){
        System.out.println("method 2 : receive login event ");
    }

    @Subscribe
    public void subscribeRegisterEvent(RegisterEvent event){
        try{
            Thread.sleep(10000L);
        }catch (Exception exp){
            exp.printStackTrace();
        }
        System.out.println("method  : receive register event ");
    }
}
