package com.xworkz.val.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.val.entity.ValentineEntity;
@Component

public class ValentineDAOImpl implements ValentineDAO {

	public Integer save1(ValentineEntity entity) {
		// TODO Auto-generated method stub
		try {
			System.out.println("start");
			System.out.println("entity");
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(ValentineEntity.class);
			SessionFactory fac = cfg.buildSessionFactory();
			Session session = fac.openSession();
			session.beginTransaction();
			System.out.println("tx begin");
			System.out.println("data saving");
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("commited");
			System.out.println("close");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}