package in.com.app.controller;

import java.util.Arrays;
import java.util.List;

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
	
	@GetMapping("/books")
	public ModelAndView getBooksData() {
		ModelAndView mav = new ModelAndView();
		Book book1= new Book(101, "Spring", 400.50);
		Book book2 = new Book(102, "Java", 300.50);
		Book book3 = new Book(103, "PHP", 50);
		Book book4 = new Book(104, "Hibernate", 90.45);
		List<Book> books =  Arrays.asList(book1,book2,book3,book4);
		mav.addObject("books", books);
		mav.setViewName("booksView");
		return mav;
	}
	
	
}
