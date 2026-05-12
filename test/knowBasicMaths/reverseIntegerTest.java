package knowBasicMaths;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class reverseIntegerTest {

    @Test
    public void zeroIntTest(){
        assertThat(reverseInteger.checkReverser(3124)).isEqualTo(4213);
        assertThat(reverseInteger.checkReverser(-123)).isEqualTo(-321);
        assertThat(reverseInteger.checkReverser(0)).isEqualTo(0);


    }




}