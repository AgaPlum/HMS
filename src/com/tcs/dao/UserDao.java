package com.tcs.dao;

import java.sql.*;
import com.tcs.bean.User;
import com.tcs.util.DataUtil;
import java.util.*;

public class UserDao {

	public void addUser(User item) throws SQLException
	{
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=DataUtil.getConnection();
		if (con!=null)
		{
			String sql="Insert into users values (user_id.nextval,?,?,?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1,item.getName());
			pst.setString(2,item.getUsername());
			pst.setString(3,item.getPassword());
			pst.setString(4,item.getEmail());
			pst.setString(5,item.getContactNumber());
			pst.setInt(6,item.getIsAdmin());
			pst.executeQuery();
		}
		DataUtil.closePreparedStmt(pst);
		DataUtil.closeConnection(con);
	}
	public ArrayList<User> selectUser(User item, int id) throws SQLException
	{
		ArrayList<User> userData=new ArrayList<User>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=DataUtil.getConnection();
		if (con!=null)
		{
			String sql="Select * from users where id=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs =pst.executeQuery();
			while(rs.next())
			{
				User it=new User();
				it.setId(id);
				it.setName(rs.getString(2));
				it.setUsername(rs.getString(3));
				it.setPassword(rs.getString(4));
				it.setEmail(rs.getString(5));
				it.setContactNumber(rs.getString(6));
				it.setIsAdmin(rs.getInt(7));
				userData.add(it);
			}
			
			DataUtil.closePreparedStmt(pst);
			DataUtil.closeConnection(con);
		}
		return userData;
	}
	public int checkUser(User item, String username, String pass) throws SQLException
	{		
			int out=0;
			Connection con =null;
			PreparedStatement pst=null;
			ResultSet rs=null;
			con=DataUtil.getConnection();
			if(con!=null)
			{
				String sql="Select password,id from users where username=?";
				pst=con.prepareStatement(sql);
				pst.setString(1, username);				
				rs=pst.executeQuery();
				while(rs.next())
				{
					User i =new User ();
					if(pass.equals(rs.getString(1)))
					{
						return out=rs.getInt(2);
					}
					else
					{
						return out=0;
					}
				}
				
			}
			DataUtil.closePreparedStmt(pst);
			DataUtil.closeConnection(con);
			return out;
	}
	
	//Checking to unique values 
	public int checkUserName(User user, String username)throws SQLException
	{
		int outp=1;
		Connection con =null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=DataUtil.getConnection();
		if(con!=null)
		{
			String sql="Select * from users where username=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, username);	
			rs=pst.executeQuery();
			while(!rs.next())
				{	
					return outp=0;
				}			
			}
		DataUtil.closePreparedStmt(pst);
		DataUtil.closeConnection(con);
		return outp;
	}
	public int checkMail(User user, String mail)throws SQLException
	{
		int outp=1;
		Connection con =null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=DataUtil.getConnection();
		if(con!=null)
		{
			String sql="Select * from users where email=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, mail);	
			rs=pst.executeQuery();
			while(!rs.next())
				{	
					return outp=0;
				}			
			}
		DataUtil.closePreparedStmt(pst);
		DataUtil.closeConnection(con);
		return outp;
	}
}
