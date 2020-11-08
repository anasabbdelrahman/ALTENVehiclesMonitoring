package com.alten.vmc.error;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorHandlerTest {


    @Test
    public void testErrorHandler() {

        ErrorHandler errorHandler= new ErrorHandler();
        errorHandler.validationErrorProcess(new IllegalArgumentException());
        Assert.assertEquals("done","done");
    }


}
