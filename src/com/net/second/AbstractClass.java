package com.net.second;

/**
 * Created by daidaijie on 2016/1/25.
 */
public abstract class AbstractClass {

    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println();
    }

}
