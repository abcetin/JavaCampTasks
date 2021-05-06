package eTicaretKayýtSistemi.core.utils.abstracts;

import java.util.List;

import eTicaretKayýtSistemi.entities.concretes.Customer;

public interface EmailCheckSerivce {
	boolean checkEmail(Customer customer);
	void sendVerifyMail(Customer customer);
	boolean existsEmail(List<Customer> customers, Customer customer);
}
