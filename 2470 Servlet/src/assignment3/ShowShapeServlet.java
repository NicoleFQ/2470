package assignment3;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowShapeServlet
 */
@WebServlet("/ShowShapeServlet")
public class ShowShapeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message;
	String shape;
	String color;
	String bgColor;
	String fontStyle;
	int width;
	int height;
	int fontSize;
	int appWidth;
	int appHeight;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowShapeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//request.getRequestDispatcher("index.html").forward(request, response);
		
		
			PrintWriter output;
		 response.setContentType( "text/html" ); // content type
		 output = response.getWriter(); // get writer
		
		 // create and send HTML page to client
		 StringBuffer buf = new StringBuffer();
		 buf.append( "<HTML><HEAD><TITLE>\n" );
		 buf.append( "A Simple Servlet Example\n" );
		 buf.append( "</TITLE></HEAD><BODY>\n" );
		 buf.append( "<applet code=\"ShowShape.class\"  width=\"300\" height=\"150\">" );
		 buf.append( "<param name=Message value=\"" + message +"\">" );
		 buf.append( "<param name=Shape value=\"OVAL\">" );
		 buf.append( "<param name=ShapeColor value=\"blue\">" );
		 buf.append( "<param name=BGColor value=\"white\">" );
		 buf.append( "<param name=X value=\"200\">" );
		 buf.append( "<param name=Y value=\"100\">" );
		 buf.append( "<param name=FTStyle value=\"REGULAR\">" );
		 buf.append( "<param name=FTSize value=\"12\">" );
		 buf.append( "<param name=FTSize value=\"12\">" );
		 buf.append("</applet");
		 buf.append( "</BODY></HTML>" );
		 output.println( buf.toString() );
		 output.close();
		 
//		<applet code="ShowShape"  width="300" height="150">
//		<param name=Message value="+message+">
//		<param name=Shape value="OVAL">
//		<param name=ShapeColor value="blue">
		
		
		
		
		
	    
		
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.message=request.getParameter("Message");
		this.shape=request.getParameter("Shape");
		this.color=request.getParameter("Color");
		this.bgColor=request.getParameter("BGColor");
		this.width=Integer.parseInt(request.getParameter("X"));
		this.height=Integer.parseInt(request.getParameter("Y"));
		this.fontStyle=request.getParameter("FTStyle");
		this.fontSize=Integer.parseInt(request.getParameter("FTSize"));
		this.appWidth=Integer.parseInt(request.getParameter("appletWidth"));
		this.appHeight=Integer.parseInt(request.getParameter("appletHeight"));
		
		
		
		
		
		
		doGet(request, response);
	}

}
