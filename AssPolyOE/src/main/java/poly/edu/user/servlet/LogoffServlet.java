package poly.edu.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import antlr.CharQueue;
import poly.edu.common.CookieUtils;
import poly.edu.common.PageInfo;
import poly.edu.common.PageType;
import poly.edu.common.SessionUtils;

/**
 * Servlet implementation class LogoffServlet
 */
@WebServlet("/Logoff")
public class LogoffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CookieUtils.add("username", null, 0, response);
		
		SessionUtils.invalidate(request);
		
		request.setAttribute("isLogin", false);
		request.setAttribute("roleDisplay", false);
		new HomePageServlet().doGet(request, response);
	}

}
