package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenForthMax() {
        int result = SqMax.max(5,6,3,4);
        assertThat(result,is(6));
    }

    @Test
    public void whenForthMax2() {
        int result = SqMax.max(7,6,3,4);
        assertThat(result,is(7));
    }

    @Test
    public void whenForthMax3() {
        int result = SqMax.max(8,6,13,4);
        assertThat(result,is(13));
    }
}
