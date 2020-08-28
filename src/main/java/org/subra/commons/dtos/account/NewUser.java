package org.subra.commons.dtos.account;

import java.io.Serializable;

public class NewUser implements Serializable {
	private static final long serialVersionUID = -6827435358649484483L;
	private String email;
	private String password;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
