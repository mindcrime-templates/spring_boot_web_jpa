package org.fogbeam.template.spring.spring_boot_web_jpa.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping( "/api" )
public class ExampleRestController 
{
	private static final Logger logger = LoggerFactory.getLogger(ExampleRestController.class );
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping( path="/nop" )
	public ResponseEntity<String> noOp()
	{
		return ResponseEntity.ok( "NOP" );
	}
	
	@GetMapping( path= {"/env/{var}", "/env"}, produces="application/json" )
	public ResponseEntity<Map> getEnv( @PathVariable(name="var", required=false) final String varName )
	{
		Map output = new HashMap();
		
		if( varName == null || varName.isEmpty() )
		{
			output.putAll( System.getenv() );
		}
		else
		{
			String value = System.getenv(varName);
			output.put( varName, value);
		}
		
		return ResponseEntity.ok(output);
	}
}
