package knowBasicMaths;

import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;

class DivisorsTest {

    @Test
    void one() {
        assertThat(divisors.getDivisorsFast(1))
                .containsExactly(1).inOrder();
    }

    @Test
    void prime() {
        assertThat(divisors.getDivisorsFast(7))
                .containsExactly(1, 7).inOrder();
    }

    @Test
    void composite() {
        assertThat(divisors.getDivisorsFast(12))
                .containsExactly(1, 2, 3, 4, 6, 12).inOrder();
    }

    @Test
    void perfectSquare() {
        assertThat(divisors.getDivisorsFast(36))
                .containsExactly(1, 2, 3, 4, 6, 9, 12, 18, 36).inOrder();
    }
}