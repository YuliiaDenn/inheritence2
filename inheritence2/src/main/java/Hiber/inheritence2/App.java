package Hiber.inheritence2;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Hiber.entity.Delivery;
import Hiber.entity.SelfPickup;
import Hiber.util.HibernateUtil;

public class App {
	public static void main(String[] args) {

		Delivery delivery = new Delivery();
		delivery.setRecipent("Ivan Ivanov");
		delivery.setRegion("Kiev");
		delivery.setDistrict("Ivankiv");
		delivery.setCity("Ivankiv");
		delivery.setStreet("Myru");
		delivery.setHouseNumber("1a");
		delivery.setPhoneNumber("00000");

		SelfPickup sp = new SelfPickup();
		sp.setRecipent("Ivan Ivanov");
		sp.setPhoneNumber("00000");
		sp.setStoreBranchNumber("5");
		sp.setDate("14.03.2021");

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();
		session.save(delivery);
		session.save(sp);
		transaction.commit();
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
	
		System.out.println(session.createQuery("select d from Delivery d").list());
		System.out.println(session.createQuery("select s from SelfPickup s").list());

		transaction.commit();
		HibernateUtil.close();
	}
}
