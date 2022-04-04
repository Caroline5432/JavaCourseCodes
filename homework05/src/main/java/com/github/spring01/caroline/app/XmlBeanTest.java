package com.github.spring01.caroline.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName XmlBeanTest
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 13:05
 **/
public class XmlBeanTest {

    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 构造方式输出结果
        System.out.println(applicationContext.getBean("student111"));
        // 设值方式输出结果
        System.out.println(applicationContext.getBean("student222"));
    }

}
