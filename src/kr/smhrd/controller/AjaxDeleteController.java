package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;

@WebServlet("/ajaxdelete.do")
public class AjaxDeleteController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      int num = Integer.parseInt(request.getParameter("num"));
	        String cpath = request.getContextPath();
	        MemberDAO dao = new MemberDAOImpl();
	        int cnt = dao.memberDelete(num);
	        if(cnt > 0) {
	            response.setContentType("text/json; charset=UTF-8");
	            PrintWriter out = response.getWriter();
	            out.print(cnt);
	        } else {
	            throw new ServletException("error");
	        }
	}

}
