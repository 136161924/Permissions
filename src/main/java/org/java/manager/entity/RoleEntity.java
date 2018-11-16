package org.java.manager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 11:34 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */
@Entity
@Table(name = "role")
public class RoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String roleId;
    private String roleName;
    private String roleDesc;

    @ManyToMany(mappedBy = "roles")
    private Set<ModuleEntity> modules = new HashSet<>();

    public Set<ModuleEntity> getModules() {
        return modules;
    }

    public void setModules(Set<ModuleEntity> modules) {
        this.modules = modules;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
