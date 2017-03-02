package com.cls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlQueries {
	  private Connection connect = null;
	  private Statement statement = null;
	  private ResultSet resultSet = null;

	  final private String host = "jdbc:mysql://localhost/bi1";
	  final private String user ="root";
	  final private String passwd = "compadre69";
	  
	  public MySqlQueries(){
		  
	  }
	  
	  
		public String readUsers() throws Exception {
		    try {

		      Class.forName("com.mysql.jdbc.Driver");
		      
		      connect = DriverManager.getConnection(host,user,passwd);


		      statement = connect.createStatement();
		      
		      resultSet = statement.executeQuery("select * from usuario");

		      String varOutput = "";
		      while(resultSet.next()){
		    	  varOutput = varOutput.concat(resultSet.getString("idUsuario")+" "+ resultSet.getString("nombre")+ "\n");
		      }
		       return varOutput;

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
