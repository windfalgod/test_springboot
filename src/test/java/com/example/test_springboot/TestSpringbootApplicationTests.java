package com.example.test_springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSpringbootApplicationTests {
    TestSpringbootApplication test = new TestSpringbootApplication();
    @Test
    void contextLoads() {
    }

    @Test
    public void testTest() {
        int actual = test.test(10);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTest2() {
        int actual = test.test(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
