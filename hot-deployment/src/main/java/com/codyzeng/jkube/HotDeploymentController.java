package com.codyzeng.jkube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/29
 */
@RestController
public class HotDeploymentController {
    @RequestMapping("/")
    public String index() {
        return "使用k8s:watch实现热部署！";
    }

//    @RequestMapping("/newMethod")
//    public String newMethod() {
//        return "新增一个方法";
//    }

}
