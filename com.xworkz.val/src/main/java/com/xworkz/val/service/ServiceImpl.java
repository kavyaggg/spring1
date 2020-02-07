package com.xworkz.val.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.val.dao.ValentineDAO;
import com.xworkz.val.entity.ValentineEntity;
@Component

public class ServiceImpl implements Service {
	@Autowired
	private ValentineDAO dao;
	
	public ServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	public boolean validateandsave(ValentineEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked"+entity);
		Integer id=dao.save1(entity);
	    if(Objects.nonNull(id)) {
		System.out.println("entity save");
		return true;
	}
	else {
		
		System.out.println("not save");
		return false;
	}
}
}
