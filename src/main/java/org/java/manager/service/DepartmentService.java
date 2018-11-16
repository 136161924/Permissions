package org.java.manager.service;

import org.java.manager.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 14:10 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */

public interface DepartmentService extends JpaRepository<DepartmentEntity,String> {


    public DepartmentEntity findByDepId(String id);
}
