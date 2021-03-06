package eTicaretKayıtSistemi.core.utils.concretes;

import eTicaretKayıtSistemi.core.utils.abstracts.ValidationService;
import eTicaretKayıtSistemi.entities.concretes.Customer;

public class ValidationRules implements ValidationService {

	public boolean verifyCustomer(Customer customer) {
		if(customer.getFirstName().length() > 2 && customer.getLastName().length() > 2 && customer.getPassword().length() > 6 && 
				!customer.getPassword().isEmpty() && !customer.getEmail().isEmpty())  {
			return true;
		}else {
			System.out.println("Kullanıcı Bilgileri Hatalı Veya Eksik!");
			return false;
		}
	}
}
