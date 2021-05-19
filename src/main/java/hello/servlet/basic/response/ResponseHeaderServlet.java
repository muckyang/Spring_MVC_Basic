package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Status Line
        response.setStatus(HttpServletResponse.SC_OK);

        //response Header
//        response.setHeader("Content-Type","text/plain;charset=utf-8");
//        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
//        response.setHeader("Pragma","no-cache");
//        response.setHeader("my-Header", "hello");

        //Header 편의 메소드
        content(response);

        response.getWriter().write("HELLO");
    }

    private void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }


}
