package com.serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cls.MySqlQueries;
import com.model.CoachUsuario;
import com.model.Workout;

/**
 * Servlet implementation class CoachUserServlet
 */
@WebServlet("/CoachUserServlet")
public class CoachUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoachUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int userId =Integer.parseInt(request.getParameter("field1"));
		MySqlQueries sql = new MySqlQueries();
		List<CoachUsuario> coaches = new ArrayList<CoachUsuario>();
		try {
			coaches = sql.CoachUser(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("coaches", coaches);
		
		request.getRequestDispatcher("/CoachList.jsp").forward(request, response);
		
	}

}
