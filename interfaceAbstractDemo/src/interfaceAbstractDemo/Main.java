package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Abdullah", "ÇETÝN", 1996, "312456"));

	}

}
