import Loggers.DatabaseLogger;
import Loggers.EmailLogger;
import Loggers.Logger;
import Loggers.SmsLogger;
import interface2.DataAccess.JdbcProductDao;
import interface2.business.ProductManager;
import interface2.intites.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		
		Product product= new Product(1,"Pc",1500,200);
		
		Logger[] loggers= { new DatabaseLogger(), new SmsLogger()};
		
		ProductManager productManager= new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product);
		
	}

}
