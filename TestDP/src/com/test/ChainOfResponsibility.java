package com.test;
class Numbers{
    int number1;
    int number2;
    String calculateMethod;
}
interface Chain{
    void setNextChain(Chain chain);
    void calculate(Numbers userInput);
}
class AddNumbers implements Chain{
    Chain chain;

    @Override
    public void setNextChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void calculate(Numbers userInput) {
        if(userInput.calculateMethod.equalsIgnoreCase("Add")){
            System.out.println("Add >> "+(userInput.number1 + userInput.number2));
        }else{
            chain.calculate(userInput);
        }
    }
}
class SubNumbers implements Chain{
    Chain chain;

    @Override
    public void setNextChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void calculate(Numbers userInput) {
        if(userInput.calculateMethod.equalsIgnoreCase("Sub")){
            System.out.println("Sub >> "+(userInput.number1 - userInput.number2));
        }else{
            chain.calculate(userInput);
        }
    }
}


public class ChainOfResponsibility {
    public static void main(String[] args) {
        Chain addChain = new AddNumbers();
        Chain subChain = new SubNumbers();
        addChain.setNextChain(subChain);

        Numbers numbers = new Numbers();
        numbers.number1 = 10;
        numbers.number2 = 4;
        numbers.calculateMethod = "sub";
        addChain.calculate(numbers);


    }
}
