package com.cls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Usuarios;

public class MySqlQueries {
	  private Connection connect = null;
	  private Statement statement = null;
	  private ResultSet resultSet = null;

	  final private String host = "jdbc:mysql://localhost/bi1";
	  final private String user ="root";
	  final private String passwd = "compadre69";
	  
	  public MySqlQueries(){
		  
	  }
	  
	  //Method for users
		public List<Usuarios> readUsers() throws Exception {
			List<Usuarios> lstUsuarios = new ArrayList<Usuarios>();
		    try {
		    	
		      PreparedStatement ps = null;
		      String sqlQuery = "select * from usuario";
		    	
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      connect = DriverManager.getConnection(host,user,passwd);

		      /*
		      statement = connect.createStatement();		      
		      resultSet = statement.executeQuery("select * from usuario");
			  */
		      
		      ps = connect.prepareStatement(sqlQuery);
			  resultSet = ps.executeQuery();
		      
			  while(resultSet.next()){
		    	  Usuarios postUsuario = new Usuarios();

		    	  	postUsuario.setIdUsuario(resultSet.getInt("idUsuario"));
		    	  	postUsuario.setAltura(resultSet.getInt("altura"));
		    	  	postUsuario.setPeso(resultSet.getInt("peso"));
		    	  	postUsuario.setNombre(resultSet.getString("nombre"));
		    	  	postUsuario.setApellido(resultSet.getString("apellido"));
		    	  	postUsuario.setComplexion(resultSet.getString("complexion"));
		    	  	postUsuario.setIdCoach(resultSet.getInt("id_coach"));
		    	  	postUsuario.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toString());
		            lstUsuarios.add(postUsuario);
		            System.out.println(postUsuario.getIdUsuario() + " "+postUsuario.getNombre() +" "+ postUsuario.getApellido());
		      }
		       return lstUsuarios;

		    } catch (Exception e) {
		      throw e;
		    } finally {
		      close();
		    }

		  }
		
		public void CoachUser() throws Exception{
			   try {
				   	  PreparedStatement ps = null;
				   	  String sqlQuery = "";
				      Class.forName("com.mysql.jdbc.Driver");
				      
				      connect = DriverManager.getConnection(host,user,passwd);

				      ps = connect.prepareStatement(sqlQuery);
				     resultSet = ps.executeQuery();
				      
				      /*
				      statement = connect.createStatement();
				      resultSet = statement.executeQuery("select * from usuario");
						*/
				     
			   } catch (Exception e) {
				      throw e;
				    } finally {
				      close();
				    } 
		}	
		
		
		 private void close() {
			    try {
			      if (resultSet != null) {
			        resultSet.close();
			      }

			      if (statement != null) {
			        statement.close();
			      }

			      if (connect != null) {
			        connect.close();
			      }
			    } catch (Exception e) {

			    }
			  }
		
}
