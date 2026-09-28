package no.hvl.dat152.action;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import no.hvl.dat152.dao.BookDAO;

public class DeleteBookAction implements ControllerAction {
    @Override 
    public int execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String isbn = request.getParameter("isbn");
        
        BookDAO dao = new BookDAO();
        boolean a = dao.deleteBook(isbn);

        if (a) { return ControllerAction.SUCCESS; } return 0;
    }
}