package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String stringNumbers = "1,2";
        String stringOne = "1";
        String[] stringNumberArray = stringNumbers.split(",");
        String[] stringOneArray = stringOne.split(",");

        assertThat(stringNumberArray).containsExactly("1", "2", "3");
        assertThat(stringOneArray).contains("1");
    }
}
