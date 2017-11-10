package cn.jasmine.controller;


import cn.jasmine.entity.HonorAdminEntity;
import cn.jasmine.service.HonorService;
import cn.jasmine.service.impl.HonorServiceImpl;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 荣耀controller
 * @author Jasmine
 */
@Controller
public class HonorAdminController {

    @Autowired
    private HonorService honorService;


    @RequestMapping(value = "/showall")
    @ResponseBody
    public String showAll(){
        List<HonorAdminEntity> allHonor = honorService.findAllHonor();
        return JSON.toJSONString(allHonor);
    }


}
