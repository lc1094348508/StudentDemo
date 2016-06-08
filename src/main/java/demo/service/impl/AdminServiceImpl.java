package demo.service.impl;

import demo.dao.AdminDao;
import demo.dao.GenericDao;
import demo.model.Admin;
import demo.service.AdminService;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24.
 */
@Service
public class AdminServiceImpl extends GenericServiceImpl<Admin> implements AdminService {
    @Override
    @Autowired
    @Qualifier("adminDaoImpl")
    void setGenericDao(GenericDao<Admin> genericDao) {
        super.genericDao = genericDao;
    }


    @Override
    public Admin login(Admin admin) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        AdminDao adminDao = (AdminDao) super.genericDao;
        String password = admin.getPassword();
            List<Admin> admins = adminDao.list("admin.login",admin.getEmail());
            if (admins.size() ==1){
            admin = admins.get(0);
            if (encryptor.checkPassword(password,admin.getPassword())){
               return admin;
            }
        }
        return null;
    }
}
