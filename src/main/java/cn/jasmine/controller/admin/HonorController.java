package cn.jasmine.controller.admin;


import cn.jasmine.service.admin.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * 荣耀controller
 * @author Jasmine
 */
@Controller
@RequestMapping("/honor")
public class HonorController {

    @Autowired
    private HonorService honorService;


    @RequestMapping("/showhonor")
    public String showHonor(){
        return "admin/hello";
    }

//    @Controller
//    @RequestMapping("/user")
//    public class UserController {
//
//        private Logger log = Logger.getLogger(UserController.class);
//        @Resource
//        private UserService userService;
//
//        @RequestMapping("/showUser")
//        public String showUser(HttpServletRequest request, Model model){
//            log.info("查询所有用户信息");
//            List<User> userList = userService.getAllUser();
//            model.addAttribute("userList",userList);
//            return "showUser";
//        }
}
