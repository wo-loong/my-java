package cn.liangjieheng.traceproducer.service;

import cn.liangjieheng.traceproducer.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public List<String> listAccount(){
        return this.demoMapper.listAccount();
    }
}
