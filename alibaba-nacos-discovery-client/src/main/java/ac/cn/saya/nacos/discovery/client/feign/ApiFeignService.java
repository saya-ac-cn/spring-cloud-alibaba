package ac.cn.saya.nacos.discovery.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: ApiFeignService
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @Author Saya
 * @Date: 2019/1/22 23:02
 * @Description:
 * 提供者1对外feign接口
 */
@FeignClient(value = "provider",contextId = "api",path = "server/api")
public interface ApiFeignService {

    /**
     * @描述
     * @参数  [name]
     * @返回值  java.lang.String
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/20
     * @修改人和其它信息
     * 查询用户
     */
    @GetMapping(value = "user/{name}")
    public String getUserInfo(@PathVariable(value = "name") String name);

    /**
     * @描述
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/1/20
     * @修改人和其它信息
     * 查询用户的成绩
     */
    @GetMapping(value = "user/grade")
    public String getUserGrade(@RequestParam(value = "name") String name);

}