package cn.greenlinux.helloworld;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testSayHello() {

        HelloWorld helloWorld = new HelloWorld();

        String expected = "Hello World!";
        Assert.assertThat(helloWorld.sayHello(), IsEqual.equalTo(expected));
    }

}