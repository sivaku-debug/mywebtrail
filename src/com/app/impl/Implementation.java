package com.app.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.dbconnection.DBConnection;
import com.app.model.CustomerRegisterBean;
import com.app.myinterface.MyInterface;

public class Implementation implements MyInterface{

	PreparedStatement ps1,ps2,ps3,ps4,ps5=null;
	ResultSet rs1,rs2,rs3,rs4,rs5=null;
	Connection con=null;
	
	@Override
	public int userRegister(CustomerRegisterBean crb) {
		int i=0;
		try {
			//private String username,emailid,password,phno,dob,gender,address,ok;
			con=DBConnection.con();
			System.out.println("imple");
		 ps1=con.prepareStatement("insert into customer_regi(username,emailid,password,phno,dob,gender,address,ok) values(?,?,?,?,?,?,?,?)");
				 ps1.setString(1, crb.getUsername());	
				 ps1.setString(2, crb.getEmailid());
				 System.out.println(crb.getEmailid());
		 ps1.setString(3, crb.getPassword());
		 ps1.setString(4, crb.getPhno());
		 ps1.setString(5, crb.getDob());
		 ps1.setString(6, crb.getGender());
		 ps1.setString(7, crb.getAddress());
		 ps1.setString(8, crb.getOk());
		i= ps1.executeUpdate();
		 if(i==1) {
			System.out.println("data inserted sucessfully"); 
		 }else {
			 System.out.println("not inserted");
		 }
		 
			}catch (Exception e) {
			e.printStackTrace();
			
		}
		return i;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ShoperLogin(CustomerRegisterBean crb) {
		int i=0;
		String sname=null;
		int sid;
		String emailid=crb.getEmailid();
				String pwd=crb.getPassword();
		
		try {
			con=DBConnection.con();
			ps2=con.prepareStatement("select * from customer_regi where emailid='"+emailid+"' and password='"+pwd+"' ");
		rs1=	ps2.executeQuery();
		
		while(rs1.next()) {
			
			sid=rs1.getInt(1);
			sname=rs1.getString(2);
			String dbemailid=rs1.getString(3);
			String dbpwd=rs1.getString(4);
		
			crb.setId(sid);
			crb.setUsername(sname);
			
			if(emailid.equals(dbemailid) && pwd.equals(dbpwd)) {
				i=1;
				
			}else {
				i=0;
			}
			
			
			System.out.println("id:"+sid);
			System.out.println("sname:"+sname);
			System.out.println("dbemailid:"+dbemailid);
			System.out.println("dbpwd:"+dbpwd);
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
			return i;
	}	

}
