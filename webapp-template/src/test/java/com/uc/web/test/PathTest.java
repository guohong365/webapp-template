package com.uc.web.test;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class PathTest {

	@Test
	public void test(){
		System.out.println(	getClass().getResource("").getFile().toString());
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
	}

}
