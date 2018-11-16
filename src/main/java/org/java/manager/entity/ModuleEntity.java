package org.java.manager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 11:34 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */
@Entity
@Table(name = "module")
public class ModuleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String modId;
    private String modName;
    private String modType;
    private String modUrl;
    private String modString;
    private String modPid;
    @ManyToMany
    @JoinTable(name = "role_ref_module",
            joinColumns = @JoinColumn(name = "mid",referencedColumnName = "modId"),
            inverseJoinColumns = @JoinColumn(name = "rid",referencedColumnName = "roleId"))
    private Set<RoleEntity> roles;

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType;
    }

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl;
    }

    public String getModString() {
        return modString;
    }

    public void setModString(String modString) {
        this.modString = modString;
    }

    public String getModPid() {
        return modPid;
    }

    public void setModPid(String modPid) {
        this.modPid = modPid;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }
}
