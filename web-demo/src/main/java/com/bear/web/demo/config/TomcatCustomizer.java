package com.bear.web.demo.config;

import org.springframework.context.annotation.Configuration;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: bear
 * @create: 2022-04-08 08:42
 **/
@Configuration
public class TomcatCustomizer {

    //@Bean
    //public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
    //    TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
    //    factory.addConnectorCustomizers(new MyTomcatConnectionCustomizer());
    //    return factory;
    //}

    //static class MyTomcatConnectionCustomizer implements TomcatConnectorCustomizer {
    //    public  MyTomcatConnectionCustomizer() {
    //
    //    }
    //
    //    @Override
    //    public void customize(Connector connector) {
    //        connector.setPort(Integer.parseInt("8080"));
    //        connector.setProperty("maxConnections","8192");
    //        connector.setProperty("acceptorThreadCount","100");
    //        connector.setProperty("minSpareThreads","10");
    //        connector.setProperty("maxThreads","200");
    //    }
    //}
}

