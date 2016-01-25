package com.net.first;

import com.net.first.testPaper.TestPaper;
import com.net.first.testPaper.TestPaperA;
import com.net.first.testPaper.TestPaperB;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("A的试卷");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestionA();
        studentA.testQuestionB();
        studentA.testQuestionC();
        System.out.println();

        System.out.println("B的试卷");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestionA();
        studentB.testQuestionB();
        studentB.testQuestionC();

    }
}
