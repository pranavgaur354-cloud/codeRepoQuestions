package knowBasicRecursion;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
class FibonacciTest {

    @Test void zero()  {
        assertThat(Fibonacci.fibUpToN(0)).containsExactly(0).inOrder(); }
    @Test void one()   { assertThat(Fibonacci.fibUpToN(1)).containsExactly(0,
            1).inOrder(); }
    @Test void five()  { assertThat(Fibonacci.fibUpToN(5)).containsExactly(0, 1,
            1, 2, 3, 5).inOrder(); }
    @Test void ten()   { assertThat(Fibonacci.fibUpToN(10)).containsExactly(0, 1,
            1, 2, 3, 5, 8, 13, 21, 34, 55).inOrder(); }




}