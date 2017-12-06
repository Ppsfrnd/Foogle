package com.tavant.repository;

import java.util.List;

import com.tavant.model.Friend;

public interface FriendRepositoryInterface {

	boolean checkDuplicate(Friend f);

	Friend addFriend(Friend friend);

	Friend displayFriendById(int id);

	Friend deleteFriendById(int id);

	Friend updateFriend( Friend friend);

	List<Friend> findAll();

}