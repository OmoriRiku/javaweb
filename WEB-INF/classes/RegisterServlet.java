import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//	リクエストで受け取ったデータの文字エンコーディングを指定
		req.setCharacterEncoding("UTF-8");

		//	レスポンスのデータはhtmlタイプの文字エンコーディングがUTF8
		res.setContentType("text/html; charset=UTF-8");

		//	リクエストで受け取る各種パラメーター
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String pass = req.getParameter("password");
		String address = req.getParameter("address");
		String msg = req.getParameter("msg");
		String[] langs = req.getParameterValues("lang");

		if (age.equals("child")) {
			age = "18歳未満";
		} else {
			age = "18歳以上";
		}
		
		String sLangs = "";
		for (int i = 0; i < langs.length; i++) {
			sLangs += langs[i] + "、 ";
		}

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>確認画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<body>");
		out.println("<h2>入力情報を確認して登録ボタンを押してください</h2>");
		out.println("氏名：<strong>" + name + "</strong><br/>");
		out.println("パスワード：<strong>" + pass + "</strong><br>");
		out.println("年齢：<strong>" + age + "</strong></br>");
		out.println("開発経験<strong>" + sLangs + "</strong></br>");
		out.println("住所：<strong>" + address + "</strong></br>");
		out.println("ご意見・お問い合わせ：<strong>" + msg + "</strong><br/>");
		out.println("<input type=\"submit\" value=\"送信\">");
		out.println("<input type=\"reset\" value=\"戻る\">");
		out.println("(この画面はサーブレットで出力しています。)");
		out.println("<body>");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doPost(req, res);
	}
}
