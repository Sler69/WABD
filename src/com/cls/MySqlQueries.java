package com.cls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.CoachUsuario;
import com.model.Usuarios;
import com.model.Workout;

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
		
		public List<CoachUsuario> CoachUser(int userId) throws Exception{
			   try {
				   	  List<CoachUsuario> coaches = new ArrayList<CoachUsuario>();	
				   	  PreparedStatement ps = null;
				   	  String sqlQuery = "SELECT c.apellido,c.horario, c.Nombre , u.nombre FROM Usuario AS u JOIN Coach AS c ON c.id_coach = u.id_coach WHERE u.idUsuario = "+ userId ;
				      Class.forName("com.mysql.jdbc.Driver");
				      
				      connect = DriverManager.getConnection(host,user,passwd);

				      ps = connect.prepareStatement(sqlQuery);
				     resultSet = ps.executeQuery();
				     	
				     while(resultSet.next()){
				    	 CoachUsuario newCoach = new CoachUsuario();
				    	 newCoach.setStrNombre(resultSet.getString("Nombre"));
				    	 newCoach.setStrNombreUser(resultSet.getString("nombre"));
				    	 newCoach.setStrApellido(resultSet.getString("apellido"));
				    	 newCoach.setStrHorario(resultSet.getString("horario"));
				    	 System.out.println(newCoach.getStrNombre() + newCoach.getStrApellido() );
				    	 coaches.add(newCoach);
				     }
				     return coaches;
			   } catch (Exception e) {
				      throw e;
				    } finally {
				      close();
				    } 
		}
		
		public void NewUser(Usuarios newUser)throws Exception{
			   try {
				   	  PreparedStatement ps = null;
				   	  
				   	  
				   	  
				   	  String sqlQuery = "insert into usuario (idUsuario,nombre,apellido,fecha_nacimiento,altura,peso,complexion,id_coach)"+
			   			  			"values("+newUser.getIdUsuario()+",'"+newUser.getNombre()+"','"+ newUser.getApellido()+
			   			  			"','"+newUser.getFechaNacimiento()+"',"+ newUser.getAltura()+","+newUser.getPeso()+
			   			  			",'"+ newUser.getComplexion()+"',"+newUser.getIdCoach() +");";
				      Class.forName("com.mysql.jdbc.Driver");
				      
				      connect = DriverManager.getConnection(host,user,passwd);

				      ps = connect.prepareStatement(sqlQuery);
				      ps.executeUpdate();
				      
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
		
		public List<Workout> WorkOuts(int userId)throws Exception{
			try {
				  List<Workout> workouts = new ArrayList<Workout>();
			   	  PreparedStatement ps = null;
			   	  
			   	  String sqlQuery = "SELECT u.nombre,ru.descripcion,e.tipo,e.medicion,e.reps FROM usuario AS u JOIN Rutina_usuario AS ru ON ru.id_usuario = u.idUsuario JOIN Rutina_ejercicio AS re ON re.id_rutina = ru.id_rutina JOIN Ejercicio_tipo AS e ON e.id_ejercicio = re.id_ejercicio WHERE u.idUsuario = " + userId;
			   		    
			      Class.forName("com.mysql.jdbc.Driver");
			      
			      connect = DriverManager.getConnection(host,user,passwd);

			      ps = connect.prepareStatement(sqlQuery);
			      resultSet = ps.executeQuery();
			      
			      while(resultSet.next()){
			    	  Workout newWorkout = new Workout();
			    	  newWorkout.setNombre(resultSet.getString("nombre"));
			    	  newWorkout.setStrDescripcion(resultSet.getString("descripcion"));
			    	  newWorkout.setStrWorkout(resultSet.getString("tipo"));
			    	  newWorkout.setIntReps(resultSet.getInt("reps"));
			    	  newWorkout.setIntSets(resultSet.getInt("medicion"));
			    	  
			    	  workouts.add(newWorkout);
			      }
			      
			      return workouts; 
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
