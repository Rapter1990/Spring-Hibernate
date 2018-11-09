package com.germiyanoglu.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// http://localhost:8091/019_PathVariable/gida1
	@RequestMapping(value = "/gida1", method = RequestMethod.GET)
	public String anaSayfaView(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("mesaj1", "Selam" );
		model.addAttribute("mesaj2", "GIDA" );
		model.addAttribute("mesaj3", "1" );
		
		return "anaSayfaView";
	}
	
	// http://localhost:8091/019_PathVariable/gida2
	@RequestMapping(value = "/gida2", method = RequestMethod.GET)
	public ModelAndView home2(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modelAndView = new ModelAndView("anaSayfaView");
		
		modelAndView.addObject("mesaj1", "Selam" );
		modelAndView.addObject("mesaj2", "GIDA" );
		modelAndView.addObject("mesaj3", "2" );
		
		return modelAndView;
	}
	
	// http://localhost:8091/019_PathVariable/giyim
	// Path Variabale -> value dan sonraki {} deðeri PathVariable olarak tanýmlama
	@RequestMapping(value = "/giyim/{sonuc}", method = RequestMethod.GET)
	public ModelAndView giyim(Locale locale, @PathVariable("sonuc") String gelenDeger) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modelAndView = new ModelAndView("anaSayfaView");
		
		modelAndView.addObject("mesaj1", "Selam" );
		modelAndView.addObject("mesaj2", "Giyim" );
		modelAndView.addObject("mesaj3", gelenDeger);
		
		return modelAndView;
	}
		
	// http://localhost:8091/019_PathVariable/giyim/kislik/etek
	@RequestMapping(value = "/giyim/{analiz}/{sonuc}", method = RequestMethod.GET)
	public ModelAndView giyimKislikEtek(Locale locale 
			, @PathVariable("analiz") String analizDeger 
			, @PathVariable("sonuc") String sonucDeger) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modelAndView = new ModelAndView("anaSayfaView");
		
		modelAndView.addObject("mesaj1", "Selam" );
		modelAndView.addObject("mesaj2", analizDeger);
		modelAndView.addObject("mesaj3", sonucDeger);
		
		return modelAndView;
	}
	
}
