package com.along.gps.Controller;
/**
 * @Description:
 * @Author: why
 * @Date: 2018-11-29 19:41
 */


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
   * 功能描述 
   * @author why
   * @date 2019/4/29
   * @return
   * @description  ${description}
 */


@Controller
@RequestMapping(value = "/login")
public class LoginController {


    /**
     * 判断Session是否过期 过期则返回登录页
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "")
    public String login(HttpServletRequest request) {
            return "login";

    }



}
