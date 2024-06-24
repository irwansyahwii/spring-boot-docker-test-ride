package com.irwansyah.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
  @RequestMapping(value="api/v1/orders", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Order> getOrders(){
    return new ResponseEntity<Order>( new Order(), HttpStatus.CREATED);
  }
}
