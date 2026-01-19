package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private Calculator calculator;

  @BeforeAll
  static void beforeAll() {
    System.out.println("beforeAll");
  }

  @BeforeEach
  void setUp() {
    System.out.println("beforeEach");
    calculator = new Calculator();
  }

  @AfterEach
  void tearDown() {
    // 资源清理（如果有）
    System.out.println("afterEach");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("afterAll");
  }

  @Test
  @DisplayName("断言常用写法")
  void assertionsDemo() {
    assertEquals(2, 1 + 1);
    assertTrue(3 > 1);
    assertFalse(1 > 3);
    assertNotNull("hello");
    assertThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("error");
    });
  }

  @ParameterizedTest
  @CsvSource({
      "1, 2, 3",
      "2, 3, 5",
      "3, 5, 8"
  })
  @DisplayName("参数化测试（很实用）")
  void testAdd(int a, int b, int expected) {
    assertEquals(expected, a + b);
  }

  @Test
  @DisplayName("加法：两个正数")
  void testAdd() {
    int result = calculator.add(2, 3);
    assertEquals(5, result);
  }

  @Test
  @DisplayName("除法：除数为 0 时抛异常")
  void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
  }

  @RepeatedTest(3)
  @DisplayName("重复执行测试")
  void repeatedTest() {
    assertTrue(calculator.add(1, 1) == 2);
  }

  @Nested
  @DisplayName("嵌套测试示例")
  class NestedTests {

    @Test
    void nestedTest() {
      assertEquals(4, calculator.add(2, 2));
    }
  }

  @Test
  @Disabled("示例：暂时禁用的测试")
  void disabledTest() {
    fail("This test is disabled");
  }

}

// 被测试的简单类（示例）
class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int divide(int a, int b) {
    return a / b;
  }
}

