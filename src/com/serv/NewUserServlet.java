package com.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Usuarios;

/**
 * Servlet implementation class NewUserServlet
 */
@WebServlet("/NewUserServlet")
public class NewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserServlet() {
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
		Usuarios newUser = new Usuarios();
		String strName = request.getParameter("");
		String strLastName = request.getParameter("");
		String strDate = request.getParameter("");
		String strComplexion = request.getParameter("");
		int intWeight = Integer.parseInt(request.getParameter(""));
		int intHeight = Integer.parseInt(request.getParameter(""));
		int intIdUser = Integer.parseInt(request.getParameter(""));
		int intCoach = Integer.parseInt(request.getParameter(""));
		
		newUser.setNombre(strName);
		newUser.setApellido(strLastName);
		newUser.setFechaNacimiento(strDate);
		newUser.setComplexion(strComplexion);
		newUser.setAltura(intHeight);
		newUser.setPeso(intWeight);
		newUser.setIdCoach(intCoach);
		newUser.setIdUsuario(intIdUser);
		
		
		
	}

}
