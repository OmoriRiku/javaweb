import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//	���N�G�X�g�Ŏ󂯎�����f�[�^�̕����G���R�[�f�B���O���w��
		req.setCharacterEncoding("UTF-8");

		//	���X�|���X�̃f�[�^��html�^�C�v�̕����G���R�[�f�B���O��UTF8
		res.setContentType("text/html; charset=UTF-8");

		//	���N�G�X�g�Ŏ󂯎��e��p�����[�^�[
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String pass = req.getParameter("password");
		String address = req.getParameter("address");
		String msg = req.getParameter("msg");
		String[] langs = req.getParameterValues("lang");

		if (age.equals("child")) {
			age = "18�Ζ���";
		} else {
			age = "18�Έȏ�";
		}
		
		String sLangs = "";
		for (int i = 0; i < langs.length; i++) {
			sLangs += langs[i] + "�A ";
		}

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>�m�F���</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<body>");
		out.println("<h2>���͏����m�F���ēo�^�{�^���������Ă�������</h2>");
		out.println("�����F<strong>" + name + "</strong><br/>");
		out.println("�p�X���[�h�F<strong>" + pass + "</strong><br>");
		out.println("�N��F<strong>" + age + "</strong></br>");
		out.println("�J���o��<strong>" + sLangs + "</strong></br>");
		out.println("�Z���F<strong>" + address + "</strong></br>");
		out.println("���ӌ��E���₢���킹�F<strong>" + msg + "</strong><br/>");
		out.println("<input type=\"submit\" value=\"���M\">");
		out.println("<input type=\"reset\" value=\"�߂�\">");
		out.println("(���̉�ʂ̓T�[�u���b�g�ŏo�͂��Ă��܂��B)");
		out.println("<body>");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doPost(req, res);
	}
}
