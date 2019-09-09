package interfaces;

import project.com.userpojo;

public interface dao {
public boolean add (userpojo up); 
	
	public boolean login(userpojo up1);
	
	public boolean update(userpojo up2);
	
	public boolean delete(String email);

}
