package com.qiuxx.c3p0;


import org.junit.Before;
import org.junit.Test;

public class CRUDTest {
    private CRUDController crudController;

    @Before
    public void init(){
        crudController = new CRUDController();
    }

    @Test
    public void testInsertCustomer(){
        Customer customer = new Customer();
        customer.setName("张三的小名");
        customer.setTelephone("12345678901");
        customer.setDept("人事部");
        customer.setEamil("123456@qq.com");
        crudController.insertCustomer(customer);
    }

    @Test
    public void testQueryCustomerList(){
        crudController.queryCustomerList();
    }

    @Test
    public void testQueryCustomer(){
        crudController.queryCustomer(1);
    }

    @Test
    public void testUpdateCustomer(){
        Customer customer = new Customer();
        customer.setName("赵四");
        customer.setEamil("3600000@qq.com");
        customer.setDept("产品部");
        customer.setTelephone("2323515415454");
        crudController.updateCustomer(1,customer);
    }

    @Test
    public void testDeleteCustomer(){
        crudController.deleteCustomer(12);
    }
}
