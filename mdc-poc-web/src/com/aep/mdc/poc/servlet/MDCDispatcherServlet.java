package com.aep.mdc.poc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MDCDispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = -8052800086680580848L;
	private static Logger logger = LoggerFactory.getLogger(MDCDispatcherServlet.class);
	private RequestDispatcher dispatcher = null;

	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		logger.info("MDCDispatcherServlet.init started");

	}

	private void executeRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String serviceName = req.getParameter("service");
		logger.info("Called Service : "+serviceName);
		if ("first".equals(serviceName))
			dispatcher = getServletContext().getRequestDispatcher("/FirstServlet");
		else if ("second".equals(serviceName))
			dispatcher = getServletContext().getRequestDispatcher("/SecondService");

		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		executeRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		executeRequest(req, resp);
	}

	public void destroy() {
		super.destroy();
	}
}
