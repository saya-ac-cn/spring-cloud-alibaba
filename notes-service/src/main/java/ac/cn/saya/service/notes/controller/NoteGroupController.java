package ac.cn.saya.service.notes.controller;

import ac.cn.saya.service.notes.feign.UserFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteGroupController {

    private UserFeignService userFeignService;

    @GetMapping("/list")
    public String list() {
        return "ok";
    }

    @GetMapping("/add")
    public String add() {
        String user = userFeignService.query();
        return "以为用户"+user+"创建了一条";
    }
}
