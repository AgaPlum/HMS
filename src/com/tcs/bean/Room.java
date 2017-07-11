package com.tcs.bean;

public class Room
{
	private int roomId;
	private String description;
	private String category;
	private double price;
	private boolean active;
	private String imageUrl;
	
	public Room() {}
	
	public Room(int id, String desc, String cat, double price, boolean active, String image)
	{
		this.setRoomId(id);
		this.setDescription(desc);
		this.setCategory(cat);
		this.setPrice(price);
		this.setActive(active);
		this.setImageUrl(image);
	}

	public int getRoomId()
	{
		return roomId;
	}

	public void setRoomId(int roomId)
	{
		this.roomId = roomId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}
}