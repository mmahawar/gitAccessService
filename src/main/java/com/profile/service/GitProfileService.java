package com.profile.service;

import java.io.IOException;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.profile.model.User;

public class GitProfileService {

	private static final Logger logger = LoggerFactory
			.getLogger(GitProfileService.class);

	public static User accessGitPublicProfile(String profileName) throws JsonParseException, IOException {
		logger.info("Requested profile is " + profileName);
		
		javax.ws.rs.client.Client client = ClientBuilder.newClient();
		Builder request = client.target("https://api.github.com").path("/users/"+ profileName).request();
		String response = request.get(String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(response,User.class);
		
		return user;

	}
}
