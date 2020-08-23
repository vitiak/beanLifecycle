package com.kodilla.beanlifecycle;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.logging.Logger;

public class LoggerBeanPostProcessor implements BeanPostProcessor {
    Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("nowy bean: " + beanName);
        return bean;
    }

}
