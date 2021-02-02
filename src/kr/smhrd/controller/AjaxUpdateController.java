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
import kr.smhrd.model.MemberVO;


@WebServlet("/ajaxupdate.do")
public class AjaxUpdateController extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //파라메터 수집
        request.setCharacterEncoding("utf-8");
        String cpath = request.getContextPath();
        int num = Integer.parseInt(request.getParameter("num"));
        int mage = Integer.parseInt(request.getParameter("mage"));
        String memail = request.getParameter("memail");
        String mtel = request.getParameter("mtel");
        MemberVO vo = new MemberVO();
        vo.setNum(num);
        vo.setMage(mage);
        vo.setMemail(memail);
        vo.setMtel(mtel);
        
        MemberDAO dao = new MemberDAOImpl();
        int cnt = dao.memberUpdate(vo);
        if(cnt > 0) { //성공 -> 목록으로 : 서블릿 요청(memberList.do)
            response.setContentType("text/json; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(cnt);
        } else { //실패
            throw new ServletException("error");
        }
    }

}
