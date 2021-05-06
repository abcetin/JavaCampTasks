package eTicaretKayýtSistemi.dataAccess.abstracts;

import eTicaretKayýtSistemi.entities.concretes.Customer;

public interface CustomerDao {
	boolean register(Customer customer);
	void login(Customer customer);
	void delete(Customer customer);
	Customer get(String email);
	
}
