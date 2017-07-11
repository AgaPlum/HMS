package com.tcs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tcs.dao.*;
import com.tcs.bean.*;

import java.sql.SQLException;
import java.util.*;
/**
 * Servlet implementation class ItemControl
 */
@WebServlet("/LogControl")
public class LogControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao ida=new UserDao();
	private User item=new User();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    PrintWriter out=response.getWriter();		
			String name=request.getParameter("name");
			String uname=request.getParameter("uname").toLowerCase();
			String email=request.getParameter("mail").toLowerCase();
			String a= request.getParameter("admin");
			String connum= request.getParameter("connum");
			String pass1=request.getParameter("pass1");
			String pass2=request.getParameter("pass2");
			try {
				if(ida.checkUserName(item, uname)==1)
				{
					 out.println("<script type=\"text/javascript\">");
					 out.println("alert('User Name is already exist');");
					 out.println("location.pathname = '"+request.getContextPath()+"/JSP/newUser_page.jsp"+"';");
					 out.println("</script>");
				}
				else if(ida.checkMail(item, email)==1)
				{
					 out.println("<script type=\"text/javascript\">");
					 out.println("alert('Email is already exist');");
					 out.println("location.pathname = '"+request.getContextPath()+"/JSP/newUser_page.jsp"+"';");
					 out.println("</script>");
				}
				else{			
					if (!pass1.equals(pass2))
					{
						out.println("<script type=\"text/javascript\">");
						out.println("alert('Password incorrect');");
						out.println("location.pathname = '"+request.getContextPath()+"/JSP/newUser_page.jsp"+"';");
						out.println("</script>");
					}
				
					else
					{
						int admin=0;
							if(a.equals("Yes"))
							{
								admin=1;
							}
							else if(a.equals("No"))
							{
								admin=0;
							}
						User item=new User();
						item.setName(name);
						item.setUsername(uname);
						item.setEmail(email);
						item.setIsAdmin(admin);
						item.setContactNumber(connum);
						item.setPassword(pass1);
						try 
						{
							ida.addUser(item);
							response.sendRedirect(request.getContextPath()+"/JSP/log_page.jsp");
						} 
						catch (SQLException e) 
						{
							e.printStackTrace();
						}
					}
					}
				} 
				catch (SQLException e) 
				{
				e.printStackTrace();
				}				
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		ArrayList<User> userList=new ArrayList<User>();
		PrintWriter out=response.getWriter();
		//String path=request.getContextPath()+"/JSP/log_page.jsp";
		int iduser=0;
		if("logIn".equals(action))
		{
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			item.setUsername(uname);
			item.setPassword(pass);
			
			try {
					iduser=ida.checkUser(item, uname, pass);
					if(iduser>0)
					{
					userList=ida.selectUser(item, iduser);
					for(User i:userList)
					{
					out.println(i.getUsername());
					}
					}
					else
					{
							 out.println("<script type=\"text/javascript\">");
							 out.println("alert('Password or User Name is incorrect');");
							 out.println("location.pathname = '"+request.getContextPath()+"/JSP/log_page.jsp"+"';");
							 out.println("</script>");
					}
				}
			catch (SQLException e) 
				{
					e.printStackTrace();
				}
		}
	}

}
