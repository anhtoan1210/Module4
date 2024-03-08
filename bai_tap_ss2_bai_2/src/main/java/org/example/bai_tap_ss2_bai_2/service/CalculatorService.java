package org.example.bai_tap_ss2_bai_2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public Double total(int firstNumber, int secondNumber, String allowable) {
        if (allowable.equals("+")) {
            return (double) (firstNumber + secondNumber);
        } else if (allowable.equals("-")) {
            return (double) (firstNumber - secondNumber);
        } else if (allowable.equals("*")) {
            return (double) (firstNumber * secondNumber);
        } else if (allowable.equals("/")) {
            if (secondNumber != 0) {
                return (double) (firstNumber / secondNumber);
            } else {
                return (double) -1;
            }

        } else{
            return (double) -99;
        }

    }
}
