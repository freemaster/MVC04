package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

@WebServlet("/ajaxcontent.do")
public class AjaxContentController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      //상세보기
        int num = Integer.parseInt(request.getParameter("num"));
        String cpath = request.getContextPath();
        MemberDAO dao = new MemberDAOImpl();
        MemberVO vo = dao.memberContent(num);
        
        Gson g = new Gson();
        String json = g.toJson(vo);
        
        response.setContentType("text/json; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
	}
}
