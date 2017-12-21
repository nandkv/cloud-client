package com.nand.cloudclient.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerUnitTest {
	private AccountController subject;

	@Before
	public void setup() {
		subject = new AccountController("test");
	}

	@Test
	public void testGetServiceName() throws Exception {
		Model m = new ExtendedModelMap();
		assertThat(subject.getName(m)).isEqualTo("test");
	}

}
