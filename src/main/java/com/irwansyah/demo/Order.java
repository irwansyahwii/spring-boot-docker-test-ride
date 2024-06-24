package com.irwansyah.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public  class Order {
  private @Id
  @GeneratedValue Long id;

  Order(){}

  public Long getId() {
    return this.id;
  }

}
