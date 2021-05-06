package eTicaretKayýtSistemi.bussiness.abstracts;

import eTicaretKayýtSistemi.entities.concretes.Customer;

public interface CustomerService {

	void register(Customer customer);
	void login(Customer customer);
}
