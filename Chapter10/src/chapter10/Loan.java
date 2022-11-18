package chapter10;

public class Loan {
	private int loanNumber;
	private double loanAmount;
	private int loanLengthInYears;
	private double annualInterestRate;
	
	Loan() {}
	
	Loan(int loanNumber, double loanAmount, double annualInterestRate, int loanLengthInYears)
	{
		setLoanNumber(loanNumber);
		setLoanAmount(loanAmount);
		setAnnualInterestRate(annualInterestRate);
		setLoanLengthInYears(loanLengthInYears);;
	}
	
	public int getLoanNumber() 
	{
		return loanNumber;
	}
	
	public void setLoanNumber(int loanNumber) 
	{
		this.loanNumber = loanNumber;
	}
	
	public double getLoanAmount() 
	{
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) 
	{
		this.loanAmount = loanAmount;
	}
	
	public int getLoanLengthInYears() 
	{
		return loanLengthInYears;
	}
	
	public void setLoanLengthInYears(int loanLengthInYears) 
	{
		this.loanLengthInYears = loanLengthInYears;
	}
	
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double calculateMonthlyPayment()
	{
		double monthlyInterestRate = annualInterestRate / 12;
		int loanLengthInMonths = loanLengthInYears * 12;
		double monthlyPayment;
		monthlyPayment = (loanAmount * monthlyInterestRate) / 
				( 1 - Math.pow(1 + monthlyInterestRate, -loanLengthInMonths));
		return monthlyPayment;
	}
	
	public void displayLoanDetails()
	{
		System.out.printf("\n*** Loan %d Details ***\n\n", loanNumber);
		System.out.printf("Loan Amount    : $%10.2f\nInterest Rate  : %11.2f\n",
				loanAmount, (annualInterestRate * 100));
		System.out.printf("Length of Loan : %11d\n", 
				loanLengthInYears);
		System.out.printf("Monthly Payment: $%10.2f\n", calculateMonthlyPayment());
	}
	
	public void displayInterestPaid()
	{
		// returns no values and calculates and displays 
		// the total amount of interest paid on the loan 
		// if the payee only pays the minimum amount required 
		// by the monthlyPayment 
		
		double interestPaid;
		double monthlyInterestRate = annualInterestRate / 12;
		int loanLengthInMonths = loanLengthInYears * 12;
		double monthlyPayment;
		monthlyPayment = (loanAmount * monthlyInterestRate) / 
				( 1 - Math.pow(1 + monthlyInterestRate, -loanLengthInMonths));
		
		interestPaid = (monthlyPayment * loanLengthInMonths) - loanAmount;
		System.out.printf("The total interest paid will be $%.2f.\n", interestPaid);	
	}

}
