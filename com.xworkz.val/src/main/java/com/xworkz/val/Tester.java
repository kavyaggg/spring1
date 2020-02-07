package com.xworkz.val;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.val.entity.ValentineEntity;
import com.xworkz.val.service.Service;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			
			Service service=container.getBean(Service.class);
			
			ValentineEntity entity = new ValentineEntity();
			entity.setName("xxx");
			entity.setGift("rose");
			
			entity.setAmountpaid(500);
			entity.setStatus("double");
			
			
			service.validateandsave(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
