package interface2.DataAccess;

import interface2.intites.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {

		System.out.println("Jdbc ile veritabanına eklendi"+product.getName());
		
	}

}
