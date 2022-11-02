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

    @Value("${welcome:no config}")
    private String welcome;

    @Value("${name:no config}")
    private String name;

    @RequestMapping("/")
    public String index() {
        return name + " " + welcome;
    }
}
