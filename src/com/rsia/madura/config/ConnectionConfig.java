package com.rsia.madura.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.sql.*;

@WebServlet("/Test")
public class ConnectionConfig extends HttpServlet{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String user = "postgres";
		String pass = "postgre";
		String jdbcURL = "jdbc:postgresql://localhost:5433/rsia_hikmah";
		
		String driverDB = "org.postgresql.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Try to connect " + jdbcURL);
			
			Class.forName(driverDB);
			
			Connection conn = DriverManager.getConnection(jdbcURL, user, pass);
			
			out.println("Succes");
			
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
	
	
}
