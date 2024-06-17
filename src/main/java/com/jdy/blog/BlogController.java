package com.jdy.blog;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jdy.blog.dto.MemberDto;

@Controller
public class BlogController {
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "user/test01")
	public String test01() {
		return "sample01";
	}
	
	@RequestMapping(value = "/member")
	public String member (Model model) {
		model.addAttribute("mname", "이순신");
		return "user/member";
	}
	
	@RequestMapping(value = "/user/test02")
	public String test02() {
		return "sample02";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	// @RequestMapping(value = "/loginOk")
	// public String loginOk(HttpServletRequest request, Model model) {
		
	//  String mid = request.getParameter("memberid");
	//	String mpw = request.getParameter("memberpw");
		
	//	model.addAttribute("loginid", mid);
	//	model.addAttribute("loginpw", mpw);
	//	model.addAttribute("user", "홍길동");
			
	//	return "loginOk";
	//}
	
//	@RequestMapping(value = "/loginOk")
//	public ModelAndView loginOk(HttpServletRequest request, ModelAndView mv) {
//		
//		String mid = request.getParameter("memberid");
//		String mpw = request.getParameter("memberpw");
//		
//		mv.addObject("loginid", mid);
//		mv.addObject("loginpw", mpw);
//		mv.addObject("user", "홍길동");
//		mv.setViewName("loginOk");
//			
//		return mv;
//	}
	@RequestMapping(value = "/loginOk")
	public String loginOk(@RequestParam("memberid") String mid, @RequestParam("memberpw") String mpw, Model model) {
		
	// String mid = request.getParameter("memberid");
	// String mpw = request.getParameter("memberpw");
		
	model.addAttribute("loginid", mid);
	model.addAttribute("loginpw", mpw);
	model.addAttribute("user", "홍길동");
			
	return "loginOk";
	}
	
	@RequestMapping(value="/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		String mid = request.getParameter("memberid");
		String mpw = request.getParameter("memberpw");
		String mname = request.getParameter("membername");
		String mage = request.getParameter("memberage");
		String memail = request.getParameter("memberemail");
		
		MemberDto memberDto = new MemberDto(mid, mpw, mname, mage, memail);
		
//		model.addAttribute("mid", mid);
//		model.addAttribute("mpw", mpw);
//		model.addAttribute("mname", mname);
//		model.addAttribute("mage", mage);
//		model.addAttribute("memail", memail);
		
		model.addAttribute("mdto", memberDto);
		
		return "joinOk";
	}
	
	
	
}
