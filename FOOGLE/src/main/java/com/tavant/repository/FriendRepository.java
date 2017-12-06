package com.tavant.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tavant.model.Friend;

@Repository("friendRepository")
public class FriendRepository implements FriendRepositoryInterface {

	@Override
	public boolean checkDuplicate(Friend friend) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		List<Friend> friends = session.createCriteria(Friend.class).list();
		
		for (Friend each_friend : friends) {
			if ((each_friend.getContactNumber().equals(friend.getContactNumber()))
					|| (each_friend.getMailId().equals(friend.getMailId()))) {

				return true;
			}
		}

		return false;
	}

	@Override
	public Friend addFriend(Friend friend) {

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		if (!checkDuplicate(friend))
			session.save(friend);

		session.getTransaction().commit();

		session.close();
		return friend;
	}

	@Override
	public Friend displayFriendById(int id) {

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Friend friend = session.get(Friend.class, id);

		session.getTransaction().commit();
		session.close();
		return friend;
	}

	@Override
	public Friend deleteFriendById(int id) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Friend friend = session.get(Friend.class, id);
		session.delete(friend);

		session.getTransaction().commit();
		session.close();
		return friend;
	}

	@Override
	public Friend updateFriend(Friend friend) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(friend);
		session.getTransaction().commit();
		session.close();
		return friend;
	}

	@Override
	public List<Friend> findAll() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		session.beginTransaction();
		List<Friend> friends = session.createCriteria(Friend.class).list();

		session.getTransaction().commit();
		session.close();

		return friends;
	}
	
	

}
