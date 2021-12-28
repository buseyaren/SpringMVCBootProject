package com.enocachallenge.springbootmvcexample.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order")
public class orderEntity {
    @Id
    @GeneratedValue
    Date create_date=new Date();
    private String date;
    private int id;
    private int total_price;
    private String customer;
}
