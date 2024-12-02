package org.example.U3.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Pizza */
public class Pizza {

  private List<Toppings> toppingList;
  private short numSlices;
  private int price;
  private String name;
  private final short BASE_PRICE = 25;

  Pizza(short numSlices, String name, Toppings... toppings) {

    if (numSlices > 0) {
      this.numSlices = numSlices;
    }
    Optional<String> optName = Optional.ofNullable(name);
    this.name = optName
        .map(String::trim)
        .filter(n -> !n.equals(""))
        .orElseThrow(); // maybe change to n.isEmpty() and n.inBlank()
    //
    int sum = 0;
    for (Toppings topping : toppings) {
      sum += topping.getPrice();
    }
    this.price = (numSlices * toppings.length) + BASE_PRICE + sum;

    this.toppingList = Arrays.asList(toppings);
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public short getNumSlices() {
    return numSlices;
  }

  public List<Toppings> getFillings() {
    return toppingList;
  }
}
