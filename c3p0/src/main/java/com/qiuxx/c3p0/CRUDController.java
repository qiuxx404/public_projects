package com.qiuxx.c3p0;

import java.util.List;

/**
 * 管理客户关系Controller
 */
public class CRUDController {
    private static CRUDService crudService = new CRUDService();

    /**
     * 查询客户列表
     */
    public static void queryCustomerList(){
        List<Customer> list = crudService.queryCustomerList();
        if (list != null){
            int i = 1;
            for (Customer customer : list){
                System.out.println("客户"+i+"："+customer.toString());
                i++;
            }
        } else {
            System.out.println("暂时没有任何客户");
        }
    }

    /**
     * 查询用户信息 （根据id查询）
     * @param id
     */
    public static void queryCustomer(int id){
        Customer customer = crudService.queryCustomer(id);
        if (customer != null){
            System.out.println("id为"+id+"的客户信息："+customer.toString());
        } else {
            System.out.println("请输入正确id");
        }
    }


    /**
     * 保存用户信息
     * @param customer
     */
    public static void insertCustomer(Customer customer) {
        boolean flag = crudService.insertCustomer(customer);
        if (flag){
            System.out.println("保存客户信息成功");
        } else {
            System.out.println("保存客户信息失败");
        }
    }

    /**
     * 修改客户信息
     * @param id 客户id
     * @param customer 客户信息
     */
    public static void updateCustomer(int id, Customer customer){
        boolean flag = crudService.updateCustomer(id, customer);
        if (flag){
            System.out.println("修改id为"+id+"的客户信息成功");
        } else {
            System.out.println("修改id为"+id+"的客户信息失败");
        }
    }

    public static void deleteCustomer(int id){
        boolean flag = crudService.deleteCustomer(id);
        if (flag) {
            System.out.println("删除客户信息成功");
        } else {
            System.out.println("删除客户信息失败");
        }
    }
}
