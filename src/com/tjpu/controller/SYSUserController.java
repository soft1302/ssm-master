package com.tjpu.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjpu.pojo.Sysuser;
import com.tjpu.service.SYSUserService;
import com.tjpu.util.BaseController;
import com.tjpu.util.JSONUtils;

@Controller
@Scope(value = "prototype")
public class SYSUserController extends BaseController {
	@Resource(name = "sysUserService")
	private SYSUserService sysUserService;

	@RequestMapping(value = "/getSYSUserById", method = RequestMethod.GET)
	public void getSYSUserById(@RequestParam(value = "id", required = true) int id, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		Sysuser sysUser = sysUserService.getSYSUserById(id);
		writeStringToResponse(response, JSONUtils.objectToJsonString(sysUser));
	}

	@RequestMapping(value = "/insertSYSUser", method = RequestMethod.POST)
	public void insertSYSUser(Sysuser sysUser, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		int result = sysUserService.insertSYSUser(sysUser);
		writeStringToResponse(response, result + "");
	}
}
