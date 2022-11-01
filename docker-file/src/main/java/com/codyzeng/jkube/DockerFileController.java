package com.codyzeng.jkube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/29
 */
@RestController
public class DockerFileController {
    @RequestMapping("/")
    public String index() {
        return "自定义dockefile";
    }
}
