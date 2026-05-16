package knowBasicHashing;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;


class CountTest {
    @Test void isEmptyTest(){
        int[] arr = {};
        Map<Integer,Integer> result= Count.countElementsInArray(arr);
        assertThat(result).isEmpty();
    }
    @Test void singleElementTest(){
        int[] arr = {40};
        Map<Integer,Integer> result= Count.countElementsInArray(arr);
        assertThat(result).isEqualTo(Map.of(40,1));

    }
    @Test void isCountCorrectTest(){
        int[] arr = {10,5,10,15,10,5};
        Map<Integer,Integer> result= Count.countElementsInArray(arr);

        assertThat(result).isEqualTo(Map.of(10,3,5,2,15,1));
    }

    @Test void singleElementRepeatTest(){
        int[] arr = {20,20,20,20,20};
        Map<Integer,Integer> result = Count.countElementsInArray(arr);
        assertThat(result).isEqualTo(Map.of(20,5));

    }

}