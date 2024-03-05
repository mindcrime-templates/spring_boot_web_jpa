package org.fogbeam.template.spring.spring_boot_web_jpa.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.fogbeam.template.spring.spring_boot_web_jpa.dto.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleWebController 
{
	@RequestMapping( "/" )
	public String home( Map<String, Object> model )
	{
		model.put("message", "The current date and time is " + new Date() );
		
		List<Account> accounts = new ArrayList<Account>();
		
		Account acct1 = new Account( "axq3g9", "Phillip Rhodes", "mindcrime" );
		Account acct2 = new Account( "gxl11a", "John Doe", "jldoe" );
		Account acct3 = new Account( "br549x", "Jane Doe", "jzdoe" );
		
		accounts.add(acct1);
		accounts.add(acct2);
		accounts.add(acct3);
		
		model.put( "accounts", accounts );
		
		return "index";
	}
}
