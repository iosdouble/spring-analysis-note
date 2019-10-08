package com.core;

import com.core.bean.ProdSimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname demo1
 * @Description TODO
 * @Date 2019/10/8 4:28 PM
 * @Created by nihui
 */
public class Demo1 {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        context.getEnvironment().setActiveProfiles("prod");
        ProdSimpleBean object = (ProdSimpleBean) context.getBean("prodSimpleBean");
        object.send();
        context.close();
    }
}
