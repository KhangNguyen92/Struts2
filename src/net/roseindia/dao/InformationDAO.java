package net.roseindia.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import net.roseindia.Model.AddInformation;
import net.roseindia.hibernateUtil.HibernateUtil;

public class InformationDAO extends HibernateUtil {
	public AddInformation add(AddInformation obInformation) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(obInformation);
		session.getTransaction().commit();
		return obInformation;
	}

	public List<AddInformation> list1() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<AddInformation> inforList = null;
		try {
			inforList = (List<AddInformation>) session.createQuery(
					"from AddInformation").list();
		} catch (HibernateException he) {
			he.toString();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return inforList;
	}

	public AddInformation delete(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		AddInformation obInformation2 = (AddInformation) session.load(
				AddInformation.class, id);
		if (null != obInformation2) {
			session.delete(obInformation2);
		}
		session.getTransaction().commit();
		return obInformation2;

	}

}
