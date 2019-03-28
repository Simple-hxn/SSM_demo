package com.java.Controller;


import com.java.Model.Department;
import com.java.impl.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {

    controller(){
        System.out.println("rree");
    }
@Autowired(required = true)
private services se;

        @RequestMapping("/index.do")
        public @ResponseBody Department dSeclectByID(String index){
            System.out.println("emmmmmm");
            return  se.selectByPrimaryKey("1") ;

        }

    public static  void main(String[] args){
            Department department =new Department();
            controller controller =new controller();
        department= controller.dSeclectByID("1");
    }

}
