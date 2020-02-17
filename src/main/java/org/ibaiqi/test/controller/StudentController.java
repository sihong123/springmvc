package org.ibaiqi.test.controller;/**
 * Author: asplover
 * Date: 2020-02-15 12:15
 * Package: org.fkit.controller
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *@program: Information
 *@description: 学生控制器
 *@author: asplover
 *@create: 2020-02-15 12:15
 */
@Controller
public class StudentController {
    @RequestMapping("/studentList")
    public ModelAndView student(ModelAndView mv){
        mv.setViewName("/studentList");
        return mv;
    }
}