package org.heyear.tech.controller;

import org.heyear.framework.api.ApiResult;
import org.heyear.framework.web.ApiBaseController;
import org.heyear.tech.entity.TechInfo;
import org.heyear.tech.service.TechInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 * @Desc
 */
@Controller
@RequestMapping("techs")
public class TechInfoController extends ApiBaseController{

    @Autowired
    TechInfoService techInfoService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult getList() {
        List<TechInfo> list = techInfoService.getList();
        return new ApiResult("techs", list);
    }

}
