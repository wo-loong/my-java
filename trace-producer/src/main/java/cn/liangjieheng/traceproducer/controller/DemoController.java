package cn.liangjieheng.traceproducer.controller;

import cn.liangjieheng.traceproducer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/demo/listAccount")
    public List<String> listAccount() {
        return this.demoService.listAccount();
    }
}
