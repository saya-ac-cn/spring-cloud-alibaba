package ac.cn.saya.nacos.discovery.client.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/query/{name}")
    public String queryUserInfo(@PathVariable(value = "name") String name){
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
        // String url = serviceInstance.getUri() + "/server/api/user/" + name;
        String url = serviceInstance.getUri() + "/server/api/user/grade" + name;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        logger.info("Invoke : " + url + ", return : " + result);
        return "Invoke : " + url + ", return : " + result;
    }

}
