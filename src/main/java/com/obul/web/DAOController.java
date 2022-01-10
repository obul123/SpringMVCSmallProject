package com.obul.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DAOController {

	static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// String sq="select *from student";
			con = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@PostMapping("/signup")
	ModelAndView signup(HttpServletRequest req, HttpServletResponse res)
			throws SQLException, IOException, InterruptedException {
		// System.out.println("method Static" + a);
		int val = 0;
		String fname = req.getParameter("fname");
		String sname = req.getParameter("sname");
		String mobile = req.getParameter("mobile");
		String mail = req.getParameter("mailid");
		String gender = req.getParameter("gen");
		String pass = req.getParameter("pass");
		String pass1 = req.getParameter("passagain");
		
		String query = "insert into person values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, fname);
		ps.setString(2, sname);
//		ps.setlo
		ps.setString(3, mobile);
		ps.setString(4, mail);
		ps.setString(5, gender);
		ps.setString(6, pass);

		if (pass.equals(pass1)) {
			val = ps.executeUpdate();
		}
		PrintWriter pw = res.getWriter();
		ModelAndView mav = new ModelAndView();
		if (val == 1) {
//			pw.println("Registered Suc5cessfully");
//			Thread.sleep(5000);
//			res.sendRedirect("index.jsp");
			mav.setViewName("index.jsp");
		} else {
//			pw.println("Not registered");
//			Thread.sleep(5000);
//			res.sendRedirect("signup.jsp");
			System.out.println("Signup   ");
			mav.setViewName("signup.jsp");
		}
		// System.out.println(val);
		// res.sendRedirect("index");
		return mav;

	}

	@PostMapping("/login")
	public String loginpage(HttpServletRequest req, HttpServletResponse res) throws IOException, SQLException {
		String uname = req.getParameter("num1");
		String pass = req.getParameter("num2");
		String query = "select *from person where email=? and password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, uname);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			PrintWriter pw = res.getWriter();
			pw.print("Thaggede lee");
		} else {
			//System.out.println("YYYY " + uname + " " + pass);
			res.sendRedirect("index.jsp");
		}
		return null;
	}

}
