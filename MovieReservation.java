package moviereservation;

import java.io.*; //Needed for file I/O class.
import java.util.ArrayList; //Needed for array list class.
import java.util.Scanner;  //Needed for the Scanner classes.


/**
 *
 * @author raneem
 */
public class MovieReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
      
        String name;             //customer name.
        String phoneNumber;      //customer phone number.
        String email;            //customer email.
        int choiceDay;           //Customer's choice of movie day.
        int choiceMovie = 0;     //Customer's choice of movie.
        double ticketPrice;      //Price of movie ticket.
        char userChoice=' ';     //user's choice (yes or no)
        int choiceSnack;         //Customer's choice of snack.
        double snackPrice = 0;   //Price of snack.
        String input;            //User input.
        String cardNumber ;      //Number of the card.
        String ownerName;        //Name of the card owner.
        String expiryDate;       //Expiration date of the card.
        
        
        
        //open file.
        PrintWriter outputFile = new PrintWriter("Reservation.txt");
        File file = new File("Reservation.txt");
        
        //Create a scanner object to read from the file. 
        Scanner inputFile = new Scanner(file);
        
        //create an ArrayList
        ArrayList<String> listUser = new ArrayList<>();
        ArrayList<String> listMovie = new ArrayList<>();
        ArrayList<String> listCardInfo = new ArrayList<>();
        
        //Create a Scanner object to read from the keyboard.
        Scanner keyboard = new Scanner(System.in);
        
        //Declare and instantiate a userInfo object.
        userInfo user1 = new userInfo();
        
        //Declare and instantiate a creditCard object.
        creditCard card1 = new creditCard();
  
        //Declare and instantiate a totalCost object.
        totalCost cost1 = new totalCost();
        
        //Declare and instantiate a movieData object.
        movieInfo movie1 = new movieInfo(); 
        
        
        
        
        System.out.println("\t\t------------------------------------"
                + "\n\t\t\tFill your details"
                + "\n\t\t------------------------------------\n");
        
        //get customer name, set it to object, and add to array list.
        System.out.println("Please, Enter your name:");
        name = keyboard.nextLine(); 
        user1.setName(name);
        listUser.add(name);
        
        //get customer phone number, set it to object, and add to array list.
        System.out.println("Please, Enter your phone number:");
        phoneNumber = keyboard.nextLine();
        user1.setPhoneNumber(phoneNumber);
        listUser.add(phoneNumber);
        
        //get customer email, set it to object, and add to array list.
        System.out.println("Please, Enter your email:");
        email = keyboard.nextLine();
        user1.setEmail(email);  
        listUser.add(email);
        
        System.out.println(user1.getName());
        
        
        
        
        System.out.println("\n\t\t------------------------------------"
                + "\n\t\t     Choose the day and the movie"
                + "\n\t\t------------------------------------\n");
        
        //Prompt the customers to get day of movie.
        System.out.println("Choose the day you want:\n1-Friday\n2-Saturday");
        choiceDay = keyboard.nextInt();
        
        //If the input is not available, the customer is requested to re-enter.
        while(choiceDay != 1 && choiceDay != 2 ){
            System.out.println("Choose available day you want");
            choiceDay = keyboard.nextInt();
        } 
        
        //Add the selected day to array.
        if(choiceDay == 1){
            listMovie.add("Friday");
        }else if(choiceDay == 2){
            listMovie.add("Saturday");
        }
        
        
        //Two cases each case call method of movie in the day selected.
        switch (choiceDay){
            case 1 : movieFriday();
            choiceMovie = keyboard.nextInt();
            
          //If the input is not available,the customer is requested to re-enter.
            while(choiceMovie != 1 && choiceMovie != 2 && choiceMovie != 3 
                    && choiceMovie != 4){
            System.out.println("Choose available movie");
            choiceMovie = keyboard.nextInt();
            }
            
            //Assign movie information to (movie1) object,
            //and Add the selected movie to array.
            switch (choiceMovie){
                case 1: movie1.setMovieName("Shawming"); 
                listMovie.add("Shawming"); movie1.setMovieTime("9:05pm"); 
                movie1.setMovieType("Comedy"); listMovie.add("Comedy");
                movie1.setMovieDuration("112min"); break;
                
                case 2: movie1.setMovieName("Boss Level"); 
                listMovie.add("Boss Level"); movie1.setMovieTime("8:10pm"); 
                movie1.setMovieType("Action"); listMovie.add("Action");
                movie1.setMovieDuration("100min"); break;
                
                case 3: movie1.setMovieName("Chaos Walking"); 
                listMovie.add("Chaos Walking"); movie1.setMovieTime("7:15pm");
                movie1.setMovieType("Adventure"); listMovie.add("Adventure");
                movie1.setMovieDuration("109min"); break;
                
                case 4: movie1.setMovieName("Seventh Day"); 
                listMovie.add("Seventh Day"); movie1.setMovieTime("10:00pm");
                movie1.setMovieType("Action"); listMovie.add("Action");
                movie1.setMovieDuration("87min"); break;    
            }
            break; //Case 1 in first switch.
            
            case 2 : movieSaturday();
            choiceMovie = keyboard.nextInt();
            
          //If the input is not available,the customer is requested to re-enter.
            while(choiceMovie != 1 && choiceMovie != 2 && choiceMovie != 3 
                    && choiceMovie != 4){
            System.out.println("Choose available movie");
            choiceMovie = keyboard.nextInt();
            }
            
            //Assign movie information to (movie1) object,
            //and Add the selected movie to array.
            switch (choiceMovie){
                case 1: movie1.setMovieName("Waafet Reggaala"); 
                listMovie.add("Waafet Reggaala");movie1.setMovieTime("12:05am");
                movie1.setMovieType("Comedy"); listMovie.add("Comedy");
                movie1.setMovieDuration("117min"); break;
                
                case 2: movie1.setMovieName("Nobody"); listMovie.add("Nobody"); 
                movie1.setMovieTime("11:20pm"); movie1.setMovieType("Action"); 
                listMovie.add("Action");movie1.setMovieDuration("92min"); break;
                
                case 3: movie1.setMovieName("Had Eltar"); 
                listMovie.add("Had Eltar"); movie1.setMovieTime("9:40pm"); 
                movie1.setMovieType("Drama"); listMovie.add("Drama");
                movie1.setMovieDuration("95min"); break;
                
                case 4: movie1.setMovieName("Boss Level");
                listMovie.add("Boss Level"); movie1.setMovieTime("5:50pm"); 
                movie1.setMovieType("Action"); listMovie.add("Action");
                movie1.setMovieDuration("100min");
                break;    
            }
            break; //Case 2 in first switch.
        }//End switch.
        
        
        //Get the price from ticketPrice method and assign it to (cost1) object.
        ticketPrice = ticketPrice(choiceMovie);
        cost1.setTicketPrice(ticketPrice);


        System.out.println("\n\t\t------------------------------------"
                + "\n\t\t\t\tSnacks"
                + "\n\t\t------------------------------------\n");
        
        //Ask the customer if they wants snacks.
        System.out.println("Do you want snack (Y/N)?");
        input = keyboard.nextLine();
        userChoice = keyboard.nextLine().charAt(0);
       
        //Since the userChoice equal yes enter loop.
        while(userChoice == 'y' || userChoice == 'Y'){
            
            //If user input is y (yes), user is allowed to choose snack.
            switch (userChoice) {
                case 'y':
                case 'Y': 
                    //Call snack method and get choice snack from customer.
                    snacks(); System.out.println("Which one do you want: ");
                    choiceSnack = keyboard.nextInt();
                    snackPrice += snackPrice(choiceSnack);
                    cost1.setSnackPrice(snackPrice);
                    System.out.println("Do you want something else (Y/N)?");
                    input = keyboard.nextLine();
                    userChoice = keyboard.nextLine().charAt(0);
                    break;
                case 'n':
                case 'N': break;
                default : System.out.println("Incorrect input.");
            }
        }
        
        System.out.println("\n\t\t------------------------------------"
                + "\n\t\t\t    Total Cost "
                + "\n\t\t------------------------------------\n");
        
        //Display total cost.
        System.out.println(cost1);
 
          
        System.out.println("\n\t\t------------------------------------"
                + "\n\t\t\t\tPay"
                + "\n\t\t------------------------------------\n");
        
        //Get name of the card owner, set it to card1, and add to array list.
        System.out.println("Enter the name of the card owner:");
        ownerName = keyboard.nextLine();
        card1.setNameOwnerCard(ownerName);
        listCardInfo.add(ownerName);
     
        
        //Get number of the card, set it to card1, and add to array list.
        System.out.println("Enter the card number:");
        cardNumber = keyboard.nextLine();
        card1.setCardNumber(cardNumber);
        listCardInfo.add(cardNumber);
        
        //Get the expiration date of the card, set it to card1,
        //and add to array list.
        System.out.println("Enter the expiration date of the card "
                + "(month/year):");
        expiryDate = keyboard.nextLine();
        card1.setExpiryDate(expiryDate);
        listCardInfo.add(expiryDate);

        
        System.out.println("\n\t\t------------------------------------"
                + "\n\t\t\tCustomer Information"
                + "\n\t\t------------------------------------\n");
       
        //Display customer information.
        user1.setMovie(movie1);
        System.out.println(user1.toString());
         

        //Display the elements of array in the file.
        outputFile.println("Customer Information");
        outputFile.println(listUser);
       
        //Display the elements of array in the file.
        outputFile.println("\nMovie Information");
        outputFile.println(listMovie);
        
        //Display the elements of array in the file.
        outputFile.println("\nCard Information");
        outputFile.println(listCardInfo);

        
        
        
        //Read lines from the file until no more are left.
        while (inputFile.hasNext()){
            String str = inputFile.nextLine();
            System.out.println(str);
        }
        
        //Close file.
        inputFile.close();
        outputFile.close();
    }
    
    
    
    //Method display the movies for friday.
    public static void movieFriday(){
        
        System.out.println("\n   Movie\t   Time\t\tDuration   Type\t\tPrice\n");
        System.out.println("1- Shawming\t   9:05pm\t112min\t   Comedy\t60");
        System.out.println("2- Boss Level\t   8:10pm\t100min\t   Action\t40");
        System.out.println("3- Chaos Walking   7:15pm\t109min\t   Adventure\t50");
        System.out.println("4- Seventh Day\t   10:00pm\t87min\t   Action\t40");
        
        System.out.println("What is your choice?");
    }
     
    
    //Method display the movies for saturday.
    public static void movieSaturday(){
        
        System.out.println("   Movie\t    Time\tDuration  Type\t   Price\n");
        System.out.println("1- Waafet Reggaala  12:05am\t117min\t  Comedy   60");
        System.out.println("2- Nobody\t    11:20pm\t92min\t  Action   40");
        System.out.println("3- Had Eltar\t    9:40pm\t95min\t  Drama\t   50");
        System.out.println("4- Boss Level\t    5:50pm\t100min\t  Action   40");
        
        System.out.println("What is your choice?");
    }
    
    
    //Method display the snacks.
    public static void snacks(){
        System.out.println("\n\t\tmenu \n"
                + "\n\tItem\t\tPrice"
                + "\n1-\tpopcorn\t\t23"
                + "\n2-\tNachos\t\t30"
                + "\n3-\tHot dog\t\t30"
                + "\n4-\tSoft drinks\t15\n");
    }
    
    
    //Method return the price of ticket.
    public static double ticketPrice(int choiceMovie){
        double price = 0; //Price of movie ticket.
        
        switch (choiceMovie){
            case 1: price = 60; break;
            case 2: price = 40; break;
            case 3: price = 50; break;
            case 4: price = 40; break;
               
        }
        return price;
    }
    
    //Method return the price of snack.
    public static double snackPrice(int choiceSnack){
        double price = 0; //Price of snacks.
        
        switch (choiceSnack){
            case 1: price = 23; break;
            case 2: price = 30; break;
            case 3: price = 30; break;
            case 4: price = 15; break;
        }
        return price;
    }
   
}
