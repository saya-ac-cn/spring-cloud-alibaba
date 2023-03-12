package ac.cn.saya.service.notes.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author saya
 * @title: UserFeignService
 * @projectName spring-cloud-alibaba
 * @description: TODO
 * @date: 2023/3/12 21:56
 * @description:
 */

@Service
@FeignClient(value = "user-service",contextId = "user",path = "user")
public interface UserFeignService {
    @GetMapping("/detail")
    public String query();
}
