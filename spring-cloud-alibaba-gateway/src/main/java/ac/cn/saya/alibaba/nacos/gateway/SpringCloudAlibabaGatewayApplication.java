package ac.cn.saya.alibaba.nacos.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudAlibabaGatewayApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringCloudAlibabaGatewayApplication.class);

    public static void main(String[] args) {
        /// SpringApplication.run(SpringCloudAlibabaGatewayApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SpringCloudAlibabaGatewayApplication.class);
        // 禁止命令行设置参数
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
        //项目启动完成打印项目名
        logger.warn("服务网关已经启动 ... ");
    }

}
