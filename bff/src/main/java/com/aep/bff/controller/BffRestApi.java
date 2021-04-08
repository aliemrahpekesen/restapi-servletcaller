package com.aep.bff.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bff")
public class BffRestApi {
	
	private String rootUrl = "http://localhost:8080/mdc-poc-web/MDCDispatcherServlet";
	private static Logger logger = LoggerFactory.getLogger(BffRestApi.class);

	@GetMapping("/first")
	public void callFirstServlet() throws IOException {
		logger.info("RestApi Started to call FirstServlet from other project!");
		URL url = new URL(rootUrl + "?service=first");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int responseCode = conn.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			in.close();
		}
	}
}
