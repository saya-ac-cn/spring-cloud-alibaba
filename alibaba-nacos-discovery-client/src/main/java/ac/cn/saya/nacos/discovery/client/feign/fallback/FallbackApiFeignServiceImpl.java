package ac.cn.saya.nacos.discovery.client.feign.fallback;

import ac.cn.saya.nacos.discovery.client.feign.ApiFeignService;
import org.springframework.stereotype.Component;

/**
 * @Title: FallbackApiFeignServiceImpl
 * @ProjectName spring-cloud-alibaba
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2019-08-25 10:51
 * @Description:
 */
@Component
public class FallbackApiFeignServiceImpl implements ApiFeignService {

    /**
     * @param name
     * @描述
     * @参数 [name]
     * @返回值 java.lang.String
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/1/20
     * @修改人和其它信息 查询用户
     */
    @Override
    public String getUserInfo(String name) {
        return "request getUserInfo error Fallback";
    }

    /**
     * @param name
     * @描述
     * @参数
     * @返回值
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/1/20
     * @修改人和其它信息 查询用户的成绩
     */
    @Override
    public String getUserGrade(String name) {
        return "request getUserGrade error Fallback";
    }
}
