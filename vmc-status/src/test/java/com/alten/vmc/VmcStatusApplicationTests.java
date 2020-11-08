package com.alten.vmc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class VmcStatusApplicationTests {

    @Test
    public void contextLoads() {
        VmcStatusApplication.main(new String[]{""});
        Assert.assertEquals("done","done");
    }

}

