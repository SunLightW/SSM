package cn.jasmine.base;


import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicHTML;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    public static StringBuffer URL = null;

    private Map<String,Object> hashMap = new HashMap<String,Object>();

    /**
     * 获得项目信息
     * @param request
     * @return
     */
    public Map getWebSiteInfo(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        URL.append(request.getScheme());//请求协议，HTTP或者HTTPS
        URL.append("://");
        URL.append(request.getHeader("host"));//请求的服务器
        URL.append(request.getRequestURI());//工程名
        map.put("URL",URL);
        return map;
    }

    /**
     * 返回成功的答复
     * @param value
     * @return
     */
    public Object success(Object value){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("success",0);
        resultMap.put("data",value);
        return resultMap;
    }

    /**
     * 返回错误的答复
     * @param value
     * @return
     */
    public Object error(Object value){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("success",1);
        resultMap.put("data",value);
        return resultMap;
    }

    /**
     * 获得请求对话
     * @param request
     * @return
     */
    public HttpSession getSession(HttpServletRequest request){
        return request.getSession();
    }

    /**
     * 初始化HTTP头信息
     * @return
     */
    public HttpHeaders initHttpHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType mediaType = new MediaType("text", "html", Charset.forName("utf-8"));
        httpHeaders.setContentType(mediaType);
        return httpHeaders;
    }













}
