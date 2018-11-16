package org.java.manager.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 11:33 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */
@Entity
@Table(name = "manager")
public class ManagerEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String manId;
    private String manNumber;
    private String manPwd;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
    private String manImgs;

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getManNumber() {
        return manNumber;
    }

    public void setManNumber(String manNumber) {
        this.manNumber = manNumber;
    }

    public String getManPwd() {
        return manPwd;
    }

    public void setManPwd(String manPwd) {
        this.manPwd = manPwd;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public String getManImgs() {
        return manImgs;
    }

    public void setManImgs(String manImgs) {
        this.manImgs = manImgs;
    }
}
