

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class ShowShape extends JApplet {

	// default settings
	private String message = "Nicole ^o^";
	private String shape = "RECT";
	private String BGColor = "gray";
	private String shapeColor = "yellow";
	private int startX = 25;
	private int startY = 25;
	private int XSize = 250;
	private int YSize = 100;
	private String FTStyle = "REGULAR";
	private int FTSize = 20;
	private int appletX = 300;
	private int appletY = 150;

	private String[] shapeOptions = { "RECT", "OVAL", "ROUNDRECT" };
	private String[] colorNameOptions = { "black", "blue", "cyan", "darkGray", "gray", "green", "lightGray", "magenta",
			"orange", "pink", "red", "white", "yellow" };
	private Color[] colorOptions = { Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green,
			Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow };
	private String[] FTStyleOptions = { "REGULAR", "BOLD", "ITALIC", "BOLD ITALIC" };

	private boolean parameterCheck = false;
	private boolean BGColorCheck = false;
	private boolean shapeColorCheck = false;
	private boolean shapeCheck = false;
	private boolean XSizeCheck = false;
	private boolean YSizeCheck = false;
	private boolean FTStyleCheck = false;
	private boolean FTSizeCheck = false;
	private boolean AppletXCheck = false;
	private boolean AppletYCheck = false;
	
	

	public void init() {
		
		String tempMessage = this.getParameter("Message");
		String tempShape = this.getParameter("Shape");
		String tempBGColor = this.getParameter("BGColor");
		String tempShapeColor = this.getParameter("ShapeColaor");
		String tempXString = this.getParameter("X");
		String tempYString = this.getParameter("Y");
		String tempFTStyle = this.getParameter("FTStyle");
		String tempFTSize = this.getParameter("FTSize");
		String tempAppletX =this.getParameter("AppletX");
		String tempAppletY = this.getParameter("AppletY");

		if (message != null) message = tempMessage;
		
		if ((tempShape != null) && (tempBGColor != null) && (tempShapeColor != null) && (tempXString != null)
				&& (tempYString != null) && (tempFTStyle != null) && (tempFTSize != null))
			parameterCheck = true;

		if (Arrays.asList(shapeOptions).contains(tempShape)) {
			this.shape = tempShape;
			shapeCheck = true;
		}
		if (Arrays.asList(colorNameOptions).contains(tempBGColor)) {
			this.BGColor = tempBGColor;
			BGColorCheck = true;
		}
		if (Arrays.asList(colorNameOptions).contains(tempShapeColor)) {
			this.shapeColor = tempShapeColor;
			shapeColorCheck = true;
		}
		
		if ((tempAppletX!=null) && (Integer.parseInt(tempAppletX) <= 999)){
			this.appletX = Integer.parseInt(tempAppletX);
			AppletXCheck = false;
		}
		
		if ((tempAppletY!=null) && (Integer.parseInt(tempAppletY) <= 999)){
			this.appletY = Integer.parseInt(tempAppletY);
			AppletYCheck = false;
		}
		
		if ((tempXString!= null) && (Integer.parseInt(tempXString) <= Integer.parseInt(tempAppletX))) {
			this.XSize = Integer.parseInt(tempXString);
			this.startX = (Integer.parseInt(tempAppletX) - XSize) / 2;
			XSizeCheck = true;
		}
		if ((tempYString!= null) && (Integer.parseInt(tempYString) <= Integer.parseInt(tempAppletY))) {
			this.YSize = Integer.parseInt(tempYString);
			this.startY = (Integer.parseInt(tempAppletY) - YSize) / 2;
			YSizeCheck = true;
		}
		if (Arrays.asList(FTStyleOptions).contains(tempFTStyle)) {
			this.FTStyle = tempFTStyle;
			FTStyleCheck = true;
		}
		if ((tempFTSize != null)) {
			this.FTSize = Integer.parseInt(tempFTSize);
			FTSizeCheck = true;
		}
		
	}
	
//	public void setMessage(String msg) {
//		this.message=msg;
//	}
//	public void setShape(String shape) {
//		this.shape=shape;
//	}
//	public void setBGColor(String bgcolor) {
//		this.BGColor=bgcolor;
//	}
//	public void setColor(String shapecolor) {
//		this.shapeColor=shapecolor;
//	}
//	public void setY(int y) {
//		this.startY=y;
//	}
//	
//	public void setX(int x) {
//		this.startX=x;
//	}
//	public void setXSize(int xSize) {
//		this.XSize=xSize;
//	}
//	public void setYSize(int ySize) {
//		this.YSize=ySize;
//	}
	
	
	
	
	public void paint(Graphics g) {
		// color settings
		//this.setSize(300,150);
		//setSize(new Dimension(300,150));
		
		
		g.setColor(colorOptions[Arrays.asList(colorNameOptions).indexOf(BGColor)]);
		g.fillRect(0,0,appletX,appletY);
		//getContentPane().setBackground(colorOptions[Arrays.asList(colorNameOptions).indexOf(BGColor)]);
		
		g.setColor(colorOptions[Arrays.asList(colorNameOptions).indexOf(shapeColor)]);

		// shape settings
		if (shape.equals("RECT"))
			g.drawRect(startX, startY, XSize, YSize);
		else if (shape.equals("OVAL"))
			g.drawOval(startX, startY, XSize, YSize);
		else if (shape.equals("ROUNDRECT"))
			g.drawRoundRect(startX, startY, XSize, YSize, XSize / 3, YSize / 3);

		// message font settings
		Font font = new Font("ZapfDingbats", Font.PLAIN, 20);
		
		Font fontRegular = new Font("ZapfDingbats", Font.PLAIN, FTSize);
		Font fontBold = new Font("ZapfDingbats", Font.BOLD, FTSize);
		Font fontItalic = new Font("ZapfDingbats", Font.ITALIC, FTSize);
		Font fontBI = new Font("ZapfDingbats", Font.ITALIC + Font.BOLD, FTSize);

		if (g.getFontMetrics(fontBI).stringWidth(message) > XSize) {
			FTSize = 20;
			FTSizeCheck = false;
			fontRegular = new Font("ZapfDingbats", Font.PLAIN, FTSize);
			fontBold = new Font("ZapfDingbats", Font.BOLD, FTSize);
			fontItalic = new Font("ZapfDingbats", Font.ITALIC, FTSize);
			fontBI = new Font("ZapfDingbats", Font.ITALIC + Font.BOLD, FTSize);
		}
		
		if (FTStyle.equals("REGULAR")) g.setFont(fontRegular);
		if (FTStyle.equals("BOLD")) g.setFont(fontBold);
		if (FTStyle.equals("ITALIC")) g.setFont(fontItalic);
		if (FTStyle.equals("BOLD ITALIC")) g.setFont(fontBI);
		
		FontMetrics fm = g.getFontMetrics();
		
		g.drawString(message, (startX + (XSize - fm.stringWidth(message)) / 2),
				(startY + (YSize - fm.getHeight()) / 2) + fm.getAscent());		
			
			// error message
			g.setFont(new Font("Serif", Font.PLAIN, 10));
			if (parameterCheck == false)
				g.drawString("Missing parameter input", 5, 10);
			if (shapeCheck == false)
				g.drawString("Invalid Shape Type", 5, 20);
			if (BGColorCheck == false)
				g.drawString("Invalid BGColor Input", 180, 10);
			if (shapeColorCheck == false)
				g.drawString("Invalid Shape Color Input", 180, 20);
			if (XSizeCheck == false)
				g.drawString("XSize Too Big", 5, 135);
			if (YSizeCheck == false)
				g.drawString("YSize Too BIg", 5, 145);
			if (FTStyleCheck == false)
				g.drawString("Invalid Font Style", 200, 135);
			if (FTSizeCheck == false)
				g.drawString("Font Size Too Big", 200, 145);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getBGColor() {
		return BGColor;
	}

	public void setBGColor(String bGColor) {
		this.BGColor = bGColor;
	}

	public String getShapeColor() {
		return shapeColor;
	}

	public void setShapeColor(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getXSize() {
		return XSize;
	}

	public void setXSize(int xSize) {
		XSize = xSize;
	}

	public int getYSize() {
		return YSize;
	}

	public void setYSize(int ySize) {
		YSize = ySize;
	}

	public String getFTStyle() {
		return FTStyle;
	}

	public void setFTStyle(String fTStyle) {
		FTStyle = fTStyle;
	}

	public int getFTSize() {
		return FTSize;
	}

	public void setFTSize(int fTSize) {
		FTSize = fTSize;
	}

	public int getAppletX() {
		return appletX;
	}

	public void setAppletX(int appletX) {
		this.appletX = appletX;
	}

	public int getAppletY() {
		return appletY;
	}

	public void setAppletY(int appletY) {
		this.appletY = appletY;
	}

}