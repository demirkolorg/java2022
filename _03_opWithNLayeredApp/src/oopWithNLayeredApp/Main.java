package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"IPhone 13",15);
        List<Logger> loggers=List.of(new DatabaseLogger(),new FileLogger());

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}