# MVC04
MVC04 - (Model2 - front controller + POJO + HandlerMapping-HashMap + Ajax)

Ajax 와 서블릿을 이용하여 통신을 하는 간단한 회원가입 프로그램

1. 사용된 파일의 종류 //db 파일 프로젝트/src/kr.mem.db/member.sql //kr.mem.db 는 패키지
//회원수정 프로젝트/src/AjaxContentController.java //AjaxContentController.java 는 서블릿, url mapping은 ajaxcontent.do

//회원삭제 프로젝트/src/AjaxDeleteController.java //AjaxController.java 는 서블릿 url mapping은 ajaxdelete.do

//회원입력 프로젝트/src/AjaxInsertController.java //AjaxInsertController.java 는 서블릿 url mapping은 ajaxinsert.do

//회원목록 프로젝트/src/AjaxListController.java //AjaxListController.java 는 서블릿 url mapping은 ajaxlist.do

//회원정보업데이트 프로젝트/src/AjaxUpdateController.java //AjaxUpdateController.java 는 서블릿 url mapping은 ajaxupdate.do

프로젝트/src/kr.smhrd.model/MemberDAO.java //kr.smhrd.model 는 패키지

프로젝트/src/kr.smhrd.model/MemberDAOImpl.java

프로젝트/src/kr.smhrd.model/MemberVO.java

프로젝트/WEB-INF/lib/ojdbc6.jar

프로젝트/WEB-INF/gson-2.8.5.jar

프로젝트/WebContent/ajax02.html

2. 설명
크롬 주소창 : 127.0.0.1/프로젝트/ajax02.html
기본화면에서 회원의 목록이 존재하면 화면에 정상적으로 출력이 된다.
회원이 존재하지 않으면 회원가입 버튼을 통해서 회원을 가입한다.
ajax의 callback을 통해서 화면전환없이 한페이지에서 회원의 정보등록/수정/삭제
