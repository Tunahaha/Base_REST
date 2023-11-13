package org.example.controller;


import org.example.models.ApiResponse;
import org.example.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


public class StudentController extends BaseController{
    @GetMapping(path="students",headers="version=1")
    public String getStudent(){


    }

}
