package com.tcs.bean;

public class Speciality
{
	private int id;
	private String name;
	private String description;
	
	public Speciality() {}
	
	public Speciality(int id, String name, String desc)
	{
		this.setId(id);
		this.setName(name);
		this.setDescription(desc);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}