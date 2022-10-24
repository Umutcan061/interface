package interface2.DataAccess;

import interface2.intites.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		
		System.out.println("Hibernate ile veri tabanına eklendi"+product.getName());

		
		
		
	}

}
