package com.core;

import com.core.bean.SimpleBean;
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
        SimpleBean object = (SimpleBean) context.getBean("SimpleBean");
        object.send();
        context.close();
    }
}
