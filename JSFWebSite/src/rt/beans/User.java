package rt.beans;

public class User {
		  private String name;
		  private String password;
		  private String username;
		  private int age;
		  
		  public User()
		  {	  
		  }
		  
		  public String getUsername()
		  {
			  return username;
		  }
		  
		  public void setUsername(String username)
		  {
			  this.username = username;
		  }
		  
		  public int getAge()
		  {
			  return age;
		  }
		  
		  public void setAge(int age)
		  {
			  this.age = age;
		  }
		  
		  public String getName() {
		    return name;
		  }
		  
		  public void setName(String name) {
		    this.name = name;
		  }
		  public String getPassword() {
		    return password;
		  }
		  public void setPassword(String password) {
		    this.password = password;
		  }
		  
		  public String login(){
		    // Image here a database access to validate the users
		    if (name.equalsIgnoreCase("tester") && password.equalsIgnoreCase("tester")){
		      return "success";
		    }else if (name.equalsIgnoreCase("tester1") && password.equalsIgnoreCase("tester1")){
		    	return "success1";
		    } else {
		      return "failed";
		    }
		    
		  }

}
