package blog.demo.controller;

import blog.demo.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mr.chen on 2020/3/28. 15:50
 */
@RestController
public class TestController {
    @Resource
    private ProviderService providerService;

    @GetMapping("getConvertAndSend")
    public Object getConvertAndSend() {
        return providerService.convertAndSend("getConvertAndSend");
    }

    @GetMapping("getSyncSend")
    public Object getSyncSend() {
        return providerService.syncSend("getSyncSend");
    }

    @GetMapping("getSendOneWay")
    public Object getSendOneWay() {
        return providerService.sendOneWay("getSendOneWay");
    }

    @GetMapping("getSyncSendOrderly")
    public Object getSyncSendOrderly() {
        return providerService.syncSendOrderly("getSyncSendOrderly");
    }

    @GetMapping("getAsyncSend")
    public Object getAsyncSend() {
        return providerService.asyncSend("getAsyncSend");
    }
}
