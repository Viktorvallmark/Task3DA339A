package org.example.U3.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Cake */
public class Cake extends BakeryItem {

  private List<Fillings> fillings;
  private short numSlices;
  private int price;
  private String name;
  private final short BASE_PRICE = 100;

  Cake(short numSlices, String name, Fillings... fillings) {

    if (numSlices > 0) {
      this.numSlices = numSlices;
    }
    Optional<String> optName = Optional.ofNullable(name);
    this.name = optName
        .map(String::trim)
        .filter(n -> !n.equals(""))
        .filter(n -> !n.isEmpty())
        .filter(n -> !n.isBlank())
        .orElseThrow(); // maybe change to n.isEmpty() and n.inBlank()
    //
    int sum = 0;
    for (Fillings fill : fillings) {
      sum += fill.getPrice();
    }
    this.price = (numSlices * fillings.length) + BASE_PRICE + sum;

    this.fillings = Arrays.asList(fillings);
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

  public List<Fillings> getFillings() {
    return fillings;
  }
}
