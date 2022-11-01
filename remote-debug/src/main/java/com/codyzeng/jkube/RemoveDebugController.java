package com.codyzeng.jkube;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codyzeng@163.com
 * @date: 2022/10/28
 */
@Slf4j
@RestController
public class RemoveDebugController {

    @RequestMapping("/")
    public String index() {
        log.info("Index");
        return "k8s中的spring boot服务,远程debug";
    }
}
