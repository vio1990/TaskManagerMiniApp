package com.ozerian.app.servlets;

import com.ozerian.app.model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Servlet for treatment of user's input data.
 */

@WebServlet(name = "taskServlet", urlPatterns = {"/taskServlet"})
public class TaskServlet extends HttpServlet {

    /**
     * Concurrent safe array for task list.
     */
    private CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            addTask(request);
        } else if ("update".equals(action)) {
            checkCompleteTask(request);
        }
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("taskList").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * This method is for creation of the task.
     *
     * @param request HttpServletRequest request.
     */
    private void addTask(HttpServletRequest request) {
        Task task = new Task();
        task.setName(request.getParameter("name"));
        task.setCategory(request.getParameter("category"));
        tasks.add(task);
    }

    /**
     * This method is for check if task is complete.
     *
     * @param request HttpServletRequest request.
     */
    private void checkCompleteTask(HttpServletRequest request) {
        String[] values = request.getParameterValues("status");
        for (int i = 0; i < values.length; i++) {
            String value = values[i];
            if (value != null) {
                tasks.remove(i);
            }
        }
    }
}
