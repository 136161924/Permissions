package org.java.manager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 11:33 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */
@Entity
@Table(name = "department")
public class DepartmentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String depId;
    private String depName;

    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="dep_id")
    private Set<RoleEntity> roles = new HashSet<>();

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
