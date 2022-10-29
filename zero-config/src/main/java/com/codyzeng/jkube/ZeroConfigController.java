package com.codyzeng.jkube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/28
 */
@RestController
public class ZeroConfigController {
    @RequestMapping("/")
    public String index() {
        return "k8s中的spring boot服务";
    }

}
