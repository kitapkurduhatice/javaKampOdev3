package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class CoffeeCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	
	public CoffeeCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws Exception {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			throw new Exception("Geçerli bir kişi değil");
		}
	}
}
