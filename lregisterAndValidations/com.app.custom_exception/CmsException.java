package com.app.custom_exception;
@SuppressWarnings("serial")
public class CmsException extends Exception {
	public CmsException(String errMsg)
	{
		super(errMsg);
	}

}
