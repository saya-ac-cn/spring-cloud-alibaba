package ac.cn.saya.nacos.discovery.client.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: UserController
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/20 23:12
 * @Description:
 * 用户查询模块
 */

@RestController
@RequestMapping(value = "user")
@RefreshScope
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    private static final String SERVICE_NAME = "http://service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/query/{name}")
    public String queryUserInfo(@PathVariable(value = "name") String name){
        String url = SERVICE_NAME + "/server/api/user/" + name;
        String result = restTemplate.getForObject(url, String.class);
        logger.info("Invoke : " + url + ", return : " + result);
        return "Invoke : " + url + ", return : " + result;
    }

    @Value("${didispace.title:}")
    private String title;

    @GetMapping("/test")
    public String hello() {
        return title;
    }

//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//
//    @GetMapping(value = "/query2/{name}")
//    public String queryUserInfo2(@PathVariable(value = "name") String name) {
//        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
//        ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
//        String url = serviceInstance.getUri() + "/server/api/user/" + name;
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(url, String.class);
//        return "Invoke : " + url + ", return : " + result;
//    }



}
