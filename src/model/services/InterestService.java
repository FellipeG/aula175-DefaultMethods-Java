package model.services;

public interface InterestService {
	
	double getInterestRate();
	double payment(double amount, int months);

}
