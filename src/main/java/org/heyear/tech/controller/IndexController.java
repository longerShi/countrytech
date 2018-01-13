package org.heyear.tech.controller;

import org.heyear.framework.api.ApiResult;
import org.heyear.framework.web.ApiBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */

@Controller
@RequestMapping("")
public class IndexController extends ApiBaseController{

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult index() {
        return new ApiResult();
    }


}
