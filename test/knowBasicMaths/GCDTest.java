package knowBasicMaths;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class GCDTest {


    @Test
    void coprimeReturnsOne() {

        assertThat(GCD.calcGcd(11, 7)).isEqualTo(1);
        assertThat(GCD.calcGcd(1, 100)).isEqualTo(1);
    }            // (11,7), (1,100)

    @Test
    void equalInputsReturnThemselves() {
        assertThat(GCD.calcGcd(12, 12)).isEqualTo(12);
        assertThat(GCD.calcGcd(1, 1)).isEqualTo(1);
    }   // (12,12), (1,1)

    @Test
    void zeroInputReturnsOther() {
        assertThat(GCD.calcGcd(5, 0)).isEqualTo(5);
        assertThat(GCD.calcGcd(0, 5)).isEqualTo(5);
    }         // (5,0), (0,5)

    @Test
    void bothZeroReturnsZero() {
        assertThat(GCD.calcGcd(0, 0)).isEqualTo(0);
    }          // (0,0)

    @Test
    void generalCases() {
        assertThat(GCD.calcGcd(9, 12)).isEqualTo(3);
        assertThat(GCD.calcGcd(8, 12)).isEqualTo(4);
    }

}