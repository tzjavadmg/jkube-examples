package com.codyzeng.jkube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/31
 */
@RestController
public class NginxIngressController {
    @RequestMapping("/")
    public String index() {
        return "ingress controller 演示！";
    }
}
