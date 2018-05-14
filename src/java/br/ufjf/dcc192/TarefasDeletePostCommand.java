package br.ufjf.dcc192;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TarefasDeletePostCommand implements Comando{

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        TarefaDAO.getInstance().delete(id);
        response.sendRedirect("tarefas.html");
    }
    
}
