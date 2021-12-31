package com.test;
interface AccountCheck{
    void accountCheck();
}
interface SecurityCheck{
    void securityCheck();
}
interface FundTransferCheck{
    void fundTransferCheck();
}
class AccountNumberCheck implements AccountCheck{

    @Override
    public void accountCheck() {
        System.out.println("Account checked");
    }
}
class SecurityCodeCheck implements SecurityCheck{

    @Override
    public void securityCheck() {
        System.out.println("Security checked");
    }
}

class FundTransferAmountCheck implements  FundTransferCheck{
    @Override
    public void fundTransferCheck() {
        System.out.println("Fund transfer checked");
    }
}
interface Bank{
    void sendMoney();
}
public class Facade implements Bank {
    AccountCheck accountCheck;
    SecurityCheck securityCheck;
    FundTransferCheck fundTransferCheck;

    Facade(){
        accountCheck = new AccountNumberCheck();
        securityCheck = new SecurityCodeCheck();
        fundTransferCheck = new FundTransferAmountCheck();
    }
    @Override
    public void sendMoney() {
        accountCheck.accountCheck();
        securityCheck.securityCheck();
        fundTransferCheck.fundTransferCheck();
    }
}

class FacadeDemo{
    public static void main(String[] args) {
        Bank bank = new Facade();
        bank.sendMoney();
    }
}
