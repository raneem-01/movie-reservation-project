package moviereservation;

/**
 * This class will save the Card data
 * @author raneem
 */
public class creditCard {
    
    private String nameOwnerCard;     //Name of the owner of the card.
    private String cardNumber;        //The number of the card.
    private String expiryDate;        //The expiry date of the card.
    
    /**
     * Constructor
     * @param nameOwnerCard The name of the owner of the card.
     * @param cardNumber The number of the card.
     * @param expiryDate The expiry date of the card.
     */
    public creditCard(String nameOwnerCard,String cardNumber,String expiryDate){
        this.nameOwnerCard = nameOwnerCard;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
     
    /**
     * Default Constructor
     */
    public creditCard(){
        nameOwnerCard = "";
        cardNumber = "";
        expiryDate = "";
    }
    
    /**
     * The setNameOwnerCard method stores name of the owner of the card.
     * @param nameOwnerCard to store in nameOwnerCard.
     */
    public void setNameOwnerCard(String nameOwnerCard){
        this.nameOwnerCard = nameOwnerCard;
    }
    
    /**
     * The setCardNumber method stores the number of the card
     * @param cardNumber to store in cardNumber.
     */
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    /**
     * The setExpiryDate method stores the expiry date of the card.
     * @param expiryDate to store in expiryDate.
     */
    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
    
    /**    
    The getTicketPrice method returns name of the owner of the card.
    @return The name owner card.
    */
    public String getNameOwnerCard(){
       return nameOwnerCard;
    }
    
    /**    
    The getTicketPrice method returns the number of the card.
    @return The card number.
    */
    public String getCardNumber(){
        return cardNumber;
    }
    
    /**    
    The getTicketPrice method returns the expiry date of the card.
    @return The expiry date.
    */
    public String getExpiryDate(){
        return expiryDate;
    }
    
}
