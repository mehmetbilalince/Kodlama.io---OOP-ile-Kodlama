import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.JdbcProductDao;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Product product1=new Product(1,"İphone 11",24000);
        Logger[] loggers={new DatabaseLogger(),new FileLogger()};

        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}