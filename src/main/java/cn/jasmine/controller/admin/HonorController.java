package cn.jasmine.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
@RequestMapping("/honor")
public class HonorController {

//    private Logger logger =Logger.getLogger(HonorController.class);

    @RequestMapping("/showhonor")
    public String showHonor(HttpServletRequest request, HttpServletResponse response){
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
