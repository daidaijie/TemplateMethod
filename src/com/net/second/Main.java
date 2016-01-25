package com.net.second;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Main {
    public static void main(String[] args) {

        AbstractClass c;
        c = new ContreteClassA();
        c.TemplateMethod();

        c = new ContreteClassB();
        c.TemplateMethod();

    }

}
