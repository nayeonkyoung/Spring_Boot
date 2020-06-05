package com.nayeonkyoung.springbootcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter // getter 메소드를 만들어 준다.
@Setter // setter 메소드를 만들어 준다.
@Entity
public class Person{
    @Id //pk값 명시
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String password;


}