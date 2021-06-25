package com.sample.calculator.service;

import com.sample.calculator.constants.Constants;
import com.sample.calculator.operator.Operand;
import com.sample.calculator.operator.Operator;
import com.sample.calculator.operator.Term;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    public double calculate(String expression) {
        {
            Tokenizer tokenizer = new Tokenizer();
            Stack<Operand> values = new
                    Stack<>();
            Stack<Operator> operatorStack = new
                    Stack<>();
            ArrayList<Term> tokenList = tokenizer.getArrayListOfTokens(expression);
            for (Term token:
                 tokenList) {
                if (token instanceof Operand) {
                    values.push(((Operand) token));
                } else if(token instanceof Operator){
                    Operator currentOperator = (Operator) token;
                    if (currentOperator.getType() == Constants.OPENING_BRACES) {
                        operatorStack.push((Operator) token);
                    } else if (currentOperator.getType() == Constants.CLOSING_BRACES) {
                        while (!operatorStack.empty() && operatorStack.peek().getType() != Constants.OPENING_BRACES) {
                            values.push(compute(operatorStack.pop(), values.pop(), values.pop()));
                        }
                        operatorStack.pop();
                    } else {

                        while (!operatorStack.empty() && currentOperator.comparePrecedence(operatorStack.peek()) <= 0) {
                            values.push(compute(operatorStack.pop(), values.pop(), values.pop()));
                        }

                        operatorStack.push((Operator) token);
                    }
                }
            }

            while (!operatorStack.empty()) {
                values.push(compute(operatorStack.pop(), values.pop(), values.pop()));
            }

            return values.pop().getValue();
        }
    }


    private Operand compute(Term term, Operand firstOperand, Operand secondOperand) {
        Operator operator = (Operator) term;
        Operand operand = null;
        switch ((operator.getType())) {
            case Constants.ADD:
                operand = new Operand(firstOperand.getValue() + secondOperand.getValue());
                break;
            case Constants.SUBTRACT:
                operand = new Operand(secondOperand.getValue() - firstOperand.getValue());
                break;
            case Constants.MULTIPLY:
                operand = new Operand(firstOperand.getValue() * secondOperand.getValue());
                break;
            case Constants.DIVIDE:
                if(firstOperand.getValue()==0){
                    throw new ArithmeticException("Divisor can't be zero");
                }
                operand = new Operand(secondOperand.getValue() / firstOperand.getValue());
        }
        return operand;
    }
}



