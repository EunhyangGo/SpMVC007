package com.biz.sp007;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.sp007.model.BookVO;
import com.biz.sp007.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	/*
	public BookController() {
		bookService = new BookService();
	}
	*/
	@RequestMapping(value="book", method=RequestMethod.GET)

	public String book() {
		
		return "book_form";
	}
	
	@RequestMapping(value="book1", method=RequestMethod.POST)
	public String book(Model model, String b_title, String b_auth, String b_comp, String b_price) {
		return "book_result";
	}
	
	@RequestMapping(value="book", method=RequestMethod.POST)
	public String book(Model model, 
						@ModelAttribute BookVO vo) { //modelAttribute가 하는일은 vo에 셋팅하는 일을 한다..? 
													//vo를 분석해서 home으로부터 데이터를 불러와서 알아서 해주는것. 
													//int까지 String형으로 변환도 시켜준다. 스프링 5.3이상버전부터
		vo = bookService.changeAuth(vo);
		List<BookVO> bookList = bookService.selectAll();
		model.addAttribute("BOOK",vo);
		model.addAttribute("BOOKS", bookList);
		return "book_result";
	}
	

}
