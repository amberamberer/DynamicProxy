package CglibDynamicproxy;

import org.junit.Test;

public class TestDemo {
    @Test
    public void testCGLIBProxy(){
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
        obj.sayhello("张三");
    }
}
