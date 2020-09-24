package com.devadapter.springbootmybatis.controller;

import com.devadapter.springbootmybatis.utils.GZIPUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangjie
 * @date 2020/4/12
 */
@RestController
public class HttpContorller {

    @PostMapping("/restTemplate/doHttpPost")
    public String doPost(HttpServletRequest request, @RequestBody String jsonString) throws IOException {
        System.out.println(request.getCharacterEncoding());
        //并不是请求体（中文）数据，需要转码
        String justryDeng = new String(request.getHeader("justryDeng").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        System.out.println(justryDeng);
        System.out.println("flag的值为：" + request.getParameter("flag"));
        System.out.println(jsonString);
        //获取请求体中的数据
        System.out.println("请求体中的数据为：" + GZIPUtils.unCompress(jsonString));
        return "我是post的响应数据";
    }
}
