package com.example.MyFawry.bsl.Service;

public class Vodafone extends ServiceProvider{
	public String CreateRecharge(String phoneNumber, int amount) {
		
		if(phoneNumber.length() != 11) {
			return "Invalid phone number";
		}
		
		return "Vodafone Recharge is Done Succefully";
	}

	public String CreateInternet(String number, int amount) {
		return "Vodafone Internet is Renewed Succefully";
	}
}
