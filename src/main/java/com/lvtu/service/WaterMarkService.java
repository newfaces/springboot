package com.lvtu.service;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * ClassName:MvService
 * Package:com.lvtu.service
 * Description:TODO
 *
 * @Date:2020/3/15 0015 23:05
 * Author:2498897200@qq.com
 */


@Service
public class WaterMarkService {

    public String acquireUrl(String url) throws IOException {
        Connection conn = getConn(url);
        Document document = conn.get();
        Element theVideo = document.getElementById("theVideo");
        String waterMakerUrl = theVideo.attr("src").replace("playwm", "play");
        Connection con = getConn(waterMakerUrl);
        String redirectURL = getRedirectURL(con);
        System.out.println(redirectURL);
        System.out.println(redirectURL);
        return redirectURL;
    }

    private Connection getConn(String url){
        return Jsoup.connect(url).userAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1").ignoreContentType(true);
    }
    private String getRedirectURL(Connection conn) throws IOException{
        return conn.followRedirects(false).execute().header("location");
    }



}
