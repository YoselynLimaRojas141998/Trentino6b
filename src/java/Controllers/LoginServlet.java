/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.LoginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yoselin lima
 */
public class LoginServlet extends HttpServlet {

    //2. el controller recibite la peticion de tipo POST.
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //3. se reciben o validan los datos enviados por los usuario
        
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);
        
        //4. Realizamos la logica de negocio (procesar datos)
        
        boolean status =bean.validate();
        
        //5. Compartimos el objeto, para poder usarlo en la vista (JSP)
        request.setAttribute("user",bean);
      
        //6. Dependiendo de nuestra logica, direccionando (enviamos una respuesta)
        
        if (status){
            RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
            rd.forward(request, response);
        
        }
    }
}
  
    