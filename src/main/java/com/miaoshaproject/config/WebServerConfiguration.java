package com.miaoshaproject.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * @描述
 * @创建人 wpfei
 * @创建时间 2019-08-20
 */
@Component
//当spring容器内没有TomcatEmbeddedServletContainerFactory这个bean时，会把此bean加载进来
public class WebServerConfiguration implements WebServerFactoryCustomizer<ConfigurableWebServerFactory >{

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
//使用妇婴工厂类提供的接口，定制化tomcat connector
        ((TomcatServletWebServerFactory)factory).addConnectorCustomizers(new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                Http11NioProtocol  protocol = (Http11NioProtocol) connector.getProtocolHandler();
            //定制化keepAliveTimeOut,设置30秒内没有请求，则服务端自动断开keepAlive连接
                protocol.setKeepAliveTimeout(30000);
                //当客户端发送超过10000个请求则自动断开keepAlive连接
                protocol.setMaxKeepAliveRequests(10000);

            }
        });
    }
}
