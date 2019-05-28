package com.bespinglobal.tdddemo.calculator;

public class RefactoredCalculator {

  /**
   * Refactoring 1. 들여쓰기 2이상인 곳을 분리한다.
   * Refactoring 2. else 예약어를 쓰지 않는다.
   * Refactoring 3. 함수는 하나의 기능만 한다.
   * Refactoring 4. Compose method pattern 적용한다.
   */

  public static int splitAndSum(String text) {

    if (isBlank(text)) {
      return 0;
    }

    return sum(toInt(text.split(",|:")));
  }

  private static boolean isBlank(String text) {
    return text == null || text.isEmpty();
  }

  private static int[] toInt(String[] values) {

    int[] numbers = new int[values.length];
    for (int i=0; i<values.length; i++) {
      numbers[i] = Integer.parseInt(values[i]);
    }

    return numbers;
  }

  private static int sum(int[] numbers) {

    int result = 0;
    for (int number : numbers) {
      result += number;
    }

    return result;
  }

}
