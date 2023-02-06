public class Main {

    public static void main(String[] args) {
	double oneMonthInterest = 0;
	double oneMonthBalance = 0;
	double twoMonthInterest = 0;
	double cardBalance = 5000;
	double INTEREST_RATE = .17;
	oneMonthInterest = cardBalance * INTEREST_RATE; // calculates the interest after one month by multiplying the initial balance of $5000 by the interest rate of 17%
	System.out.println("The interest after one month is $" + oneMonthInterest); // outputs the interest after one month
	oneMonthBalance = cardBalance + oneMonthInterest; // calculating the balance after one month by adding the initial balance and the interest. Stores the value in oneMonthBalance
	twoMonthInterest = oneMonthBalance * INTEREST_RATE; // calculate interest after two months by multiplying balance at the end of one month by the interest rate of 17%
	System.out.println("The interest after two months is $" + twoMonthInterest); // outputs the interest after two months


    }
}
