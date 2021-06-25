package com.sample.calculator.service;

import com.sample.calculator.operator.*;
import com.sample.calculator.constants.*;

import java.util.ArrayList;

public class Tokenizer {
    public ArrayList<Term> getArrayListOfTokens(String expression){
        ArrayList<Term> arrayList = new ArrayList<>();
        char[] tokens = expression.replace(" ", "")
                .toCharArray();
        for (int position = 0; position < tokens.length; position++)
        {
            if(isCharPartOfNumber(tokens[position]))
            {
                String result = getNextFloatNumber(tokens, position);
                Term operand = new Operand(Float.parseFloat(result));
                arrayList.add(operand);
                position = position + result.length() - 1;
            }

            else if (isCharAnOperator(tokens[position]))
            {
                Term currentOperator = getNextOperator(tokens, position);
                arrayList.add(currentOperator);
            }
        }
        return arrayList;
    }

    private String getNextFloatNumber(char[] remainingExpression, int position) {
            StringBuffer stringBuffer = new
                    StringBuffer();

            while (position < remainingExpression.length &&
                    (remainingExpression[position] >= Constants.ZERO &&
                            remainingExpression[position] <= Constants.NINE || remainingExpression[position] == '.')){
                stringBuffer.append(remainingExpression[position++]);
            }

            return stringBuffer.toString();
    }
    private Term getNextOperator(char[] remainingExpression, int position){
        return new Operator(remainingExpression[position]);
    }

    private boolean isCharPartOfNumber(char ch){
        return  ch >= Constants.ZERO &&
                ch <= Constants.NINE;
    }
    private boolean isCharAnOperator(char ch){
        return  ch == Constants.ADD ||
                ch == Constants.SUBTRACT ||
                ch == Constants.MULTIPLY ||
                ch == Constants.DIVIDE ||
                ch == Constants.OPENING_BRACES ||
                ch == Constants.CLOSING_BRACES;
    }
}
