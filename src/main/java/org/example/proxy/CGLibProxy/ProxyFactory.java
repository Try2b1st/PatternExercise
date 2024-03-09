package org.example.proxy.CGLibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainstation = new TrainStation();

    public TrainStation getProxy() {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TrainStation.class);

        enhancer.setCallback(this);

        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理");
        method.invoke(trainstation, objects);
        return null;
    }
}
