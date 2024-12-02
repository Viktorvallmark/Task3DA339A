package org.example.U3.model;

public enum Toppings {
  Sausage(10),
  Mushrooms(5),
  Jalapeno(6),
  Ham(7),
  GarlicSauce(4);

  private final int price;

  Toppings(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
