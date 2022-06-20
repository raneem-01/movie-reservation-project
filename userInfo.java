package moviereservation;

/**
 * This class will save the information of user.
 * @author raneem
 */
public class userInfo {
     
    private  String name;          //user's name.
    private  String phoneNumber;   //user's phone number.
    private  String email;         //user's email.
    private movieInfo movie;       //movie information that the customer chose.
        
    /**
     * Constructor
     * @param name The name of the user.
     * @param phoneNumber The phone number of the user.
     * @param email The email of the user.
     */    
    public userInfo(String name,String phoneNumber,String email){
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.email = email; 
    }
    
    /**
     * Default Constructor
     */
    public userInfo(){
        name = ""; 
        phoneNumber = "";
        email = ""; 
    }
    
    /**
    The setName method stores the name of user.
    @param name to store in name.
    */
    public void setName(String name){
        this.name = name; 
    }
    
    /**
    The setPhoneNumber method stores the phone number of user.
    @param phoneNumber to store in phoneNumber.
    */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber; 
    }
    
    /**
     * The setEmail method stores the email of user.
     * @param email to store in email.
     */
    public void setEmail(String email){
        this.email = email; 
    }
    
    /**
      The setMovie stores the information of the selected movie.
      @param movie to store in movie. 
     */
    public void setMovie(movieInfo movie){
        this.movie = movie;
    }
    
    /**    
    The getName method returns the name of user.
    @return The name.
    */
    public String getName(){
        return name;
    }
    
    /**
    The getPhoneNumber method returns the phone number of user.
    @return The phone number.
    */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /**
    The getEmail method returns the email of user.
    @return The email.
    */
    public String getEmail(){
        return email;
    }
    
    /**
    The getMovie method returns information of the selected movie.
    */
    public movieInfo getMovie(){
        return movie;
    }
    
    /**
      The toString method
      @return A String object containing the name,phone number,and email
              of the user and movie selected.
    */
    public String toString(){
        return  "Name: " + name + "\nphone number: " + phoneNumber 
                + "\nemail: " + email +"\n\nReservation information: "
                +getMovie();   
    }
}
