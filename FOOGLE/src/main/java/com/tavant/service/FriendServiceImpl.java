package com.tavant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.model.Friend;
import com.tavant.repository.FriendRepositoryInterface;

@Service("friendService")
public class FriendServiceImpl implements FriendServiceInterface {
	@Autowired
	private FriendRepositoryInterface friendRepository;

	@Override
	public Friend addFriend(Friend friend) {
		return friendRepository.addFriend(friend);
	}

	@Override
	public Friend displayFriendById(int id) {
		return friendRepository.displayFriendById(id);
	}

	@Override
	public Friend deleteFriendById(int id) {
		return friendRepository.deleteFriendById(id);
	}

	@Override
	public Friend updateFriend( Friend friend) {
		return friendRepository.updateFriend( friend);
	}

	@Override
	public List<Friend> findAll() {
		return friendRepository.findAll();
	}

}
