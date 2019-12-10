import java.sql.*;

public class Connectit {
	public static void tryit() {
		 System.out.println("-------- MySQL JDBC Connection Demo ------------");
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	        } 
	        catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found !!");
	            return;
	        }
	        System.out.println("MySQL JDBC Driver Registered!");
	        Connection connection = null;
	        String url="jdbc:mysql://localhost:3306/ticket_me";
	        try {
	            connection = DriverManager
	                .getConnection(url, "root", "");
	            System.out.println("SQL Connection to database established!");
	 
	        } catch (SQLException e) {
	            System.out.println("Connection Failed! Check output console");
	            return;
	        } finally {
	            try
	            {
	                if(connection != null)
	                    connection.close();
	                System.out.println("Connection closed !!");
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}


	/*static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://http://localhost/"
	   		+ "phpmyadmin/sql.php?server=1&db=poi&table=poi&pos=0";
	   
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";
	   
	  
	   
	   public static void tryit() {
		   
		   Connection conn = null;
		   Statement stmt = null;
	   
		   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "SELECT id, name, address, category FROM poi";
			      ResultSet rs = stmt.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			         int id  = rs.getInt("id");
			         String name = rs.getString("name");
			         String address = rs.getString("address");
			         String category = rs.getString("category");
	   }
			      //STEP 6: Clean-up environment
			      rs.close();
			      stmt.close();
			      conn.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
				   //finally block used to close resources
				      try{
				         if(stmt!=null)
				            stmt.close();
				      }catch(SQLException se2){
				      }// nothing we can do
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
				}//end main
				}//end FirstExample*/
	
			   
	   


