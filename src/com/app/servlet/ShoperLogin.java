package com.app.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dbconnection.DBConnection;
import com.app.impl.Implementation;
import com.app.model.CustomerRegisterBean;
import com.app.myinterface.MyInterface;

/**
 * Servlet implementation class ShoperLogin
 */
@WebServlet("/ShoperLogin")
public class ShoperLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoperLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("password");
		PreparedStatement ps=null;
		ResultSet rs=null;
		Connection con=null;
		
		CustomerRegisterBean crb=new CustomerRegisterBean();
		crb.setEmailid(uname);
		crb.setPassword(pwd);
		
		
		MyInterface in=new Implementation();
		int status=in.ShoperLogin(crb);
		if(status==1) {
			response.sendRedirect("display_customerDetails.jsp");
		}else {
			response.sendRedirect("register.html");
		}
		
		
		
		
		
				
		
	}

}
