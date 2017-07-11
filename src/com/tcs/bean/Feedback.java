package com.tcs.bean;

public class Feedback
{
	private int id;
	private int userId;
	private String category;
	private String description;
	private int rating;
	
	public Feedback() {}
	
	public Feedback(int id, int userId, String category, String description, int rating)
	{
		this.setId(id);
		this.setUserId(userId);
		this.setCategory(category);
		this.setDescription(description);
		this.setRating(rating);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getRating()
	{
		return rating;
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}
}