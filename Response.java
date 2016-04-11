package in.vit.lending.generic.util;

/*
 ****************************************************************
Response .java
version 1.0
09,February 2016

Copyright (c) 2015, www.vit.in
All rights reserved
 *****************************************************************
 */

/**
 * This class is a response class for search and listing the hotels.
 * @author janani.m
 *
 * @version 1.0
 */

public class Response {

	private String status;
	private Object content;
	private int errorCode;
	private Throwable errorDescription;
	private String changeComments;
	private String testComments;

	/**
	 * Default Constructor
	 */

	protected Response(){}

	/**
	 *@Param status
	 *@Param content
	 *
	 */

	public Response(String status, Object content) {
		this.status = status;
		this.content = content;
	}

	/**
	 *@Param status
	 *@Param errorCode
	 *@Param errorDescription
	 */

	public Response(String status, int errorCode, Throwable errorDescription) {
		this.status = status;
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		/*setErrorDescription(errorDescription);*/

	}

	/**
	 * @param status
	 * @param errorCode
	 * @param errorDescription
	 * @param content
	 */
	public Response(String status, int errorCode, Throwable errorDescription, Object content) {
		this.status = status;
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.content = content;
	}


	/**
	 * @return the status
	 */

	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the content
	 */

	public Object getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */

	public void setContent(Object content) {
		this.content = content;
	}

	/**
	 * @return the errorCode
	 */

	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorDescription
	 */

	public Throwable getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */

	public void setErrorDescription(Throwable errorDescription) {
		this.errorDescription = errorDescription;
	}

}
