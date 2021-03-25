package com.srvw.sse.util;

public class Result
{
	public static int NOK = -1;
	public static int OK = 1;
	
	private int result;

	
	public Result()
	{
		super();
		result = OK;
	}

	public void setOK()
	{
		this.result = OK;
	}
	
	public void setNOK()
	{
		this.result = NOK;
	}
	
	public int getResult()
	{
		return result;
	}

	@Override
	public String toString()
	{
		return "Result [result=" + result + "]";
	}

	
}
