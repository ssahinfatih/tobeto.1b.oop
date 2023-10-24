package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1= new Product();
        product1.setName("Delongi Kahve Makinası");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");

        Product product2= new Product();
        product2.setName("smeg Kahve Makinası");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");


        Product product3= new Product();
        product3.setName("kitchen aid Kahve Makinası");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");



        Product[] products={product1,product2,product3};

        for (Product product:products) {
            System.out.println(product.getName());
            System.out.println(product.getDiscount());
            System.out.println(product.getImageUrl());
            System.out.println(product.getUnitPrice());
            System.out.println(product.getUnitsInStock());
            System.out.println("---------------------");
        }

        IndividualCustomer individualCustomer =new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("0554415641");
        individualCustomer.setFirstName("Fatih");
        individualCustomer.setLastName("Şahin");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("04541504566");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};


    }
}