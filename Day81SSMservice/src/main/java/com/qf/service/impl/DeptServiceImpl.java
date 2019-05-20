package com.qf.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qf.dao.IDept;
import com.qf.pojo.Demp;
import com.qf.service.IDeptService;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDept idept;

	@Override
	public List<Demp> getAllDept() {
		// TODO Auto-generated method stub
		List<Demp> list=new ArrayList<>();
		list=idept.getAllDept();
		
		return list;
	}

}
