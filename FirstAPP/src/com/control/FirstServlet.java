package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test.htm")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("First servlet destroyed");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("First Servlet initialized");
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("sessionend")!=null)
			request.getSession().invalidate();
		PrintWriter out=response.getWriter();
		out.print("<h1>Servlet responds with...."+request.getServerName()+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("user");
		name="Processed "+name;
		PrintWriter out=response.getWriter();
		out.print("<h1>User you entered is....."+name+"</h1>");
		out.print("<hr>World is small");
		
		request.setAttribute("name", name);
		RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
		
		HttpSession s=request.getSession();
	
		Integer i=(Integer)s.getAttribute("nor");
		if(i==null)
			s.setAttribute("nor", 1);

		else
		{
			s.setAttribute("nor",i+1);
		}
		
	
		
		ServletContext sc=getServletContext();
	
		Integer t=(Integer)sc.getAttribute("nor");
		if(t==null)
			sc.setAttribute("nor", 1);

		else
		{
			sc.setAttribute("nor",t+1);
		}
		
		rd.forward(request, response);
		
		//response.sendRedirect("second.jsp");
		
		
	}

}
