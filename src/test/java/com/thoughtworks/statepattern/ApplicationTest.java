package com.thoughtworks.statepattern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ApplicationTest {
    @Test
    public void should_be_hello_world_when_start_application() {
        Application application = new Application();
        String result = application.start();
        assertThat(result, is("hello world"));
    }
}