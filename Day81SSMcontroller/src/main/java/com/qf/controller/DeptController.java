package com.qf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.qf.pojo.Demp;
import com.qf.service.IDeptService;
@Controller
public class DeptController {
	@Resource
	private IDeptService iDeptService;
	@ResponseBody
	@GetMapping("/dept")
	public List<Demp> getAllDemps(){
		List<Demp> list=new ArrayList<>();
		list=iDeptService.getAllDept();
		return list;
	}
}
