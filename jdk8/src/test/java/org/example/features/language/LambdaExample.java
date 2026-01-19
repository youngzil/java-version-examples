package org.example.features.language;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LambdaExample {

  @Test
  @DisplayName("测试 JDK 8 Lambda 表达式")
  void testRunnable() {
    Runnable r = () -> System.out.println("Hello JDK 8 Lambda");
    r.run();
  }

}
