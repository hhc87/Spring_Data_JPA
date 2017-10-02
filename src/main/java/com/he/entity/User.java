package com.he.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_user")
@Accessors(chain = true)
@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"})
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
}
