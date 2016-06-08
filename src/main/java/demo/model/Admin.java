package demo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/17.
 */
public class Admin implements Serializable{
    private Integer id;
    private String email;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(Integer id, String email, String username, String password, String role) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Admin(Integer id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
