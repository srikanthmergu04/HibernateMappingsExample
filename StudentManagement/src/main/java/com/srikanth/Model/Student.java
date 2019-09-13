package com.srikanth.Model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@DynamicUpdate
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String dept;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Address.class)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany(cascade = CascadeType.ALL, targetEntity = BankAccount.class, fetch = FetchType.EAGER)
    @JoinTable(name = "Student_Account",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "account_id")}
    )
    private Set<BankAccount> accounts;

    public Set<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Laptop.class, fetch = FetchType.EAGER)
    @JoinTable(name = "Student_Laptop",
            joinColumns = {@JoinColumn(name = "Student_id")},
            inverseJoinColumns = {@JoinColumn(name = "Laptop_id")}
    )
    private Set<Laptop> lap;


    public Set<Laptop> getLap() {
        return lap;
    }

    public void setLap(Set<Laptop> lap) {
        this.lap = lap;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
