package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public  void save(Customer customer)  {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to Db : "+ customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}


}
