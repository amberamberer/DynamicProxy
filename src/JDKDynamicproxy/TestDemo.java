package JDKDynamicproxy;

import org.junit.Test;

public class TestDemo {
    @Test
    public void testJdkProxy(){
        JdkProxyExample jdk= new JdkProxyExample();
        Helloworld proxy = (Helloworld)jdk.bind(new HelloworldImpl());
        proxy.sayHelloWorld();
    }
}
