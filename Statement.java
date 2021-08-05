import java.util.Enumeration;

public abstract class Statement {
    protected abstract String resultStringStart(Customer aCustomer);
	protected abstract String getFigures(Rental aRental);
	protected abstract String resultStringEnd(Customer aCustomer);

	public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = resultStringStart(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += getFigures(each);
      }
      result += resultStringEnd(aCustomer);
      return result;
   }
}
