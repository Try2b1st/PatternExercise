package org.example.interpreter;

public class Client {
    public static void main(String[] args) {
        String[] city = new String[]{"云南", "海南"};
        String[] person = new String[]{"老人", "学生"};

        TerminalExpression c = new TerminalExpression(city);
        TerminalExpression p = new TerminalExpression(person);

        String s = "上海的学生";
        String[] strings = s.split("的");

        if (c.interpret(strings[0]) && p.interpret(strings[1])) {
            System.out.println("滴！！" + strings[0] + "的" + strings[1] + "卡");
        }else{
            System.out.println("滴！，扣费两元");
        }
    }
}
