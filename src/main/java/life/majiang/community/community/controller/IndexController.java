package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
1.@Controller：springboot会自动识别该注解把这个类当作bean去管理，允许这个类去接受前端的请求。
2.@RequestParam请求的参数
3.model是用来将传入的值放入到页面上的
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
