package eTicaretKayıtSistemi.core.utils.abstracts;

import java.util.List;

import eTicaretKayıtSistemi.entities.concretes.Customer;

public interface EmailCheckSerivce {
	boolean checkEmail(Customer customer);
	void sendVerifyMail(Customer customer);
	boolean existsEmail(List<Customer> customers, Customer customer);
}
