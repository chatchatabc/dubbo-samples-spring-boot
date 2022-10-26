package org.apache.dubbo.springboot.demo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {
    @DubboReference
    private DemoService demoService;

    @GetMapping("/")
    public String name() {
        return demoService.sayHello("Jackie");
    }
}
