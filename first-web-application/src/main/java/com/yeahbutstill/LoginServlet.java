package com.yeahbutstill;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    // Validate User
    private UserValidationService service = new UserValidationService();

    // Request Method
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // jika anda bisa mendapatkan parameter dari permintaan dengan menggunakan permintaan
//        // dan saya perlu memasukan nama parameter di sini atau di luar, karena itu mendapatkan nama parameter
//        String name = req.getParameter("name");
//        String age = req.getParameter("age");
//        // yang ingin saya lakukan adalah sekarang memberikan name ini ke JSP
//        // http://localhost:8080/?name=maya&age=18
//        req.setAttribute("name", name);
//        req.setAttribute("age", age);
//        // Jadi sekarang kita ingin menulis tanggapan untuk dapat menulis tanggapan yang perlu kita dapatkan
//        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);

        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("password", req.getParameter("password"));

        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    // Post Method
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        req.setAttribute("name", name);
        String password = req.getParameter("password");
        req.setAttribute("password", password);

        boolean userValid = service.isUserValid(name, password);
        if (userValid) {
            req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
        } else {
            req.setAttribute("errorMessage", "Invalid Credentials!");
            System.out.println("name or password invalid");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        }

    }

}
