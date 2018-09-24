
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTTPGetServlet
 */
@WebServlet("/HTTPGetServlet")

public class HTTPGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HTTPGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter output;
		response.setContentType("text/html");
		output = response.getWriter();
		
		StringBuffer buf = new StringBuffer();
		buf.append("<HTML><HEAD><TITLE>\n");
		buf.append("A Simple Servlet Example\n");
		buf.append( "</TITLE></HEAD><BODY>\n" );
		buf.append( "<H1>Welcome to Servlets!</H1>\n" );
		buf.append( "</BODY></HTML>" );
		output.println( buf.toString() );
		output.close();
		
	}

	

}
