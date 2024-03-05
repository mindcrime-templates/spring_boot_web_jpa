package org.fogbeam.template.spring.spring_boot_web_jpa.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sample
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private Date dateCreated;
	
	
	public Sample()
	{
		
	}
	
	
	public void setId( Long id )
	{
		this.id = id;
	}
	
	public Long getId()
	{
		return id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public void setDateCreated( Date dateCreated )
	{
		this.dateCreated = dateCreated;
	}	
}