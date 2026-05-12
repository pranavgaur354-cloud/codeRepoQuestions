package knowBasicMaths;

import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;

public class countingNumbersTest {

    @Test
    public void singleDigit() {
        assertThat(countingNumbers.countDigits(7)).isEqualTo(1);
    }

    @Test
    public void multipleDigits() {
        assertThat(countingNumbers.countDigits(123)).isEqualTo(3);
    }

    @Test
    public void zero() {
        assertThat(countingNumbers.countDigits(0)).isEqualTo(1);
    }

    @Test
    public void negative() {
        assertThat(countingNumbers.countDigits(-456)).isEqualTo(3);
    }
}

