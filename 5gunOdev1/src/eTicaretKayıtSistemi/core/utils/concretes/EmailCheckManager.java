package eTicaretKayýtSistemi.core.utils.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKayýtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayýtSistemi.entities.concretes.Customer;

public class EmailCheckManager implements EmailCheckSerivce{

	private String regex = ".*@[a-z[0-9]]";
    private Pattern pattern = Pattern.compile(regex);
	
	@Override
	public boolean checkEmail(Customer customer) {
		Matcher match = pattern.matcher(customer.getEmail());
		if(!match.find()) {
			System.out.println("Lütfen E-Mail inizi kontrol ediniz.");
			return false;
		}
		return true;
	}

	@Override
	public void sendVerifyMail(Customer customer) {
		if(checkEmail(customer)==true) {
			System.out.println("Doðrulama Maili Gönderildi.");
		}
		
	}

	@Override
	public boolean existsEmail(List<Customer> customers, Customer customer) {
		for (Customer customer1 : customers) {
			if(customer1.getEmail() == customer.getEmail()) {
				
				return true;
			}
		}
		return false;
	}

	

	

	

	

}
