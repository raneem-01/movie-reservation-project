package moviereservation;

/**
 * This class will calculates the total price and saves.
 * @author raneem
 */
public class totalCost {
     
    private double ticketPrice;         //Price of movie ticket.
    private double snackPrice;          //Price of snack.
    private final double tax = 0.15;    //Tax rate.
    private double subTotal;            //Price of ( ticket + snack ).

    
    /**
     * Constructor
     * @param ticketPrice the price of ticket.
     * @param snackPrice the price of snack.
     */
    public totalCost(double ticketPrice, double snackPrice){
       this.ticketPrice = ticketPrice;
       this.snackPrice = snackPrice;
    }
    
    /**
     * Default Constructor
     */
    public totalCost(){
        ticketPrice = 0.0;
        snackPrice = 0.0;
    }
    
    /**
     * The setTicketPrice method stores the price of ticket.
     * @param ticketPrice to store in ticketPrice.
     */
    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    
    /**
     * The setSnackPrice method stores the price of snack.
     * @param snackPrice to store in snackPrice.
     */
    public void setSnackPrice(double snackPrice){
        this.snackPrice = snackPrice;
    }
    
    /**    
    The getTicketPrice method returns price of ticket.
    @return The price.
    */
    public double getTicketPrice(){
        return ticketPrice;
    }
    
    /**    
    The getSnackPrice method returns the price of snack.
    @return The price.
    */
    public double getSnackPrice(){
        return snackPrice;
    }
    
    /**    
    The getSubTotal method returns the sub total.
    @return The subTotal.
    */
    public double getSubTotal(){
        subTotal = getTicketPrice() + getSnackPrice();
        return subTotal;
    }
    
    /**    
    The getTax method returns the tax.
    @return The tax.
    */
    public double getTax(){
        return tax * getSubTotal();
    }
    
    /**    
    The getTotal method returns the total price.
    @return The total price.
    */
    public double getTotal(){
        return  getSubTotal() + getTax();
    }
    
    /**
      The toString method
      @return A String object containing the ticket price,snack price,
        and total cost.
    */
    public String toString(){
        return "Ticket price = $"+ ticketPrice + ", Snack price = $"
                + snackPrice +", Total cost with tax = $"+getTotal() + ".";
    }
}
