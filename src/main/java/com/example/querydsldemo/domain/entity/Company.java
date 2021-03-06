package com.example.querydsldemo.domain.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
@Data
public class Company{
    @Id
    @GenericGenerator(name = "idGeneratorUUID",strategy = "uuid")
    @GeneratedValue(generator = "idGeneratorUUID")
    private String id;
    /**公司名称*/
    private String name;
    /**公司所在城市*/
    private String city;
}
