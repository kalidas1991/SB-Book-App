package in.com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.com.app.model.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		ModelAndView mav = new ModelAndView();
		Book bookObj = new Book(101, "Spring", 400.50);
		mav.addObject("book", bookObj);
		mav.setViewName("bookView");
		return mav;
	}
}
