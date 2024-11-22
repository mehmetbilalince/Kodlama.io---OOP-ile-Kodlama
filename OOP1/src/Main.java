public class Main {
    public static void main(String[] args) {
        String mesaj="Vade Oranı";

        Product product1 = new Product();
        // set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("kahve.jpg");

        // get value
//        System.out.println(product1.setName);

        Product product2 = new Product();
        // set value
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setDiscount(4);
        product2.setImageUrl("smeg.jpg");

        Product product3 = new Product();
        // set value
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitPrice(5);
        product3.setImageUrl("kitchen.jpg");

        Product[] products={product1,product2,product3};

        for (Product product:products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5457568789");
        individualCustomer.setCustomerNumber("1265");
        individualCustomer.setFirstName("Mehmet");
        individualCustomer.setLastName("Bilal");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setPhone("24256891");
        corporateCustomer.setCustomerNumber("49985");
        corporateCustomer.setCompanyName("İnce Software");
        corporateCustomer.setTextNumber("111111111");

        Customer[] customers={individualCustomer,corporateCustomer};

        for(Customer customer:customers){
            System.out.println(customer.getId());
        }
    }
}