package com.test;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", "hello world");
		return model;
	}
	
	@ResponseBody
	@RequestMapping(value="/country",method = RequestMethod.GET)
	public ArrayList<Country> getCountryList() {
		Country country1 = new Country();
		country1.setCountryName("Pakistan");
		country1.setTotalNoOfCases("237K");

		Country country2 = new Country();
		country2.setCountryName("Kyrgyztan");
		country2.setTotalNoOfCases("9K");

		ArrayList<Country> countryList = new ArrayList<>();
		countryList.add(country1);
		countryList.add(country2);

		return countryList;

	}
}
