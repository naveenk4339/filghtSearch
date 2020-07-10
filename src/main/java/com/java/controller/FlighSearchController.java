package com.java.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.model.ModalData;
import com.java.service.FlightService;

@Controller
public class FlighSearchController {

	@Autowired
	private FlightService flightService;
	
	
	//private List<ModalData> test = flightService.getAvaliableFlightList();
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index(Model model, ModalData data) {
		
	ModelAndView mav = new ModelAndView();
    //mav.addObject("message","Hello from spring MVC");
	List<String> empList = new ArrayList<>();
	empList.add("Atul");
	empList.add("Abhinav");
	empList.add("Prince");
	empList.add("Gaurav");
	
	 List<ModalData> test = new ArrayList<>(Arrays.asList(
			new ModalData("2005", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Airbus A320",
					"925", "02:47", "Arrived at Gate")));
	mav.addObject("mav",empList);
	mav.setViewName("index");
	System.out.println(mav);
	return mav;
	}
	
	/*
	 * @RequestMapping(value="/",method = RequestMethod.GET) public String
	 * getFlightDetails(@RequestParam("flightNumber") String
	 * fightNumber,@RequestParam("arrivalTime") String arrivalTime , Model model) {
	 * 
	 * System.out.println(fightNumber); ModalData data=
	 * flightService.getFlightDetails(fightNumber, arrivalTime);
	 * 
	 * return "index"; }
	 */

	/*
	 * @RequestMapping("/flightInfo/{origin}/{destination}/{date}") public ModalData
	 * getFlightDetailsByOrigin(@PathVariable String origin, @PathVariable String
	 * destination,
	 * 
	 * @PathVariable String date) {
	 * 
	 * return flightService.getFlightDetailsByOrigin(origin, destination, date); }
	 */
}
