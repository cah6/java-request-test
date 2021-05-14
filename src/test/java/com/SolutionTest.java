package com;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {


    @SuppressWarnings("unused")
    @Test
    public void keepMe() {
        assertEquals(1, 1);
        assertThat(List.of("a", "b"), hasSize(2));
    }
}
