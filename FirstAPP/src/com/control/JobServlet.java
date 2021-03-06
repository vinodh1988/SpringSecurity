package com.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.JobsDAO;
import com.model.Jobs;

/**
 * Servlet implementation class JobServlet
 */
@WebServlet("/jobs.htm")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Jobs> l=JobsDAO.getJobs();
		request.setAttribute("jlist",l);
		RequestDispatcher rd=request.getRequestDispatcher("jobs1.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Jobs j=new Jobs();
		j.setJob_id(request.getParameter("job_id"));
		j.setJob_title(request.getParameter("job_title"));
		j.setMin_salary(Integer.parseInt(request.getParameter("min_salary")));
		j.setMax_salary(Integer.parseInt(request.getParameter("max_salary")));
		
		if(JobsDAO.insertJob(j))
			response.sendRedirect("home.html");
		else
			response.sendRedirect("error.jsp");
	}

}
