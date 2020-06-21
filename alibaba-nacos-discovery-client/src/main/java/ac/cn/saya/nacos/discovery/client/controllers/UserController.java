package ac.cn.saya.nacos.discovery.client.controllers;

import ac.cn.saya.nacos.discovery.client.feign.ApiFeignService;
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
//实现配置的热加载
@RefreshScope
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private ApiFeignService apiFeignService;

    @GetMapping(value = "/query/{name}")
    public String queryUserInfo(@PathVariable(value = "name") String name){
        String result = apiFeignService.getUserInfo(name);
        logger.info("return : " + result);
        return "return : " + result;
    }



}
