package com.nirvana.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@Data
public class TestEntity {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;
}
