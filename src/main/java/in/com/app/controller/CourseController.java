package in.com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	@GetMapping("/course")
	public ModelAndView getCourseFee(@RequestParam String name) {
		String msgTxt = null;
		ModelAndView mav = new ModelAndView();
		if (name.equals("JAVA")) {
			msgTxt = "JAVA Course fee is 8000 INR";
		} else if (name.equals("PHP")) {
			msgTxt = "PHP Course fee is 3000 INR";
		} else {
			msgTxt = "Please contact Admin team for more information !!!!";
		}
		mav.addObject("msg", msgTxt);
		mav.setViewName("courseView");
		return mav;

	}

}
