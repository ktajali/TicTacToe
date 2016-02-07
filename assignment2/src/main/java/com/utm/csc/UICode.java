package com.utm.csc;

import javax.swing.JOptionPane;

public class UICode {
        public static void main(String[] args) {

        Calculator calculator = new Calculator();
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
            //answer = num1 + num2;
        	answer = calculator.addition(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Addition", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("-"))
        {
            //answer = num1 - num2;
        	answer = calculator.subtraction(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Subtraction", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("/"))
        {
            //answer = num1 / num2;
        	answer = calculator.division(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Division", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("*"))
        {
            //answer = num1 * num2;
        	answer = calculator.multiplication(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Multiplication", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("%"))
        {
            //answer = num1 % num2;
        	answer = calculator.modular(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Modular", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("^"))
        {
            //answer = Math.pow(num1, num2);
        	answer = calculator.exponent(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Exponent", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("`"))
        {
        	answer = calculator.tetration(num1 , num2);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tetration", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("sind"))
        {
            answer = calculator.sin(num1,num2, true);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Sine in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("cosd"))
        {
            answer = calculator.cos(num1 , num2, true);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Cosine in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("tand"))
        {
            answer = calculator.tan(num1 , num2, true);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tangent in Degrees", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("sinr"))
        {
            answer = calculator.sin(num1 , num2, false);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Sine in Radians", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("cosr"))
        {
            answer = calculator.cos(num1 , num2, false);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Cosine in Radians", JOptionPane.INFORMATION_MESSAGE);
        }

        if (input3.equals("tanr"))
        {
            answer = calculator.tan(num1 , num2, false);
            JOptionPane.showMessageDialog(null, "The answer is : " + answer,
                    "Tangent in Radians", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
