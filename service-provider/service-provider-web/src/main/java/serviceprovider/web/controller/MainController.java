package serviceprovider.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController extends BaseController {

	@RequestMapping(value = "/homepage")
	public Object showMainPage() {
		ModelAndView modelAndView = createModelAndView(Model.HOMEPAGE);
		return finalizeControllerReturn(modelAndView);
	}

	@RequestMapping(value = "/authenticate")
	public Object showAuthenticationPage() {
		ModelAndView modelAndView = createModelAndView(Model.MAIN_AUTHENTICATION_PAGE);
		return finalizeControllerReturn(modelAndView);
	}

}
