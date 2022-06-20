package com.atguigu.gulimall.thirdparty.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.thirdparty.common.CallbackServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Map;

/**
 * @CreateTime 2022/6/20-20 17:32
 * @Author laowang
 * @Description
 */
@RestController
public class OssControler {

    @RequestMapping("/oss/policy")
    public R policy() throws ServletException, IOException {
        CallbackServer callbackServer = new CallbackServer();
        Map<String, String> resMap = callbackServer.doGet();
        return R.ok().put("data",resMap);
    }
}
