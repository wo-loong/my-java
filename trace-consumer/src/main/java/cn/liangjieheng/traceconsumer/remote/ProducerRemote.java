package cn.liangjieheng.traceconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "providerRemote", url = "${custom.provider.url}")
public interface ProducerRemote {

    @GetMapping("/demo/listAccount")
    List<String> listAccount();
}
