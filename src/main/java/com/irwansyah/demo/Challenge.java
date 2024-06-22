package com.irwansyah.demo;

import  lombok.Value;

@Value
public class Challenge {

  public Challenge(int par, int par1) {
    this.factorA = par;
    this.factorB = par1;
  }
  int factorA;
  int factorB;

  public int Calc(){
    return factorA * factorB;
  }
}
