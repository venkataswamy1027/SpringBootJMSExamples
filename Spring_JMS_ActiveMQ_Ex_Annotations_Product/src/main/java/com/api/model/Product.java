package com.api.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int productId;
    private String name;
    private int quantity;
}
