package rk.hibernate.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DOB")
    private Date dob;
    @Column(name = "COMPANY")
    private String company;

    @OneToMany(fetch= FetchType.EAGER,  cascade= CascadeType.ALL)
    @Column(name = "address")
    @JoinTable(name="user_address" , joinColumns=@JoinColumn(name="user_id") , inverseJoinColumns=@JoinColumn(name="address_id"))
    private List<Address> addresses;

}
