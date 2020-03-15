package com.di.dependencyInjection.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("I am in lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My Beanname is :" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBean destroyed and terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext is set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct is called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy is called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
