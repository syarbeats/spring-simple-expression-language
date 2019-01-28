package com.learning.spring.spring_spring_expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        LicenseConfigImpl license = (LicenseConfigImpl) ctx.getBean(LicenseConfigImpl.class);
        System.out.println("Load file config.properties using environment and SPEL");
        System.out.println("======================================================");
        System.out.println("Server: "+license.getServer());
        System.out.println("Port: "+license.getPort());
        System.out.println("License File: "+ license.getLicenseKeyFile());
        System.out.println("ApplicationName: "+ license.getApplicationName());
        System.out.println("Username: "+ license.getUsername());
        System.out.println("");
        /*
         * SPEL MESSAGE
         */
        System.out.println("SPEL MESSAGE");
        System.out.println("======================================================");
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello SPEL...'");
        String message = (String) exp.getValue();
        System.out.println("Message SPEL: "+ message);
        System.out.println("");
        
        /*
         *SPEL Operator 
         */
        
        System.out.println("SPEL OPERATOR");
        System.out.println("======================================================");
        System.out.println("Concat: "+parser.parseExpression("'Welcome SPEL'+'!'").getValue());
        System.out.println("Aritmatika: "+parser.parseExpression("10 * 10/2").getValue());
        System.out.println("Load Parameter: "+parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());
        System.out.println("Logic: "+parser.parseExpression("true and true").getValue());
        System.out.println("Logic: "+parser.parseExpression("'The Beatles'.length()==10").getValue());
    }
}
