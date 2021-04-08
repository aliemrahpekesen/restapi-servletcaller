package com.aep.mdc.poc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartUpServlet extends HttpServlet {

	private static final long serialVersionUID = 8115556271582610006L;
	private static Logger logger = LoggerFactory.getLogger(StartUpServlet.class);

	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		logger.info("StartUpServlet.init started");

	}

	public void destroy() {
		super.destroy();
	}

}