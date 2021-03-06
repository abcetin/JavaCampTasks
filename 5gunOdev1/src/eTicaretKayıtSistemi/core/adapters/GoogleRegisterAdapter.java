package eTicaretKayıtSistemi.core.adapters;

import eTicaretKayıtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayıtSistemi.core.utils.abstracts.ValidationService;
import eTicaretKayıtSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKayıtSistemi.entities.concretes.Customer;
import eTicaretKayıtSistemi.googleRegister.GoogleRegisterManager;

public class GoogleRegisterAdapter implements GoogleService{

	private CustomerDao customerDao;
	private EmailCheckSerivce mailCheck;
	private ValidationService validation;
	
	public GoogleRegisterAdapter(CustomerDao customerDao, EmailCheckSerivce mailCheck, ValidationService validation) {
		this.customerDao = customerDao;
		this.mailCheck = mailCheck;
		this.validation = validation;
	}

	@Override
	public void register(Customer customer) {
		
		if(mailCheck.checkEmail(customer) == true && validation.verifyCustomer(customer) == true) {
			GoogleRegisterManager googleManager = new GoogleRegisterManager();
			googleManager.googleRegister(customer.getFirstName(),customer.getLastName(), customer.getEmail(), customer.getPassword());
			customerDao.register(customer);
		}else {
			System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz.");
		}
		
		
	}

	
}
