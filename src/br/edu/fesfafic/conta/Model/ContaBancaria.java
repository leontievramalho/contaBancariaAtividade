package br.edu.fesfafic.conta.Model;

public abstract class ContaBancaria {
    public String accountNumber;
    public String holder;
    private double balance;

    public ContaBancaria(String accountNumber, String holder, double balance){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolder(){
        return holder;
    }
    private double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return "ContaBancaria{" +
                "númeroConta='" + this.accountNumber + '\'' +
                ", titular='" + this.holder + '\'' +
                ", saldo='" + this.balance + "'}";
    }

}
