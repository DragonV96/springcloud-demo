package com.glw.cunsumer.hystrix;

import com.glw.cunsumer.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : glw
 * @date : 2019/6/25
 * @time : 17:39
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello~ " + name + "这条消息发送失败了。";
    }
}
