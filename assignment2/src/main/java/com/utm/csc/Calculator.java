package com.utm.csc;


public class Calculator {
		//constructor
		public Calculator()
		{
	
		}
		//addition
        public double addition(double num1 , double num2)
        {
            double answer = num1 + num2;
            return answer;
        }
        //subtraction
        public double subtraction(double num1 , double num2)
        {
            double answer = num1 - num2;
            return answer;
        }
        //division
        public double division(double num1 , double num2)
        {
            double answer = num1 / num2;
            return answer;
        }
        //multiplication
        public double multiplication(double num1 , double num2)
        {
            double answer = num1 * num2;
            return answer;
        }
        //function calculates the modular
        public double modular(double num1 , double num2)
        {
            double answer = num1 % num2;
            return answer;
        }
        //exponent function
        public double exponent(double num1 , double num2)
        {
            double answer = Math.pow(num1, num2);
            return answer;
        }
        //calculating the tetration
        public double tetration(double num1 , double num2)
        {
            double x = num1;
            while (num2 != 1)
            {
                x = Math.pow(num1, x);
                num2--;
            }
            double answer = x;
            return answer;
        }
        //sin function, degree will be true if user wants sind
        public double sin(double num1 , double num2, boolean degree)
        {
        	double deg = 1;
        	if(degree)
        		deg = Math.PI/180;
            double answer = num1 * Math.sin(deg*num2);
            return answer;
        }
        //cos function, degree is tru if user wants cosd
        public double cos(double num1 , double num2 , boolean degree)
        {
        	double deg = 1;
        	if(degree)
        		deg = Math.PI/180;        	
            double answer = num1 * Math.cos(deg*num2);
            return answer;
        }
        //the tangant function, gets degree as true if user wnats tand
        public double tan(double num1 , double num2 , boolean degree)
        {
        	double deg = 1;
        	if(degree)
        		deg = Math.PI/180;         	
            double answer = num1 * Math.tan(deg*num2);
            return answer;
        }
 

}
