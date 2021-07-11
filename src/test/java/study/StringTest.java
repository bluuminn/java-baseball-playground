package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void subString() {
        String str = "(1,2)";
        String substring = str.substring(1, str.length() - 1);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치의 문자열 가져오기")
    void charAt() {
        String abc = "abc";
        assertThatThrownBy(() -> {
            char c = abc.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
