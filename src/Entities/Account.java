package Entities;

public class Account {
    private Integer number;
    private String nome;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String nome, Double balance, Double withdrawLimit) {
        this.number = number;
        this.nome = nome;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        if (balance < amount){
            System.out.println("UNAVAILABLE BALANCE");
        }if(amount > withdrawLimit){
            System.out.println("The amount is higher than the withdrawal limit");
        }else{
        balance -= amount;
    }
    }


}
