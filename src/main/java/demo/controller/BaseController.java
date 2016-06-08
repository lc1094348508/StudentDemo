package demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/5/20.
 */
public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected ServletContext appliaction;
    @ModelAttribute
    private void  set(HttpServletRequest request,HttpServletResponse response){
        this.request = request;
        this.response = response;
        this.session = request.getSession();
        this.appliaction = request.getServletContext();
    }
}
