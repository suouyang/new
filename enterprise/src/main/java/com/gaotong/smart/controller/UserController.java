package com.gaotong.smart.controller;



import com.gaotong.smart.config.Result;
import com.gaotong.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin  //解决跨域
public class UserController {
    //login
    @Autowired
    UserService userService;
    @PostMapping("login")
    public Result login(String username,String password) {
//        User user = userService.getOne(new QueryWrapper<User>().eq("user_name", username));
//        Assert.notNull(user,"用户不存在");//断言拦截
//        if(!user.getPassword().equals(SecureUtil.md5(password))){
//            //密码不同则抛出异常
//            return Result.error().mesage("密码不正确");
//        }

        return Result.ok().data("token","admin");
    }
    //info
    @GetMapping("info")
    public Result info() {
        return Result.ok().data("roles","[管理员]").data("name","admin").data("avatar","https://edu-suouyang.oss-cn-beijing.aliyuncs.com/2021/08//23/43cf235a57fd415998ca788d8dfd5783头像.jpg");
    }
}
