package com.tavant.service;

import java.util.List;

import com.tavant.model.Friend;

public interface FriendServiceInterface {

	Friend addFriend(Friend friend);

	Friend displayFriendById(int id);

	Friend deleteFriendById(int id);

	Friend updateFriend( Friend friend);

	List<Friend> findAll();

}