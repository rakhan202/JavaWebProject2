package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegistrationDAO;

public class FormReader extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(age);

		boolean valid = true;

		if (phone.length() != 10 || !isNumeric(phone)) {
			response.getWriter()
					.print("<h1><font color=red>Sorry Invalid Phone Number</font></h1>");
			valid = false;
		}

		if (!email.contains("@") || !email.contains(".")) {
			response.getWriter()
					.print("<h1><font color=red>Sorry Invalid Email Address</font></h1>");
			valid = false;
		}

		if (!isNumeric(age)) {
			response.getWriter()
					.print("<h1><font color=red>Sorry Invalid Age</font></h1>");
			valid = false;
		}

		if (valid) {

			RegistrationDAO dao = new RegistrationDAO();
		dao.insertData(fname + " " + lname, email, phone, Integer.parseInt(age));

			response.getWriter().print(
					"<h1>Thanks for registering " + fname + " " + lname + "</h1>");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	public boolean isNumeric(String str) {

		boolean valid = true;
		try {
			Long.parseLong(str);
		} catch (NumberFormatException e) {
			valid = false;
		}
		return valid;
	}

}
