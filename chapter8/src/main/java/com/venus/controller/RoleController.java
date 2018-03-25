package com.venus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.venus.po.RoleBean;
import com.venus.service.RoleService;

import javax.annotation.Resource;

/**
 * Created by destiny on 2018/3/25.
 */
@Controller
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping("/role/getRole")
    @ResponseBody
    public RoleBean getRole(@RequestParam("id") int id) {
        RoleBean roleBean = roleService.getRole(id);
        System.out.println(roleBean);
        return roleBean;
    }

}
