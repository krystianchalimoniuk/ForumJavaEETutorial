package krystian.javaee.forum.servlety;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krystian.javaee.forum.dao.TematyDAO;
import krystian.javaee.forum.encje.Temat;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
TematyDAO dao=(TematyDAO)request.getAttribute("tematyDAO");
List<Temat> tematy =dao.pobierzTematy();
request.setAttribute("tematy", tematy);
request.getRequestDispatcher("/WEB-INF/widok/index.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
	}

}
