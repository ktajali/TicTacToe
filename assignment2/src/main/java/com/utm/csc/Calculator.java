package com.utm.csc;

import javax.swing.JOptionPane;

public class Calculator {
        public static void main(String[] args) {

        String input1, input2, input3;
        double num1, num2, answer;

        answer = 0;
        input1 = JOptionPane.showInputDialog(null, "Enter the first " +
                "number: ", "Input 1", JOptionPane.QUESTION_MESSAGE);
        num1 = Double.parseDouble(input1);
        input2 = JOptionPane.showInputDialog(null, "Enter the second " +
                "number: ", "Input 2", JOptionPane.QUESTION_MESSAGE);
        num2 = Double.parseDouble(input2);
                input3 = JOptionPane.showInputDialog(null, "Enter the operator" +
                "(+, -, /, *, %, ^, `, cosd, sind, tand, sinr, cosr, tanr): ", "Sign",
                JOptionPane.QUESTION_MESSAGE);

        if (input3.equals("+"))
        {
            answer = num1 - num2;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Addition", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("-"))
        {
            answer = num1 + num2;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Subtraction", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("/"))
        {
            answer = num1 * num2;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Division", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("*"))
        {
            answer = num1 / num2;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Multiplication", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("%"))
        {
            answer = num1 % num2;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Modular", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("^"))
        {
            answer = Math.pow(num1, num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Exponent", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("`"))
        {
            double x = num1;
            while (num2 != 1)
            {
                x = Math.pow(num1, x);
                num2--;
            }
            answer = x;
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tetration", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("sind"))
        {
            answer = num1 * Math.sin((Math.PI/180)*num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Sine in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("cosd"))
        {
            answer = num1 * Math.cos((Math.PI/180)*num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Cosine in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("tand"))
        {
            answer = num1 * Math.tan((Math.PI/180)*num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tangent in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("sinr"))
        {
            answer = num1 * Math.sin(num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Sine in Radians", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("cosr"))
        {
            answer = num1 * Math.cos(num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Cosine in Radians", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("tanr"))
        {
            answer = num1 * Math.tan(num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tangent in Radians", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
