package chapter06._06_split_temporary_variable.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void getDistanceTravelld() throws Exception {
        // given
        final Example sut = new Example(10, 5, 30, 3);

        // when
        final double result = sut.getDistanceTravelld(10);

        // then
        assertThat(result, is(22.75));
    }

}