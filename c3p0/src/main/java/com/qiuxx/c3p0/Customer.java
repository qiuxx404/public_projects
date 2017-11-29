package com.qiuxx.c3p0;

/**
 * 客户bean
 */
public class Customer {
    private String name;
    private String telephone;
    private String dept;
    private String eamil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", dept='" + dept + '\'' +
                ", eamil='" + eamil + '\'' +
                '}';
    }
}
