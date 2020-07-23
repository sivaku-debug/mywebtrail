package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.impl.Implementation;
import com.app.model.CustomerRegisterBean;
import com.app.myinterface.MyInterface;


@WebServlet("/CustomerRegisterServlet")
public class CustomerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		
		
		String username=req.getParameter("username");
		String emailid=req.getParameter("emailid");
		String password=req.getParameter("password");
		String phno=req.getParameter("phno");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		String ok=req.getParameter("ok");
		
		CustomerRegisterBean crb=new CustomerRegisterBean();
		
		crb.setUsername(username);
		crb.setEmailid(emailid);
		crb.setPassword(password);
		crb.setPhno(phno);
		crb.setDob(dob);
		crb.setGender(gender);
		crb.setAddress(address);
		crb.setOk(ok);
		
		
		MyInterface in=new Implementation();
		int status=in.userRegister(crb);
		if(status==1) {
			res.sendRedirect("shoperRegisterSucc.jsp");
		}else {
			res.sendRedirect("register_fail.jsp");
		}
	}

}
