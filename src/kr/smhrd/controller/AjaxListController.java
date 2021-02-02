package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

@WebServlet("/ajaxlist.do")
public class AjaxListController extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDAO dao = new MemberDAOImpl();
        List<MemberVO> list = dao.memberList();

        Gson g = new Gson();
        String json = g.toJson(list);
        
        response.setContentType("text/json; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
    }
}
