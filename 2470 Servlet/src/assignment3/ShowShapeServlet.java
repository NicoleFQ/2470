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
	String width;
	String height;
	String fontSize;
	String appWidth;
	String appHeight;
       
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
		 
		 String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		      output.println(docType +
		         "\n" + 
		         "<!DOCTYPE html>\n" + 
		         "<html lang=\"en\">\n" + 
		         "<head>\n" + 
		         "<title>Assignment 3</title>\n" + 
		         "<meta charset=\"utf-8\">\n" + 
		         "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + 
		         "<link rel=\"stylesheet\"\n" + 
		         "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" + 
		         "<script\n" + 
		         "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" + 
		         "<script\n" + 
		         "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" + 
		         "<div class=\"col-md-12\" align=\"center\"\n" + 
		         "	style=\"background-color:black\">\n" + 
		         "	<h1 style=\"color: aliceblue\">Applet Viewer</h1>\n" + 
		         "</div>\n" + 
		         "</head>\n" + 
		         "<body>\n" + 
		         "\n" + 
		         "	<div class=\"container-fluid\">\n" + 
		         "		<div class=\"row\">\n" + 
		         "\n" + 
		         "			<div class=\"col-sm-4\" style=\"background-color: lavender;\">\n" + 
		         "				<form ACTION=ShowShapeServlet METHOD=\"POST\">\n" + 
		         "					<div class=\"form-row col-md-12\">\n" + 
		         "\n" + 
		         "\n" + 
		         "						<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "							<h3></h3>\n" + 
		         "						</div>\n" + 
		         "						<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "							<h3>\n" + 
		         "								<kbd>Applet</kbd>\n" + 
		         "							</h3>\n" + 
		         "						</div>\n" + 
		         "\n" + 
		         "						<div class=\"form-row col-md-4\" align=\"center\">\n" + 
		         "							<label for=\"width\">Width</label> <input type=\"number\"\n" + 
		         "								class=\"form-control\" id=\"appletWidth\" placeholder=\"300\" maxlength=\"3\"\n" + 
		         "								name=\"appletWidth\" min=\"1\" max=\"999\" value=\"300\">\n" + 
		         "						</div>\n" + 
		         "\n" + 
		         "						<div class=\"form-row col-md-4\" align=\"center\">\n" + 
		         "							<label for=\"height\">Height</label> <input type=\"number\"\n" + 
		         "								class=\"form-control\" id=\"appletHeight\" placeholder=\"150\" maxlength=\"3\"\n" + 
		         "								name=\"appletHeight\" min=\"1\" max=\"999\" value=\"150\">\n" + 
		         "						</div>\n" + 
		         "\n" + 
		         "						<div class=\"form-row col-xs-4\" align=\"center\">\n" + 
		         "							<label for=\"BGColor\">BGColor</label> <select id=\"BGColor\"\n" + 
		         "								class=\"form-control\" name=\"BGColor\">\n" + 
		         "								<option selected value=\"white\">White</option>\n" + 
		         "								<option value=\"red\">Red</option>\n" + 
		         "								<option value=\"black\" color=\"Black\">Black</option>\n" + 
		         "								<option value=\"blue\"><strong>Blue</strong></option>\n" + 
		         "								<option value=\"cyan\">Cyan</option>\n" + 
		         "								<option value=\"darkGray\">Dark Gray</option>\n" + 
		         "								<option value=\"gray\">Gray</option>\n" + 
		         "								<option value=\"lightGray\">Light Gray</option>\n" + 
		         "								<option value=\"green\">Green</option>\n" + 
		         "								<option value=\"magenta\">Magenta</option>\n" + 
		         "								<option value=\"orange\">Orange</option>\n" + 
		         "								<option value=\"yellow\">Yellow</option>\n" + 
		         "								<option value=\"pink\">Pink</option>\n" + 
		         "							</select>\n" + 
		         "						</div>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<hr size=\"30\">\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3>\n" + 
		         "							<kbd>Shape</kbd>\n" + 
		         "						</h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"form-row col-xs-3\" align=\"center\">\n" + 
		         "						\n" + 
		         "					</div>\n" + 
		         "					<div class=\"form-row col-xs-6\" align=\"center\">\n" + 
		         "						<label for=\"inputShape\">Shape</label> <select id=\"Shape\"\n" + 
		         "							class=\"form-control\" name=\"Shape\">\n" + 
		         "							<option selected value=\"OVAL\">Oval</option>\n" + 
		         "							<option value=\"RECT\">Rectangle</option>\n" + 
		         "							<option value=\"ROUNDRECT\">Round Rectangle</option>\n" + 
		         "						</select>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"form-row col-xs-12\" align=\"center\">\n" + 
		         "						\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"form-row col-md-4\" align=\"center\">\n" + 
		         "						<label for=\"X\">Width</label> <input type=\"number\"\n" + 
		         "							class=\"form-control\" id=\"X\" placeholder=\"200\" maxlength=\"3\"\n" + 
		         "							name=\"X\" value=\"100\" min=\"1\" max=\"999\">\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"form-row col-md-4\" align=\"center\">\n" + 
		         "						<label for=\"Y\">Height</label> <input type=\"number\"\n" + 
		         "							class=\"form-control\" id=\"Y\" placeholder=\"100\" maxlength=\"3\"\n" + 
		         "							name=\"Y\" value=\"100\" min=\"1\" max=\"999\">\n" + 
		         "					</div>\n" + 
		         "					<div class=\"form-row col-xs-4\" align=\"center\">\n" + 
		         "						<label for=\"inputBGColor\">Color</label> <select id=\"Color\"\n" + 
		         "							class=\"form-control\" name=\"Color\">\n" + 
		         "							<option value=\"white\">White</option>\n" + 
		         "							<option value=\"red\" color=\"red\">Red</option>\n" + 
		         "							<option value=\"black\" color=\"Black\">Black</option>\n" + 
		         "							<option selected value=\"blue\"><strong>Blue</strong></option>\n" + 
		         "							<option value=\"cyan\">Cyan</option>\n" + 
		         "							<option value=\"darkGray\">Dark Gray</option>\n" + 
		         "							<option value=\"gray\">Gray</option>\n" + 
		         "							<option value=\"lightGray\">Light Gray</option>\n" + 
		         "							<option value=\"green\">Green</option>\n" + 
		         "							<option value=\"magenta\">Magenta</option>\n" + 
		         "							<option value=\"orange\">Orange</option>\n" + 
		         "							<option value=\"yellow\">Yellow</option>\n" + 
		         "							<option value=\"pink\">Pink</option>\n" + 
		         "						</select>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3>\n" + 
		         "							<kbd>Message</kbd>\n" + 
		         "						</h3>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "\n" + 
		         "						<div class=\"radio\">\n" + 
		         "							<label class=\"radio-inline\"><input type=\"radio\"\n" + 
		         "								name=\"FTStyle\" value=\"REGULAR\" checked>Regular </label> <label\n" + 
		         "								class=\"radio-inline\"><input type=\"radio\" name=\"FTStyle\"\n" + 
		         "								value=\"BOLD\"><strong>Bold</strong></label> <label\n" + 
		         "								class=\"radio-inline\"><input type=\"radio\" name=\"FTStyle\"\n" + 
		         "								value=\"ITALIC\"><em>Italic</em></label> <label\n" + 
		         "								class=\"radio-inline\"><input type=\"radio\" name=\"FTStyle\"\n" + 
		         "								value=\"BOLD ITALIC\"><strong><em>Bold\n" + 
		         "										Italic</em></strong></label>\n" + 
		         "						</div>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-9\">\n" + 
		         "						<textarea class=\"form-control\" rows=\"3\" id=\"message\" name = \"Message\"\n" + 
		         "							placeholder=\"Type your message here (20 characters Max)\"  maxlength=\"20\" value=\"Welcome to Servlets\"></textarea>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"form-row col-xs-3\" align=\"center\">\n" + 
		         "						<label for=\"FTSize\">Size:</label> <input type=\"number\"\n" + 
		         "							class=\"form-control\" id=\"FTSize\" placeholder=\"12\" maxlength=\"3\"\n" + 
		         "							name=\"FTSize\" value=\"12\" min=\"1\" max=\"99\">\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "					<div class=\"col-md-12\" align=\"center\">\n" + 
		         "						<button type=\"submit\" class=\"btn btn-primary\" align=\"center\">Show\n" + 
		         "							Banner</button>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "					<div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "\n" + 
		         "				</form>\n" + 
		         "			</div>\n" + 
		         "\n" + 
		         "			<div class=\"col-md-8\" style=\"background-color:darkslateblue;\">\n" + 
		         "				<div class=\"row\">\n" + 
		         "                <div class=\"row\">\n" + 
		         "                <div class=\"col-sm-4\"></div>\n" + 
		         "                <div class=\"col-sm-8\">\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <applet code=\"ShowShape.class\"  width=\""+appWidth+"\" height=\""+appHeight+"\">\n" + 
		         "					<param name=Message value=\""+message+"\">\n" + 
		         "					<param name=Shape value=\""+shape+"\">\n" + 
		         "					<param name=ShapeColor value=\""+color+"\">\n" + 
		         "					<param name=BGColor value=\"" + bgColor + "\">\n" + 
		         "					<param name=X value=\""+width+"\">\n" + 
		         "					<param name=Y value=\""+height+"\">\n" + 
		         "					<param name=FTStyle value=\""+fontStyle+"\">\n" + 
		         "					<param name=FTSize value=\""+fontSize+"\">\n" + 
		         "					<param name=AppletX value=\""+appWidth+"\">\n" + 
		         "					<param name=AppletY value=\""+appHeight+"\">\n" + 
		         "				    </applet>\n" + 
		         "                    \n" + 
		         "                     <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    <div class=\"col-md-12\" align=\"center\" font>\n" + 
		         "						<h3></h3>\n" + 
		         "					</div>\n" + 
		         "                    </div>\n" + 
		         "                \n" + 
		         "                </div>\n" + 
		         "               \n" + 
		         "                </div>\n" + 
		         "                \n" + 
		         "                \n" + 
		         "                \n" + 
		         "                \n" + 
		         "                \n" + 
		         "                \n" + 
		         "			</div>\n" + 
		         "		</div>\n" + 
		         "	</div>\n" + 
		         "\n" + 
		         "</body>\n" + 
		         "</html>\n" + 
		         "\n" + 
		         ""
		      );
		 
		
		 // create and send HTML page to client
//		 StringBuffer buf = new StringBuffer();
//		 buf.append( "<HTML><HEAD><TITLE>\n" );
//		 buf.append( "A Simple Servlet Example\n" );
//		 buf.append( "</TITLE></HEAD><BODY>\n" );
//		 buf.append( "<applet code=\"ShowShape.class\"  width=\"300\" height=\"150\">" );
//		 buf.append( "<param name=Message value=\"" + message +"\">" );
//		 buf.append( "<param name=Shape value=\"OVAL\">" );
//		 buf.append( "<param name=ShapeColor value=\"blue\">" );
//		 buf.append( "<param name=BGColor value=\"white\">" );
//		 buf.append( "<param name=X value=\"200\">" );
//		 buf.append( "<param name=Y value=\"100\">" );
//		 buf.append( "<param name=FTStyle value=\"REGULAR\">" );
//		 buf.append( "<param name=FTSize value=\"12\">" );
//		 buf.append( "<param name=FTSize value=\"12\">" );
//		 buf.append("</applet"); 
//		 buf.append( "</BODY></HTML>" );
//		 output.println( buf.toString() );
//		 output.close();
		 

		
		
		
		
		
	    
		
	      
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
		this.width=request.getParameter("X");
		this.height=request.getParameter("Y");
		this.fontStyle=request.getParameter("FTStyle");
		this.fontSize=request.getParameter("FTSize");
		this.appWidth=request.getParameter("appletWidth");
		this.appHeight=request.getParameter("appletHeight");
		
		
		
		
		
		
		doGet(request, response);
	}

}
