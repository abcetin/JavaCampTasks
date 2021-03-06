package eTicaretKayıtSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayıtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayıtSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKayıtSistemi.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	private List<Customer> customers = new ArrayList<Customer>(); 
	private EmailCheckSerivce checkService;
	
	public HibernateCustomerDao(EmailCheckSerivce checkService , List<Customer> customers ) {
		this.checkService = checkService;
		this.customers = customers;
	}

	@Override
	public boolean register(Customer customer) {
		
		if(checkService.existsEmail(customers, customer)== false) {
			customers.add(customer);
			System.out.println("Kayıt işlemi başarılı : "+ customer.getFirstName());
			return true;
		}else {
			System.out.println("Bu email hali hazırda mevcut");
			return false;
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		System.out.println("Başarıyla giriş yapıldı : "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hesabınız Silinmiştir : " + customer.getFirstName());
		
	}

	@Override
	public Customer get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
