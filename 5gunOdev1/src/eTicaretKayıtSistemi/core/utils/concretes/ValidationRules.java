package eTicaretKayýtSistemi.core.utils.concretes;

import eTicaretKayýtSistemi.core.utils.abstracts.ValidationService;
import eTicaretKayýtSistemi.entities.concretes.Customer;

public class ValidationRules implements ValidationService {

	public boolean verifyCustomer(Customer customer) {
		if(customer.getFirstName().length() > 2 && customer.getLastName().length() > 2 && customer.getPassword().length() > 6 && 
				!customer.getPassword().isEmpty() && !customer.getEmail().isEmpty())  {
			return true;
		}else {
			System.out.println("Kullanýcý Bilgileri Hatalý Veya Eksik!");
			return false;
		}
	}
}
