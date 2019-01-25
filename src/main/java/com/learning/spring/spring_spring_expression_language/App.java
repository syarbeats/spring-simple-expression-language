package com.learning.spring.spring_spring_expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        LicenseConfigImpl license = (LicenseConfigImpl) ctx.getBean(LicenseConfigImpl.class);
        System.out.println("Server: "+license.getServer());
    }
}
