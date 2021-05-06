package eTicaretKayýtSistemi.core.utils.abstracts;

import eTicaretKayýtSistemi.entities.concretes.Customer;

public interface ValidationService {
	boolean verifyCustomer(Customer customer);
}
