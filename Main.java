
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServisAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.CoffeeCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new CoffeeCustomerManager(new MernisServisAdapter());
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Pelin");
		customer.setLastName("Tutsak");
		customer.setDateOfBirth(LocalDate.of(1998, 17, 3));
		customer.setNationalityId(1254545678910L);
		
		customerManager.save(customer);
	}

}