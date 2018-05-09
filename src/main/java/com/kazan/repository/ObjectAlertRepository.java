package com.kazan.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.ObjectAlert;

@Repository
public class ObjectAlertRepository implements AbstractObjectRepository<ObjectAlert> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectAlert> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from ObjectAlert").list();
	}

	@Transactional
	public int deleteBySymbol(String symbol) {
		String hql = "delete from ObjectAlert where symbol= :symbolToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql).setString("symbolToDelete", symbol).executeUpdate();
	}

	@Transactional
	public int deleteBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		String hql = "delete from ObjectAlert where symbol= :symbolToDelete and user_id = :userIdToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("userIdToDelete", userId).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@Transactional
	public int deleteBySymbolGroup(String symbol, Integer groupId) {
		String hql = "delete from ObjectAlert where symbol= :symbolToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectAlert> getBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectAlert where symbol = :symbolToSelect and user_id = :userIdToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("userIdToSelect", userId);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectAlert> getBySymbolGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectAlert where symbol = :symbolToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@Transactional
	public ObjectAlert add(ObjectAlert t) {
		sessionFactory.getCurrentSession().persist(t);
		sessionFactory.getCurrentSession().flush();
		return t;
	}
	
	@Transactional
	public String[][] getUserIdAndUpdateTime(String symbol, Integer groupId) {
		return null;
	}
}
