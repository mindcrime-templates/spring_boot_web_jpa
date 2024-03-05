package org.fogbeam.template.spring.spring_boot_web_jpa.dto;

import java.util.Date;

public class Account 
{
	private String accountId;
	private String legalName;
	private String displayName;
	private Date dateCreated;
	
	public Account()
	{}
	
	public Account( final String accountId, final String legalName, final String displayName )
	{
		this.accountId = accountId;
		this.legalName = legalName;
		this.displayName = displayName;
		this.dateCreated = new Date();
	}

	public String getAccountId() 
	{
		return accountId;
	}

	public void setAccountId(String accountId) 
	{
		this.accountId = accountId;
	}

	public String getLegalName() 
	{
		return legalName;
	}

	public void setLegalName(String legalName) 
	{
		this.legalName = legalName;
	}

	public String getDisplayName() 
	{
		return displayName;
	}

	public void setDisplayName(String displayName) 
	{
		this.displayName = displayName;
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) 
	{
		this.dateCreated = dateCreated;
	}
	
}
