package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println(product.getName()+" isimili ürün Hibernate ile veritabanı eklendi.");
    }
}
