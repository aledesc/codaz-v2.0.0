package com.srvw.sse.domain;

import java.util.UUID;

public class Principal
{
	private final long id;
	private final String user;
	private final String passw;
	private final String token;

	/**
	 * Principal vacio. Se denota para indicar Fallo en la autenticacion
	 * 
	 * 
	 * @return
	 */
	public Principal()
	{
		super();
		this.id=-1;
		user=null;
		passw=null;
		token=null;
	}


	public Principal(long id)
	{
		super();
		this.id=id;
		this.user = null;
		this.passw = null;
		this.token = UUID.randomUUID().toString();	
	}

	public Principal(long id, String user, String passw)
	{
		super();
		this.id=id;
		this.user = user;
		this.passw = passw;
		this.token = UUID.randomUUID().toString();	
	}

	public String getUser()
	{
		return user;
	}

	public String getPassw()
	{
		return passw;
	}

	public String getToken()
	{
		return token;
	}
	
	public long getId()
	{
		return id;
	}

}
