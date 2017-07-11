package com.tcs.bean;

public class Booking
{
	private int id;
	private int userId;
	private int roomId;
	private long dateBegin;
	private long dateEnd;
	
	public Booking() {}
	
	public Booking(int id, int userId, int roomId, long dateBegin, long dateEnd)
	{
		this.setId(id);
		this.setUserId(userId);
		this.setRoomId(roomId);
		this.setDateBegin(dateBegin);
		this.setDateEnd(dateEnd);
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

	public int getRoomId()
	{
		return roomId;
	}

	public void setRoomId(int roomId)
	{
		this.roomId = roomId;
	}

	public long getDateBegin()
	{
		return dateBegin;
	}

	public void setDateBegin(long dateBegin)
	{
		this.dateBegin = dateBegin;
	}

	public long getDateEnd()
	{
		return dateEnd;
	}

	public void setDateEnd(long dateEnd)
	{
		this.dateEnd = dateEnd;
	}
}