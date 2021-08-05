public class TextStatement extends Statement {
    protected String resultStringStart(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }
    protected String getFigures(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }
    protected String resultStringEnd(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" + "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
