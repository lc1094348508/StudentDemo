package demo.controller;

import demo.model.Admin;
import demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/20.
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    private void login(Admin admin) throws IOException, ServletException {
        admin = adminService.login(admin);
        if (admin != null) {
            request.getSession().setAttribute("admin", admin);
            response.sendRedirect("/admin/system.jsp");
        }else {
            request.setAttribute("message", "邮箱或密码错误！");
            request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
        }


    }
}
