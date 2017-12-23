package pl.madison.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;


public class TestControllerTest {

    @Test
    public void getSilnia() throws Exception {
        TestController testController = new TestController();

        int liczba = 4;

        int s = testController.getSilnia(liczba);

        Assert.assertEquals(24, s, 0);

    }
}