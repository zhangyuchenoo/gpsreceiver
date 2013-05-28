package cn.lemko.gps.server;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class GpsController extends SimpleFormController {
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		return super.onSubmit(command);
	}
}
