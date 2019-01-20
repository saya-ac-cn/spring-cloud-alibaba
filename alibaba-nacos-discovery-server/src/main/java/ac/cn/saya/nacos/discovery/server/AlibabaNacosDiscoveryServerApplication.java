package ac.cn.saya.nacos.discovery.server;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @描述
 * @参数
 * @返回值
 * @创建人  saya.ac.cn-刘能凯
 * @创建时间  2019/1/20
 * @修改人和其它信息
 * 服务启动入口
 */

@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosDiscoveryServerApplication {

	private static final Logger logger = Logger.getLogger(AlibabaNacosDiscoveryServerApplication.class);

	public static void main(String[] args) {
		/// SpringApplication.run(AlibabaNacosDiscoveryServerApplication.class, args);
		SpringApplication springApplication = new SpringApplication(AlibabaNacosDiscoveryServerApplication.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
		//项目启动完成打印项目名
		logger.warn("服务提供者已经启动 ... ");
	}

}

