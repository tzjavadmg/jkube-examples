package com.codyzeng.jkube;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/29
 */
@RestController
public class CustomResourceController {

    @Value("${welcome}")
    private String welcome;

    @RequestMapping("/")
    public String index() {
        return welcome + "自定义k8s资源描述文件";
    }
}
