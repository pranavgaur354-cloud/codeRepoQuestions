package knowBasicRecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

class ArrayReversalTest {

    @Test
    void oddTest(){
        int[] a = {2,3,1,4,5};
        int [] expected= {5, 4, 1, 3, 2};
        assertThat(ArrayReversal.reverseArray(a)).isEqualTo(expected);

    }

    @Test
    void evenTest(){
        int[] a = {3,1,4,5};
        int [] expected= {5, 4, 1, 3    };
        assertThat(ArrayReversal.reverseArray(a)).isEqualTo(expected);

    }

    @Test
    void nullTest(){
        int[] a = {};
        int [] expected= {};
        assertThat(ArrayReversal.reverseArray(a)).isEqualTo(expected);

    }


    @Test
    void eTest(){
        int[] a = {};
        int [] expected= {};
        assertThat(ArrayReversal.reverseArray(a)).isEqualTo(expected);

    }
}