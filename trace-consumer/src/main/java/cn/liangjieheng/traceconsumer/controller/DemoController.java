package cn.liangjieheng.traceconsumer.controller;

import cn.liangjieheng.traceconsumer.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class DemoController {
    @Autowired
    private ProducerRemote producerRemote;

    @GetMapping("/demo/listAccount")
    public List<String> listAccount() {
        return this.producerRemote.listAccount();
    }

    @PostMapping("/demo/add")
    public String add(@RequestBody Param param) {
        return param.toString();
    }

    public static class Param {
        private Map<String, Object> param;

        public Map<String, Object> getParam() {
            return param;
        }

        public void setParam(Map<String, Object> param) {
            this.param = param;
        }
    }
}
