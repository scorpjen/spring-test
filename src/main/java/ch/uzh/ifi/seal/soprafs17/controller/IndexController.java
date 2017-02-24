package ch.uzh.ifi.seal.soprafs17.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value="/")
	@ResponseBody
	public String index() {
		return "Let's start SoPra 2017!";
	}
}
