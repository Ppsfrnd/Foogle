package com.tavant.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.junit.Test;

import com.tavant.model.Friend;

public class FriendRepositoryTest {
	FriendRepository friendRepo = new FriendRepository();

	@Test
	public void testCheckDuplicate() {
		boolean actualOutput;

		Friend friend = new Friend("Prasanth", "P", "11", "pp@gmail.com", "HR", "Trichy", "GCT", "Tavant", "Banglore");
		actualOutput = friendRepo.checkDuplicate(friend);

		assertTrue(actualOutput);
	}

//@Test
	public void testAddFriend() {
		boolean actualOutput=false;
		Friend friend = new Friend("Pps", "P", "11", "pp@gmail.com", "HR", "Trichy", "GCT", "Tavant", "Banglore");
		friendRepo.addFriend(friend);
		Session session = HibernateUtilities.getSessionFactory().openSession();
		List<Friend> friends = session.createCriteria(Friend.class).list();
		for (Friend each_friend : friends) {
			if (each_friend.equals(friend)) {
				actualOutput=true;
			}
		}
		assertTrue(actualOutput);
	}

	@Test
	public void testDisplayFriendById() {
		Friend friend=friendRepo.displayFriendById(1);
		assertEquals("Software Enginner",friend.getDesignation());
		
	}

//	@Test
	public void testDeleteFriendById() {
		int id=1;
		boolean actualOutput=false;
		friendRepo.deleteFriendById(id);
		List<Friend> friends=friendRepo.findAll();
	for (Friend friend :friends){
		if(friend.getId()!=1)
			actualOutput=true;
	}
	assertTrue(actualOutput);
	}

	@Test
	public void testUpdateFriend() {

		Friend friend=friendRepo.displayFriendById(1);
		friend.setCompanyName("Zoho");
		Friend copy_friend=friendRepo.updateFriend(friend);
		assertEquals(friend.getCompanyName(),copy_friend.getCompanyName());
		
	}

	@Test
	public void testFindAll() {
		List<Friend> friends=friendRepo.findAll();
		assertEquals(friends.size(),5);
	}

}
