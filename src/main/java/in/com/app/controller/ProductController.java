package in.com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@GetMapping("/product/{pid}")
	public ModelAndView getProductPrice(@PathVariable("pid") Integer productId) {
		String msgTxt = null;
		ModelAndView mav = new ModelAndView();
		if (productId == 101) {
			msgTxt = "Product price is 70000 INR";
		} else if (productId == 102) {
			msgTxt = "Product price is 80000 INR";

		} else {
			msgTxt = "Product is not available, Please contact Inventory Management team";
		}

		mav.addObject("msg", msgTxt);
		mav.setViewName("productView");
		return mav;

	}
}
