package com.vn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean check = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		check = checkLogin();
		if (check) {
//TODO
		} else {
			request.setAttribute("msg", "Username or Password incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		System.out.println(username);
		System.out.println(password);

	}
	//TODO fake
	private boolean checkLogin() {
		return false;
	}
}
