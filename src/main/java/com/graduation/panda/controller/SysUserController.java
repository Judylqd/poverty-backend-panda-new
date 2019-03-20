package com.graduation.panda.controller;

import com.graduation.panda.model.SysUserToken;
import com.graduation.panda.service.SysUserTokenService;
import com.graduation.panda.utils.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SysUserController {
    @Autowired
    SysUserTokenService tokenService;

    /**
     * 赋给主页登录信息
     * @param request
     * @return
     */
    @PostMapping("/userInfo")
    @ResponseBody
    public HttpResult getUserInfo(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie c :cookies){
            if(c.getName() != null && c.getName().equals("token")){
                SysUserToken userToken = tokenService.findByToken(c.getValue());
                if(userToken == null){
                    return HttpResult.ok("token已经过期");
                }
                return HttpResult.ok(userToken);
            }
        }
        return HttpResult.ok("token不存在");
    }
}
