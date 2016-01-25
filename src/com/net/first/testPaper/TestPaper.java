package com.net.first.testPaper;

/**
 * Created by daidaijie on 2016/1/25.
 */
public abstract class TestPaper {
    public void testQuestionA() {
        System.out.println("问题A");
        System.out.println("答案:" + getAnswer1());
    }

    public void testQuestionB() {
        System.out.println("问题B");
        System.out.println("答案:" + getAnswer2());
    }

    public void testQuestionC() {
        System.out.println("问题C");
        System.out.println("答案:" + getAnswer3());
    }

    public abstract String getAnswer1();

    public abstract String getAnswer2();

    public abstract String getAnswer3();
}
