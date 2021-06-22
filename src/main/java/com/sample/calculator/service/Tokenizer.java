package com.sample.calculator.service;

import com.sample.calculator.operator.*;
import com.sample.calculator.constants.*;

public class Tokenizer {
    public String getNextFloatNumber(char[] remainingExpression, int position) {
            StringBuffer stringBuffer = new
                    StringBuffer();

            while (position < remainingExpression.length &&
                    (remainingExpression[position] >= Constants.ZERO &&
                            remainingExpression[position] <= Constants.NINE || remainingExpression[position] == '.')){
                stringBuffer.append(remainingExpression[position++]);
            }

            return stringBuffer.toString();
    }
    public Operator getNextOperator(char[] remainingExpression, int position){
       switch (remainingExpression[position])
        {
            case Constants.ADD:
                return new AdditionOperator();
            case Constants.SUBTRACT:
                return new SubtractionOperator();
            case Constants.MULTIPLY:
                return new MultiplicationOperator();
            case Constants.DIVIDE:
                return new DivisionOperator();
            default:
                return null;
        }
    }

    public boolean isCharPartOfNumber(char ch){
        return  ch >= Constants.ZERO &&
                ch <= Constants.NINE;
    }
    public boolean isCharAnOperator(char ch){
        return  ch == Constants.ADD ||
                ch == Constants.SUBTRACT ||
                ch == Constants.MULTIPLY ||
                ch == Constants.DIVIDE;
    }
}
