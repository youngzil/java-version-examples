package org.example.features.jdk17.language;




public record RecordExample(String name, int age) {
  public static void main(String[] args) {
    RecordExample p = new RecordExample("Alice", 30);
    System.out.println(p);
  }
}
