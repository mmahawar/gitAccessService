package com.profile.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	@JsonProperty("login")
	public String loginId;

	@JsonProperty("name")
	public String name;

	@JsonProperty("company")
	public String company;

	@JsonProperty("blog")
	public String blog;

	public User() {
	}

	public User(String loginId, String name, String company, String blog) {
		name = loginId;
		this.name = name;
		this.company = company;
		this.blog = blog;
	}

	@Override
	public String toString() {
		return name + ",  " + loginId + ", " + company + ", " + blog;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}
}
