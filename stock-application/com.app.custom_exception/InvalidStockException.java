package com.app.custom_exceptions;

public class InvalidStockException extends Stock_exc {
	public InvalidStockException(String errMsg)
	{
		super(errMsg);
	}

}
