package org.heyear.tech.controller;

import org.heyear.framework.api.ApiResult;
import org.heyear.framework.web.ApiBaseController;
import org.heyear.tech.bean.TechUser;
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


    @RequestMapping(value = "/techs", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult getUserTech() {
        List<TechUser> list = userService.getTechUserList();
        return new ApiResult("techUsers", list);
    }

}