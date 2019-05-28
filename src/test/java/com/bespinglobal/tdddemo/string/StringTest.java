package com.bespinglobal.tdddemo.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringTest {

  @Test
  public void split() {
    String[] values = "1".split(",");
    assertThat(values).contains("1");
    values = "1,2".split(",");
    assertThat(values).containsExactly("1", "2");
  }

  @Test
  public void subString() {
    String input = "(1,2)";
    String result = input.substring(1, input.length() - 1);
    assertThat(result).isEqualTo("1,2");
  }


}
