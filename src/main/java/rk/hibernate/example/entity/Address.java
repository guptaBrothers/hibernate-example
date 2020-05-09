package rk.hibernate.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Address")
public class Address
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Id")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "HOUSE_NO")
    private String houseNo;
    @Column(name = "STREET")
    private String street;
    @Column(name = "CITY")
    private String city;
    @Column(name = "PIN")
    private long pin;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String Country;
}
