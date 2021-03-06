package eTicaretKayıtSistemi;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayıtSistemi.bussiness.concretes.CustomerManager;
import eTicaretKayıtSistemi.core.adapters.GoogleRegisterAdapter;
import eTicaretKayıtSistemi.core.utils.concretes.EmailCheckManager;
import eTicaretKayıtSistemi.core.utils.concretes.ValidationRules;
import eTicaretKayıtSistemi.dataAccess.concretes.HibernateCustomerDao;
import eTicaretKayıtSistemi.entities.concretes.Customer;

public class Main {


	public static void main(String[] args) {
		
		
		Customer customer = new Customer(1, "Abdullah", "ÇETİN", "cetin@h.com", "1234567");
		Customer customer2 = new Customer(1, "Abdullah", "ÇETİN", "cetin@h1.com", "1234567");
		Customer customer3 = new Customer(1, "ab", "ÇETİN", "cetin@h2.com", "1234567");
		Customer customer4 = new Customer(1, "abc", "ÇETİN", "cetin@h3.com", "123456");
		Customer customer5 = new Customer(1, "abc", "ÇETİN", "cetin@", "123456");
		Customer customer6 = new Customer(1, "abc", "ÇETİN", "cetin@", "1234567");
		Customer customer7 = new Customer(1, "abc", "ÇETİN", "cetin@h3.com", "123456");
		
		List<Customer> customers = new ArrayList<Customer>(); 
		customers.add(customer4);
		customers.add(customer3);
		
		
		CustomerManager manager = new CustomerManager(new HibernateCustomerDao(new EmailCheckManager(), customers ),
				new EmailCheckManager(), new ValidationRules());
		
		GoogleRegisterAdapter googleAdapter = new GoogleRegisterAdapter(new HibernateCustomerDao(new EmailCheckManager(), customers ),
				new EmailCheckManager(), new ValidationRules());
		
		
		googleAdapter.register(customer);
		System.out.println("-------------------------------");
		googleAdapter.register(customer6);
		System.out.println("-------------------------------");
		googleAdapter.register(customer7);
		System.out.println("-------------------------------");
		manager.register(customer2);
		System.out.println("-------------------------------");
		manager.login(customer);
		System.out.println("-------------------------------");
		manager.register(customer);
		System.out.println("-------------------------------");
		manager.register(customer3);
		System.out.println("-------------------------------");
		manager.register(customer4);
		System.out.println("-------------------------------");
		manager.register(customer5);
	}

}
