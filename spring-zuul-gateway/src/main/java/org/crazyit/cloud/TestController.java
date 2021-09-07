package org.crazyit.cloud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/source/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable("name") String name) {
		return "hello " + name;
	}
}
