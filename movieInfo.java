package moviereservation;

/**
 * This class will save the information of movie.
 * @author raneem
 */
public class movieInfo {
    
    private String movieName;          //Movie name.
    private String movieTime;          //Movie time.
    private String movieType;          //Movie type.
    private String movieDuration;      //Movie duration.
   
    /**
     * Constructor 
     * @param movieName The name of the movie.
     * @param movieTime The time of the movie.
     * @param movieType The type of the movie.
     * @param movieDuration The duration of the movie.
     */
    public movieInfo(String movieName,String movieTime,String movieType,String movieDuration){
        this.movieName = movieName; 
        this.movieTime = movieTime; 
        this.movieType = movieType; 
        this.movieDuration = movieDuration; 
    }
    
    /**
     * Default Constructor
     */
    public movieInfo(){
        movieName = ""; 
        movieTime = ""; 
        movieType = ""; 
        movieDuration = ""; 
    }
    
    /**
     * The setMovieName method stores the name of movie.
     * @param movieName to store in movieName.
     */
    public void setMovieName(String movieName){
        this.movieName = movieName; 
    }
    
    /**
     * The setMovieTime method stores the time of movie.
     * @param movieTime to store in movieTime.
     */
    public void setMovieTime(String movieTime){
        this.movieTime = movieTime; 
    }
    
    /**
     * The setMovieType method stores the type of movie.
     * @param movieType to store in movieType.
     */
    public void setMovieType(String movieType){
        this.movieType = movieType; 
    }
    
    /**
     * The setMovieDuration method stores the duration of movie.
     * @param movieDuration to store in movieDuration.
     */
    public void setMovieDuration(String movieDuration){
        this.movieDuration = movieDuration; 
    }
    
    /**    
    The getMovieName method returns the name of movie.
    @return The name.
    */
    public String getMovieName(){
       return movieName;
    }
    
    /**    
    The getMovieTime method returns the name of movie.
    @return The time.
    */
    public String getMovieTime(){
       return movieTime;
    }
    
    /**    
    The getMovieType method returns the name of movie.
    @return The type.
    */
    public String getMovieType(){
       return movieType;
    }
    
    /**    
    The getMovieDuration method returns the name of movie.
    @return The duration.
    */
    public String getMovieDuration(){
       return movieDuration;
    }
    
    /**
      The toString method
      @return A String object containing the name,time,type,and duration
              of the movie.
    */
    public String toString(){
        return "\n" + "movie name: " + movieName
                + "\nmovie time: " + movieTime
                + "\nmovie type: " + movieType
                + "\nmovie duration: " + movieDuration;
    }
}
