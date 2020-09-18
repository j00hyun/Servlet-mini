package myArt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getInitial")
public class getInitial extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("name"));
		
		makeString(request, response);
	} 
	
	protected void makeString(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getAttribute("name");
		String str = "";
		
		if(name.equals("pjh")) {
			str = "is parkjoohyun";
		} else if(name.equals("kdj")) {
			str = "is kimdongjoo";
		} else {
			str = "is not exist";
		}
		
		request.setAttribute("result", str);
		request.getRequestDispatcher("printString").forward(request, response);	
	}

}
