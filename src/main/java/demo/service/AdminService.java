package demo.service;

import demo.model.Admin;

/**
 * Created by Administrator on 2016/5/25.
 */
public interface AdminService extends GenericService<Admin> {
    Admin login(Admin admin);
}
