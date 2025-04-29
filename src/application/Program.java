
package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		 
	//	Department obj = new Department(1, "Books");
		
	//	Seller seller = new Seller(21,"Adriano","adr@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		
	}

}
