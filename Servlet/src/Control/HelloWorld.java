package Control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿도 자체적으로 실행이 가능하게끔 만들어 놨다..!

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld") //HelloWord 라고 주소 url에 표시해주어야 이 서블릿 클래스가 실행됩니다.
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		reqPro(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		reqPro(request, response);
	}
	
	//서블릿은 하나의 메소드에서 처리해주는게 좋다.
	//일괄처리 즉 ,doget이던 dopost 아래 reqpro메소드가 실행되게 해줌
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//화면에 HelloWorld라고 출력을 하고 싶어요...
		//항상 출력은 jsp(View)가 담당한다. 즉 jsp쪽으로 넘겨질 데이터를 설정
		String msg = "Hello World~~~! 안녕하세요 ";
		Integer data = 12;
		// jsp쪽으로 데이터를 request에 부착하여 넘겨줌.
		request.setAttribute("msg", msg);
		request.setAttribute("data", data);
		//db
		
		//서블릿에서 jsp를 호출하면서 데이터를 같이 넘겨주는 객체를 선언 
		RequestDispatcher rd = request.getRequestDispatcher("HelloWorld.jsp");
		rd.forward(request, response);
		
	}

}
