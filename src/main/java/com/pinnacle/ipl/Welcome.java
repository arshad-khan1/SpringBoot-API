package com.pinnacle.ipl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "Welcome to Pinnacle IPL Project";
	}
}
