package ibm_internship;


import javax.servlet.http.*;


import java.io.PrintWriter;

import java.io.IOException;

public class convertor extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		
		int i = Integer.parseInt(req.getParameter("b1"));
		
		
		int result = (i * 9/5) + 32;
		
		PrintWriter out2 = res.getWriter();
		
		out2.println("The converted value celcius to  farenheit is :"+ result);
		
		
		
		int j = Integer.parseInt(req.getParameter("b2"));
		
		int cel = (j-32) * 5/9;
		
		out2.println("The converted value from farenheit to celcius is :"+ cel);
		
		
		
		
		
	}

}
