package programming_2_1;

public class pro21 {
	/* 
	 * Author: Yerbol Panaberdiyev
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customerArr = new Customer[2];
		
		Address addr_one = new Address("Mellow","Chicago", "IL", "74222");
		Address addr_two = new Address("Gabby","Des Moines", "IA", "65222");
				
		customerArr[0] = new Customer("Ellain", "Somersson", "652-221-2122", addr_one, addr_one);
		customerArr[1] = new Customer("Bob", "Tornton", "992-241-8822", addr_two, addr_two);
		
		for (Customer customer : customerArr) {
			if(customer.getShippingAddress().getCity().equals("Chicago")) {
				System.out.println(customer.toString());
			}
		}
		
		
	}

}
