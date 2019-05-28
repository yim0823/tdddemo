package com.bespinglobal.tdddemo.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRefactoredCalculator {

  @Test
  public void null_또는_빈값() {
    assertThat(RefactoredCalculator.splitAndSum(null)).isEqualTo(0);
    assertThat(RefactoredCalculator.splitAndSum("")).isEqualTo(0);
  }

  @Test
  public void 값_하나() {
    assertThat(RefactoredCalculator.splitAndSum("1")).isEqualTo(1);
  }

  @Test
  public void 쉼표_구분자() {
    assertThat(RefactoredCalculator.splitAndSum("1,2")).isEqualTo(3);
  }

  @Test
  public void 쉼표_콜론_구분자() {
    assertThat(RefactoredCalculator.splitAndSum("1,2:3")).isEqualTo(6);
  }

}
