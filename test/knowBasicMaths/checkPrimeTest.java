package knowBasicMaths;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

import static knowBasicMaths.checkPrime.primes;

class  checkPrimeTest {

    @Test
    void firstCheck(){
        assertThat(checkPrime.primes(7)).isEqualTo(true);
        assertThat(checkPrime.primes(1)).isEqualTo(false);

    }

    @Test
    void negativeTest(){
        assertThat(checkPrime.primes(-7)).isEqualTo(false);
    }

    @Test
    void perfectSquareTest(){
        assertThat(primes(25)).isFalse();
    }




}