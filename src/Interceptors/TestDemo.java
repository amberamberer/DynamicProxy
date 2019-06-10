package Interceptors;

import org.junit.Test;

public class TestDemo {
    @Test
    public void test(){
        Helloworld proxy = (Helloworld) InterceptorJdkProxy.bind(
                new HelloworldImpl(), "Interceptors.InterceptorImpl"
        );
        proxy.sayHelloWorld();
    }
}
