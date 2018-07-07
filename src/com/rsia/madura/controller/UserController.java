package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.MUser;
import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MRole;
import com.rsia.madura.service.UserService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.RoleService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PegawaiService pegawaiService;

	private String uri ="redirect: /user";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model,
			@RequestParam(value="page", required=false, defaultValue="1") int page,
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {
				
		List<MUser> users = userService.getUsers(page, limit);
		String link = userService.createLinks(page, limit);
		MUser userModel = new MUser();
		List<MPegawai> pegawais = pegawaiService.getPegawai();
		List<MRole> roles = roleService.getRoles();

		model.addAttribute("pegawais", pegawais);
		model.addAttribute("userModel", userModel);
		model.addAttribute("users", users);
		model.addAttribute("roles", roles);
		model.addAttribute("link", link);
		// model.addAttribute("footerjs", "../user/inc/footerjs.jsp");

		return "user/index";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("userModel") MUser userModel) {
		userService.store(userModel);
		return this.uri;
	}
}