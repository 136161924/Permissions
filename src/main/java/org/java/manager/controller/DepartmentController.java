package org.java.manager.controller;

import org.java.manager.entity.DepartmentEntity;
import org.java.manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     ：clj
 * @ Date       ：Created in 10:27 2018/11/16
 * @ Description：${description}
 * @ Modified By：
 * @Version: 1.0
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("department/{depId}")
    @ResponseBody
    public DepartmentEntity findDepartmentById(@PathVariable("depId") String depId){
        System.out.println(depId);
        DepartmentEntity department=departmentService.findByDepId(depId);
        System.out.println(department);

        return department;
    }

}
