import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletone")
public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("username");
		String p=request.getParameter("userpass");
		
		if(LoginDao.validate(n, p)){
			RequestDispatcher rd=request.getRequestDispatcher("servlettwo");
			rd.forward(request,response);
		}
		else{
			out.println("Sorry username or password error");
			out.println("<br/>");
			RequestDispatcher rd=request.getRequestDispatcher("servleterror");
			rd.include(request,response);
		}
		
		out.close();
	}

}
