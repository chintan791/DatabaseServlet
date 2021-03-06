

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseServlet
 */
@WebServlet("/DatabaseServlet2")                    // WORKS WITH ATRIBUTE NAMES AND NOT CLASS NAMES
public class DatabaseServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Preprocess request: we actually don't need to do any business stuff, so just display JSP.
	        request.getRequestDispatcher("/input.jsp").forward(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Postprocess request: gather and validate submitted data and display the result in the same JSP.


		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql ="select * from books";
        String read= "";
        String title="";
        
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				read += "<tr><td>"+rs.getString(1)+"</td><td> "+rs.getString(2)+ "</td><td> "+rs.getString(3)+"</td><td> "+rs.getString(4)+ "</td><td> "+rs.getString(5)+"</td></tr>";
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		
		}
	

	    
	    request.setAttribute("read", read);
        request.getRequestDispatcher("/output2.jsp").forward(request, response);
    }
}




