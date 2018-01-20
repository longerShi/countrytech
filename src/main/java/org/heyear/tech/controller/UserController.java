package org.heyear.tech.controller;

import org.heyear.framework.api.ApiResult;
import org.heyear.framework.web.ApiBaseController;
import org.heyear.tech.bean.TechUser;
import org.heyear.tech.entity.User;
import org.heyear.tech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 * @Desc
 */
@Controller
@RequestMapping("users")
public class UserController extends ApiBaseController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult login(@RequestParam(value = "userName") String userName,
                           @RequestParam(value = "password") String password) {
        User user = userService.getByUsernamePassword(userName, password);
        return new ApiResult("user", user);
    }


    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseBody
    public ApiResult login(@RequestBody User user) {
        userService.createUser(user);
        return new ApiResult();
    }


    @RequestMapping(value = "/techs", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult getUserTechList() {
        List<TechUser> list = userService.getTechUserList();
        return new ApiResult("techUsers", list);
    }


    @RequestMapping(value = "/techs/{techUserId}", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult getUserTech(@PathVariable(value = "techUserId") String techUserId) {
        TechUser techUser = userService.getTechUser(techUserId);
        return new ApiResult("techUser", techUser);
    }


}