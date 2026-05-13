package knowBasicMaths;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
class armstrongNumbersTest {
    @Test
    void generalTest(){
        assertThat(armstrongNumbers.getArmstrong(100)).isEqualTo(false);
        assertThat(armstrongNumbers.getArmstrong(153)).isEqualTo(true);


    }

    @Test
    void zeroTest(){
        assertThat(armstrongNumbers.getArmstrong(0)).isEqualTo(true);

    }
    @Test
    void singleDigitTest(){
        assertThat(armstrongNumbers.getArmstrong(2)).isEqualTo(true);
        assertThat(armstrongNumbers.getArmstrong(8)).isEqualTo(true);
    }

    @Test
    void doubleDigitTest(){
        assertThat(armstrongNumbers.getArmstrong(22)).isEqualTo(false);
        assertThat(armstrongNumbers.getArmstrong(8)).isEqualTo(true);
    }


}