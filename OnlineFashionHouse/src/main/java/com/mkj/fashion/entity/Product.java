package com.mkj.fashion.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
  private String productname;
  private String category;
  private String brandname;
  private int rating;
  private int cost;
  private String date;
 
}
