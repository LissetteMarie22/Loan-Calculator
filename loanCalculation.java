import java.text.DecimalFormat;
import java.util.Scanner;


public class loanCalculation {//Naming the loan calculation class.

	public static void main(String[] args) { //Main function for loan calculation program
		Scanner reader = new Scanner(System.in); //Calling up new scanner for reading user input
		System.out.println("Enter loan amount, for example 120000.95:"); //Asking user for the amount of their loan
		float loanAmount = reader.nextInt();//Scanner gets the loan amount the user puts in.
		System.out.println("Enter number of years as an integer, for example, 5:"); //Asks user to put in how many years they have to pay back the loan in.
        int loanTime = reader.nextInt();//Gets number of years user enters via Scanner object
		double interestRate =.05; //Sets interest rate to start at 5% in decimal form
        DecimalFormat twoDecFormatter = new DecimalFormat("#.00"); //Makes a decimal formatter for two decimal spots after the decimal
        DecimalFormat threeDecFormatter = new DecimalFormat("#.000"); //Makes a decimal formatter for three decimal spots after the decimal
		System.out.println("Interest Rate" + "\t" +"Monthly Payment" + "\t" + "Total Payment"); //Sets up chart for results.
        for( int i = 0; interestRate <= .081; i++){ //loop that calculates the different monthly and total payments for a loan based on the initial loan and given interest rate.
            double totalPayment = loanAmount + (loanAmount * interestRate);//Calculates total payment by multiplying loan amounrt by interest rate, then adding that to loan amount for final total.
            double monthlyPayment = (loanAmount * interestRate)/(1-Math.pow (1.0 + interestRate, loanTime * -12.0)); //Calculates montly payment.
            System.out.println(threeDecFormatter.format((interestRate * 100)) + "%" + "      \t" + twoDecFormatter.format(monthlyPayment) + "      \t" + twoDecFormatter.format(totalPayment)); //Prints out interest rate, then the monthly and total payments of the loan amount the user entered using this interest rate.
            interestRate += .00125; //Adds .125 to the interest rate which is 1/8 in decimal form.
        }
		
	}

}
