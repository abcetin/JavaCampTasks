package eTicaretKayýtSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayýtSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKayýtSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKayýtSistemi.entities.concretes.Customer;

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
			System.out.println("Kayýt iþlemi baþarýlý : "+ customer.getFirstName());
			return true;
		}else {
			System.out.println("Bu email hali hazýrda mevcut");
			return false;
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		System.out.println("Baþarýyla giriþ yapýldý : "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hesabýnýz Silinmiþtir : " + customer.getFirstName());
		
	}

	@Override
	public Customer get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
