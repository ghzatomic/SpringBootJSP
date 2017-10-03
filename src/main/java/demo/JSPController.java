package demo;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

	@Inject // ou @Autowired
	private InjetadoInterface injetado;
	
	@RequestMapping("/jsptest")
	public String test(ModelAndView modelAndView) {
		injetado.salvar();
		return "teste";
	}

}