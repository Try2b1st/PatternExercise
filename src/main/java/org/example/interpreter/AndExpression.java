package org.example.interpreter;

public class AndExpression implements Expression{
     //左半部分
     private Expression left;
     //右半部分
     private Expression right;
     //切分关键字
     public static final String FLEX = "的";
     public AndExpression(Expression city, Expression person) {
         this.left = city;
         this.right = person;
     }
     public boolean interpret(String info) {
         String s[] = info.split(FLEX);
         //符合文法的全部才会返回true
         return left.interpret(s[0]) && right.interpret(s[1]);
     }
 }