package com.ozerian.app.servlets;

import com.ozerian.app.model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet for treatment of user's input data.
 */

@WebServlet(name = "taskServlet", urlPatterns = {"/taskServlet"})
public class TaskServlet extends HttpServlet {

    private ArrayList<Task> tasks = new ArrayList();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            Task task = new Task();
            task.setName(request.getParameter("name"));
            task.setCategory(request.getParameter("category"));
            task.setStatus(false);
            tasks.add(task);
        } else if ("update".equals(action)) {

        }
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("taskList").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
