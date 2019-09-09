package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.ConnectionProvider;
import interfaces.dao;
import project.com.userpojo;

public class DaoImpl implements dao {
	private Connection con;
	private PreparedStatement ps;
  boolean b=false;
	int res;

	@Override
	public boolean add(userpojo up) {
			
		try {
		 con=ConnectionProvider.getConnection();
		 ps=con.prepareStatement("insert into signup values(?,?,?,?,?,?)");
		 ps.setString(1,up.getFirstname());
		 ps.setString(2,up.getLastname());
		 ps.setString(3,up.getEmail());
		 ps.setString(4,up.getPassword());
		 ps.setString(5,up.getRepassword());
		 ps.setLong(6,  up.getContact());
        
		 res= ps.executeUpdate();
		if(res>0)
		{
			b=true;
		}
		 
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Error in Dao");
			
		}
		return b;
	}

	@Override
	public boolean login(userpojo up1) {
		// TODO Auto-generated method stub
		boolean bb=false;
		try {
			
			con=ConnectionProvider.getConnection();
			ps=con.prepareStatement("select* from Signup where EMAIL = ? and PASSWORD = ? ");
			
			ps.setString(1,up1.getEmail());
			ps.setString(2,up1.getPassword());
			ResultSet res=ps.executeQuery();
			if(res.next())
			{
				bb=true;
			
				}
						
			} catch(Exception e) {
				
				e.printStackTrace();
			
				
				
			}
			
		
		return bb;
	}

	@Override
	public boolean update(userpojo up2) {
		
			boolean b3=false;
			
			try {
				con=ConnectionProvider.getConnection();
				ps=con.prepareStatement("UPDATE signup SET Firstname = ?,  Lastname = ?, Password = ?, Repassword = ?, Contact = ? where Email = ?");
				ps.setString(1, up2.getFirstname());
				ps.setString(2, up2.getLastname());

				ps.setString(3,up2.getPassword());
				ps.setString(4, up2.getRepassword());
				ps.setLong(5, up2.getContact());
				ps.setString(6, up2.getEmail());
				
				
				 res= ps.executeUpdate();
					if(res>0)
					{
						b3=true;
					}
					 
					}catch(Exception e) {
						System.out.println(e);
						System.out.println("Losser");
						
					}
				
			
		return b3;
	}

	@Override
	public boolean delete(String email) {
		
		boolean b4=false;
		
		try {
			con=ConnectionProvider.getConnection();
			ps=con.prepareStatement("DELETE from signup where Email=?");
			ps.setString(1, email);
			
			res=ps.executeUpdate();
			
			if(res>0) {
				
				b4=true;
			}
			

		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Bad luck");
		}
		
		
		
		return b4;
	}

	

	
}


