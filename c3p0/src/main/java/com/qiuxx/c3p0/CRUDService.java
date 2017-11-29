package com.qiuxx.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * c3p0连接池---增删改查
 */
public class CRUDService {
    private static DataSourceUtil dataSourceUtil;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    static {
        dataSourceUtil = new DataSourceUtil();
    }

    /**
     * 查询所有客户
     * @return
     */
    public List queryCustomerList(){
        List<Customer> list = new ArrayList<Customer>();
        try{
            conn = dataSourceUtil.getConnection();
            String sql = "select cus_name,cus_dept,cus_telephone,cus_email from demo_customer";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Customer customer = new Customer();
                customer.setName(rs.getString(1));
                customer.setDept(rs.getString(2));
                customer.setTelephone(rs.getString(3));
                customer.setEamil(rs.getString(4));
                list.add(customer);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            dataSourceUtil.realeaseResource(rs,ps,conn);
        }
        return list;
    }

    public Customer queryCustomer(int id){
        Customer customer = new Customer();
        try{
            conn = dataSourceUtil.getConnection();
            String sql = "select cus_name,cus_telephone,cus_dept,cus_email from demo_customer where cus_id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                customer.setName(rs.getString(1));
                customer.setTelephone(rs.getString(2));
                customer.setDept(rs.getString(3));
                customer.setEamil(rs.getString(4));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return customer;
    }

    /**
     * 保存客户信息
     */
    public boolean insertCustomer(Customer customer){
        boolean flag = false;
        try {
            conn = dataSourceUtil.getConnection();
            String sql = "insert into demo_customer(cus_name,cus_telephone,cus_dept,cus_email)" +
                    "values(?,?,?,?)";
            ps = conn.prepareCall(sql);
            ps.setString(1,customer.getName());
            ps.setString(2,customer.getTelephone());
            ps.setString(3,customer.getDept());
            ps.setString(4,customer.getEamil());
            int resNum = ps.executeUpdate();
            if (resNum == 1){
                flag = true;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            dataSourceUtil.realeaseResource(rs,ps,conn);
        }
        return flag;
    }

    /**
     * 删除客户信息
     */
    public boolean deleteCustomer(int id){
        boolean flag = false;
        try {
            conn = dataSourceUtil.getConnection();
            String sql = "delete from demo_customer where cus_id=?";
            ps = conn.prepareCall(sql);
            ps.setInt(1,id);
            int resNum = ps.executeUpdate();
            if (resNum == 1){
                flag = true;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            dataSourceUtil.realeaseResource(rs,ps,conn);
        }
        return flag;
    }

    /**
     * 修改客户信息客户信息
     */
    public boolean updateCustomer(int id, Customer customer){
        boolean flag = false;
        try {
            conn = dataSourceUtil.getConnection();
            String sql = "update demo_customer set cus_name=?,cus_telephone=?,cus_dept=?," +
                    "cus_email=? where cus_id=?";
            ps = conn.prepareCall(sql);
            ps.setString(1,customer.getName());
            ps.setString(2,customer.getTelephone());
            ps.setString(3,customer.getDept());
            ps.setString(4,customer.getEamil());
            ps.setInt(5,id);
            int resNum = ps.executeUpdate();
            if (resNum == 1){
                flag = true;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            dataSourceUtil.realeaseResource(rs,ps,conn);
        }
        return flag;
    }
}
