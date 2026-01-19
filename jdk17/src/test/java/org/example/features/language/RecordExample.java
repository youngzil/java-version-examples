package org.example.features.language;




public record RecordExample(String name, int age) {
  public static void main(String[] args) {
    RecordExample p = new RecordExample("Alice", 30);
    System.out.println(p);
  }
}
