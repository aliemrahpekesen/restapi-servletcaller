package com.aep.mdc.poc.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondServlet extends HttpServlet {

	private static final long serialVersionUID = 3703292044813565674L;
	private static Logger logger = LoggerFactory.getLogger(SecondServlet.class);

	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		logger.info("SecondServlet.init started");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("FirstServlet doGet method has been invoked");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("FirstServlet doPost method has been invoked");
	}

	public void destroy() {
		super.destroy();
	}
}
