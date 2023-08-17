package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/mybatis_jpa",method=RequestMethod.GET) //GET으로 접근하는 매핑주소 처리, mybatis_jpa 매핑주소 등록
	public void jpa_mybatus_test(Model m) {
		//반환 타입리 없는 void형이면 매핑주소가 뷰페이지 파일명이 된다. 뷰리졸브 경로는 /WEB-INF/views/mybatis_jpa.jsp
		
		m.addAttribute("content_title","mybatis_jpa와 이름,주소 폼 연동 연습");
	}
}
