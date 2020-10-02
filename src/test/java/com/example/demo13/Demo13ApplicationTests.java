package com.example.demo13;

import com.example.demo13.bean.Dog;
import com.example.demo13.bean.Person;
import com.example.demo13.config.AppTestConfig;
import com.example.demo13.service.DemoService;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.apache.ibatis.executor.BaseExecutor;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.lang.reflect.Proxy;

@ContextConfiguration
class Demo13ApplicationTests {


    @Test
    void contextLoads() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        DemoService demoService = (DemoService) applicationContext.getBean("someservice");

        demoService.DoSome();

        int num = applicationContext.getBeanDefinitionCount();


      /*  AnnotationConfigApplicationContext  cc = new AnnotationConfigApplicationContext(AppTestConfig.class);

        System.out.println(cc.getBean(Dog.class));

        Proxy.newProxyInstance()
*/

        //Proxy.newProxyInstance();

        SqlSession;
        PerpetualCache;
        BaseExecutor;

        CachingExecutor;
    }

}
