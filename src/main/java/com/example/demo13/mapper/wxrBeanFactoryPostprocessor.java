package com.example.demo13.mapper;

import com.example.demo13.bean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.lang.reflect.GenericDeclaration;

@Component
public class wxrBeanFactoryPostprocessor  implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        GenericBeanDefinition aa = (GenericBeanDefinition)configurableListableBeanFactory.getBeanDefinition("demoServiceImp");

        aa.setBeanClass(Dog.class);

    }
}
