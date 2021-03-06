package eTicaretKayıtSistemi.bussiness.concretes;

import eTicaretKayıtSistemi.bussiness.abstracts.CustomerService;
import eTicaretKayıtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayıtSistemi.core.utils.abstracts.ValidationService;
import eTicaretKayıtSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKayıtSistemi.entities.concretes.Customer;

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
			System.out.println("Giriş Başarısız");
		}
		
	}

}
