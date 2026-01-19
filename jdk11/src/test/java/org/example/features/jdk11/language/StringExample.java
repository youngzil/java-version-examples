package org.example.features.jdk11.language;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringExample {

  @Test
  @DisplayName("测试 JDK 11 String 新方法 strip")
  void testRunnable() {
    String s = " JDK 11 Example ";
    System.out.println(s.strip());
  }

}
