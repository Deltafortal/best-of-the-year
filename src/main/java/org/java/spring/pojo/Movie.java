package org.java.spring.pojo;

public class Movie {

	
	//Declaring variables
	private int id;
    private String title;

    
    //Constructor
    public Movie(int id, String title) {
    	
        setId(id);
        setTitle(title);
    }


    
    //Id functions
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	
	//Title functions
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

    
    
    
	//TO String
	@Override
	public String toString() {
		
		return getId() + " - " + getTitle() + "\n";
	}
	
	
}
