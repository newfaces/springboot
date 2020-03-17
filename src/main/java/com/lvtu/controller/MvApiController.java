package com.lvtu.controller;

import com.lvtu.service.WaterMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:MvApiController
 * Package:com.lvtu.controller
 * Description:TODO
 *
 * @Date:2020/3/15 0015 23:01
 * Author:2498897200@qq.com
 *
 * url:/no/watermark
 */


@RestController
@RequestMapping("/no")
public class MvApiController {
    @Autowired
    private WaterMarkService waterMark;

    @RequestMapping("/watermark")
    public Map<String,Object> get(@RequestParam(name="url", required = true) String url) {
        HashMap<String, Object> resultResponseMap = new HashMap<>();
        try {
            url = url.replaceAll("\\s*", "");
            resultResponseMap.put("code",200);
            resultResponseMap.put("msg","success");
            resultResponseMap.put("feel","good");
            resultResponseMap.put("url",waterMark.acquireUrl(url));
            return resultResponseMap;
        } catch (Exception e) {
            e.printStackTrace();
            resultResponseMap.put("code",1);
            resultResponseMap.put("msg","The visit to fail: "+ e.getLocalizedMessage());
            return resultResponseMap;
        }
    }

}
