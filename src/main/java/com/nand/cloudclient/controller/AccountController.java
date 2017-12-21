package com.nand.cloudclient.controller;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RefreshScope
public class AccountController {
	private final String projectName;
	// private final ChannelProperties channelProps;
	private final Log log = LogFactory.getLog(this.getClass());

	@Inject
	public AccountController(@NotNull @Value("${configuration.projectName}") String projectName) {
		this.projectName = projectName;
		// this.channelProps = props;
	}

	@GetMapping("/")
	public ResponseEntity<String> getServiceName(Model m) {
		// log.info(channelProps.getLanguage());
		return new ResponseEntity<String>(projectName, HttpStatus.OK);
	}

	@GetMapping("/test")
	public String getName(Model m) {
		return projectName;
	}
}
