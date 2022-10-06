package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    //Bir katman başka bir katmanın klasını kullanıyor iken sadece interfacesinden erişim kurmalıdır.
    private final ProductDao productDao;
    private final List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }

        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
