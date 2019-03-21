package com.biz.sp007;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	// RequestMapping에 단순히 문자열만 setting하면 
	// request하는 방식이 GET이거나 POST이거나 상관없이 작동되어라 하는 설정.
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	// 반드시 return값이 String이어야함.
	// calc_form을 웹브라우저에 보여주도록 세팅을 해주는것.
	// method-...GET이라고 setting을 하면 request하는 방식이
	// GET일 경우에만 작동되어라 하는 설정.
	// Request가 GET인 경우 : 브라우저 주소창에 직접 입력을 하고 
	// 						Enter를 눌렀을 경우가 해당
	@RequestMapping("/")
	public String calc() {
		return "calc_form";
	}
	
}
