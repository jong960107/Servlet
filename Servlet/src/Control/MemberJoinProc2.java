package Control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;

//자바 언어 쓰는 곳(서블릿)에 해당 


/**
 * Servlet implementation class MemberJoinProc2
 */
@WebServlet("/Mproc2")
//어노테이션이라고 해서,이서블릿의 이름을 Mproc2라고 짓되작성할떄는 "/Mproc2" 라고 작성한다.
//form action = "Mproc2"을 작성할때 이 서블릿으로 데이터를 맵핑시키기 위해서
//form action = "Mproc2"라고 작성한다. 

public class MemberJoinProc2 extends HttpServlet {
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//request에는 MemberJoin2.jsp 에 저장한 데이터 정보가 일일히 들어가 있을것이다.
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));//천상 이렇게 데이터를 넣는 방법밖에 없다.
		bean.setPassword(request.getParameter("password"));//천상 이렇게 데이터를 넣는 방법밖에 없다.
		bean.setEmail(request.getParameter("email"));//천상 이렇게 데이터를 넣는 방법밖에 없다.
		bean.setTel(request.getParameter("tel"));//천상 이렇게 데이터를 넣는 방법밖에 없다.
		bean.setAddress(request.getParameter("address"));//천상 이렇게 데이터를 넣는 방법밖에 없다.
		
		//request객체에 bean클래스를 추가 
		request.setAttribute("bean",bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("MemberView.jsp");//여기서 화면에 보여질 jsp를 써준다.
		dis.forward(request, response);
	}
}
