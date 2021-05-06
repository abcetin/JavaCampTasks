package eTicaretKayýtSistemi.bussiness.concretes;

import eTicaretKayýtSistemi.bussiness.abstracts.CustomerService;
import eTicaretKayýtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayýtSistemi.core.utils.abstracts.ValidationService;
import eTicaretKayýtSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKayýtSistemi.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private EmailCheckSerivce mailCheck;
	private ValidationService validation;
	
	public CustomerManager(CustomerDao customerDao,EmailCheckSerivce mailCheck, ValidationService validation) {
		
		this.customerDao = customerDao;
		this.mailCheck = mailCheck;
		this.validation = validation;
	}

	@Override
	public void register(Customer customer) {
		
		if(mailCheck.checkEmail(customer) == true && validation.verifyCustomer(customer) == true) {
			if(customerDao.register(customer)==true) {
				mailCheck.sendVerifyMail(customer);
			}else {
				return;
			}
			
		}else {
			System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz.");
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		if(mailCheck.checkEmail(customer) == true  && validation.verifyCustomer(customer) == true) {
			customerDao.login(customer);
		}else {
			System.out.println("Giriþ Baþarýsýz");
		}
		
	}

}
