package org.example.features.language;

public class PatternMatchingExample {

  public static void main(String[] args) {
    Object obj = "Hello JDK 21";
    if (obj instanceof String s) {
      System.out.println(s.toUpperCase());
    }
  }

}
