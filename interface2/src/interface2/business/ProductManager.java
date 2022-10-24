package interface2.business;

import Loggers.Logger;
import interface2.DataAccess.ProductDao;
import interface2.intites.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao,Logger[] loggers) {

		this.productDao = productDao;
		this.loggers= loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {

			throw new Exception("Birim fiyatı 10dan küçük olamaz!");

		}
		productDao.add(product);

		for (Logger logger : loggers) {
			logger.log(null);
		}
		
	}

}
