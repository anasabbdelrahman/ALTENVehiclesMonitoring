package com.alten.vmc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
    public class VmcRegistryApplicationTests {
    @Test
    public void contextLoads() {
        VmcRegistryApplication.main(new String[]{""});
        Assert.assertEquals("done","done");

    }
}
