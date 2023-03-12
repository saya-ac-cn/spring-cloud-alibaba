package ac.cn.saya.service.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{

    @GetMapping("/user/detail")
    public String query() {
        return "saya";
    }

}
