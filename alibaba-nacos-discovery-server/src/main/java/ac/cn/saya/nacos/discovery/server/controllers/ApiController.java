package ac.cn.saya.nacos.discovery.server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Title: ApiController
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/20 22:27
 * @Description:
 * 对外api接口
 */
@RestController
@RequestMapping(value = "/server/api")
public class ApiController {

    private static Logger logger = LoggerFactory.getLogger(ApiController.class);

    /**
     * @描述
     * @参数  [name]
     * @返回值  java.lang.String
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/20
     * @修改人和其它信息
     * 查询用户
     */
    @GetMapping(value = "/user/{name}")
    public String getUserInfo(@PathVariable(value = "name") String name){
        logger.info("正在查询：" + name);
        return "正在为您查询‘" + name + "’用户，请稍等.....，该用户的信息如下：";
    }

    /**
     * @描述
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/20
     * @修改人和其它信息
     * 查询用户的成绩
     */
    @GetMapping(value = "/user/grade")
    public String getUserGrade(@RequestParam(value = "name") String name){
        logger.info("正在查询：" + name);
        return "正在为您查询‘" + name + "’用户，请稍等.....，该用户的成绩如下：";
    }


}
