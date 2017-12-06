package com.tavant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.model.Friend;
import com.tavant.service.FriendServiceInterface;

@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "http://localhost:4200")

public class FriendController {
	@Autowired
	private FriendServiceInterface friendService;

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public Friend createFriend(@RequestBody Friend friend) {

		return friendService.addFriend(friend);
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public Friend deleteFriend(@PathVariable int id) {

		return friendService.deleteFriendById(id);
	}

	@RequestMapping(value = "display/{id}", method = RequestMethod.GET)
	public Friend displayFriend(@PathVariable int id) {
		Friend friend = new Friend();
		Friend displayFriend = friendService.displayFriendById(id);
		if (displayFriend != null) {
			return displayFriend;
		}
		return friend;
	}

	@RequestMapping(value = "listAll", method = RequestMethod.GET)
	public List<Friend> findAll() {
		return friendService.findAll();
	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public Friend updateFriend( @RequestBody Friend friend) {

		return friendService.updateFriend( friend);
	}
}
