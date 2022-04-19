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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Jadi sekarang kita ingin menulis tanggapan untuk dapat menulis tanggapan yang perlu kita dapatkan
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

}
