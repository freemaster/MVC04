package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax.do")
public class AjaxController extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // System.out.println("OK");
        // PrintWriter out = response.getWriter();
        // out.println("- Server Data -");
        int su = Integer.parseInt(request.getParameter("led"));
        String led = "{\"sensor\":\"led\", \"on\":"+su+"}";
        response.setContentType("text/json");
        PrintWriter out = response.getWriter();
        out.println(led); //--------------> ajax()  :  success
    }
}
