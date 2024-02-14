package com.example.jymapplication.utils;

import com.example.jymapplication.storage.Storage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//todo
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Storage storage) {
            initializeStorage(storage);
        }
        return bean;
    }

    public void initializeStorage(Storage storage) {
        //todo
        System.out.println("Works");
    }
}