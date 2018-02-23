package com.tavant;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.MockitoAnnotations;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tavant.model.Friend;
import com.tavant.repository.FriendRepository;
import com.tavant.service.FriendServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendsFinderApplicationTests {

	@Mock
	private FriendRepository friendRepository;
	
	@InjectMocks
	private FriendServiceImpl friendService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testGetToDoById(){
		Friend friend = new Friend();
		friend.setId(3);
		when(friendRepository.displayFriendById(3)).thenReturn(friend);
		
		Friend result = friendService.displayFriendById(3);
		verify(friendRepository).displayFriendById(3);
		assertEquals(3, result.getId());
	}
	

}

