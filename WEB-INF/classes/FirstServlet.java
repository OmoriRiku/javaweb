//	4�̃\�[�X�t�@�C�����C���|�[�g

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>"); 
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>���߂ẴT�[�u���b�g</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>�T�[�u���b�g���n�߂悤�I</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
