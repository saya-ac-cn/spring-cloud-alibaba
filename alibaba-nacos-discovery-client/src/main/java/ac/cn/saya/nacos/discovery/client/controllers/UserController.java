package ac.cn.saya.nacos.discovery.client.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    private final RestTemplate restTemplate;

    @Autowired
    public UserController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    @GetMapping(value = "/query/{name}")
    public String queryUserInfo(@PathVariable(value = "name") String name){
        // return restTemplate.getForObject("http://localhost:8001/server/api/user/" + name, String.class);
        return restTemplate.getForObject("http://service-provider/server/api/user/" + name, String.class);
    }

    private static final String SERVICE_NAME = "service-provider";

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    /**
//     * 获取所有服务
//     */
//    @RequestMapping("/services")
//    public Object services() {
//        return discoveryClient.getInstances(SERVICE_NAME);
//    }
//
//    /**
//     * 消费服务
//     */
//    @GetMapping(value = "/query/{name}")
//    public String queryUserInfo(@PathVariable(value = "name") String name){
//        ServiceInstance serviceInstance = (ServiceInstance) discoveryClient.getInstances(SERVICE_NAME);
//        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/server/api/user/"+name, String.class);
//        System.out.println(callServiceResult);
//        return callServiceResult;
//    }

}
