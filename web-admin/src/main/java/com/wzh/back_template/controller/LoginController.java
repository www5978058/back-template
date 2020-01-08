package com.wzh.back_template.controller;

import com.wzh.back_template.constant.WebConstant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author wzh
 * @date 2020/1/6 - 14:37
 */
@Controller
public class LoginController {

    @GetMapping(value = {"","/login"})
    public String index(HttpSession session) {
        if (session.getAttribute(WebConstant.SESSION_USER) != null) {
            return "redirect:main";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(String email, String password, String remember, Model model, HttpSession session) {
        if("zhangsan".equals(email) && "123".equals(password)){
            session.setAttribute(WebConstant.SESSION_USER, email);
            return "redirect:main";
        }
        model.addAttribute("message", "用户名或密码错误");
        return "login";

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
