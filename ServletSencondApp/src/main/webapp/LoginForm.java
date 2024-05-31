package main.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginform")
public class LoginForm extends HttpServlet {
    String uname;
    String pwd;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Form</title>");
        out.println("<style>");
        out.println("body {");
        out.println("  font-family: Arial, sans-serif;");
        out.println("  background-color: #f2f2f2;");
        out.println("  display: flex;");
        out.println("  justify-content: center;");
        out.println("  align-items: center;");
        out.println("  height: 100vh;");
        out.println("}");
        out.println(".container {");
        out.println("  background-color: #fff;");
        out.println("  padding: 20px;");
        out.println("  border-radius: 10px;");
        out.println("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
        out.println("  width: 300px;");
        out.println("}");
        out.println("h2 {");
        out.println("  margin-bottom: 20px;");
        out.println("}");
        out.println("label, input {");
        out.println("  display: block;");
        out.println("  width: 100%;");
        out.println("}");
        out.println("input {");
        out.println("  padding: 10px;");
        out.println("  margin-bottom: 10px;");
        out.println("  border: 1px solid #ccc;");
        out.println("  border-radius: 5px;");
        out.println("}");
        out.println("input[type='submit'] {");
        out.println("  background-color: #4CAF50;");
        out.println("  color: white;");
        out.println("  border: none;");
        out.println("  cursor: pointer;");
        out.println("}");
        out.println("input[type='submit']:hover {");
        out.println("  background-color: #45a049;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Login Form</h2>");
        out.println("<form action='loginform' method='post'>");
        out.println("<label for='uname'>Username:</label>");
        out.println("<input type='text' id='uname' name='uname' required>");
        out.println("<label for='pwd'>Password:</label>");
        out.println("<input type='password' id='pwd' name='pwd' required>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        out.println("<html>");
        out.println("<body>");
        out.println("<div style='display: flex; justify-content: center; align-items: center; height: 100vh;'>");
        out.println("<div style='text-align: center;'>");
        out.println("<h2>");
        if (uname.equalsIgnoreCase("root") && pwd.equalsIgnoreCase("root")) {
            out.println("User Login Success...");
            out.println(uname+" And "+pwd);
        } else {
            out.println("User Login failed...");
        }
        out.println("</h2>");
        out.println("<br><br>");
        out.println("<a href='./loginform'> | Get back to login | </a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
