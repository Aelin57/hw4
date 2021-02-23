package com.company;

public class BankAccount extends Exception {
    private int amount;
    
    public double getAmount(){
        return amount;
    }

    public double deposit(double sum){
        System.out.println("Вы положили на счет:"+(amount+=sum));
        return amount;
    }
    public void withDraw(int sum)throws LimitExeption{
        if (amount < sum){
            throw new LimitExeption("Вы не можете снять запрашиваемую сумму,чем остаток денег на счете",sum);
        }else{
            System.out.println("Со счета снято:"+sum);
            System.out.println("Остаток на счету :"+(amount-=sum));
        }
    }
}
