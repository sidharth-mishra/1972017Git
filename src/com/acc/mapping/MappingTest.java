package com.acc.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MappingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		
		UserInfo userInfo=new UserInfo();
		userInfo.setUsername("FirstUser");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("Jeep");
		
		vehicle.setUserInfo(userInfo);
		vehicle2.setUserInfo(userInfo);
		
		userInfo.getVehicle().add(vehicle);
		userInfo.getVehicle().add(vehicle2);
		
		 Session session=factory.openSession();  	
			session.beginTransaction();
			session.save(userInfo);
			session.save(vehicle);
			session.save(vehicle2);

			session.getTransaction().commit();
			session.close();
			
			 
			 
	}

}
