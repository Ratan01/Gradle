package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.controller.SimpleController;

class TestSimpleController {

	@Test
	void test() {
		SimpleController sic=new SimpleController();
		String s=sic.greet();
		assertEquals("welcom back", s);
	}

}
