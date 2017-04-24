
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servl extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // установить MIME-type и кодировку ответа
        response.setContentType("text/html; charset=UTF8");
        PrintWriter out = response.getWriter();

        // Отправка веб-страницы
        try {
            out.println("<html>");
            out.println("<head><title>Servlet sample</title></head>");
            out.println("<body>");
            out.println("<p>Запрошенный ресурс: " + request.getRequestURI() + "</p>");
            out.println("<p>Протокол: " + request.getProtocol() + "</p>");
            out.println("<p>Адрес сервера: " + request.getRemoteAddr() + "</p>");
            out.println("</body></html>");
        } finally {
            out.close();  // Всегда закрывать Writer
        }
    }
}