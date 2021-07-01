package jp.miyabilink.atm;
@SuppressWarnings("serial")
public class NewAccount extends Account{
    @Override
    public int transfer(Bank bank, Account dest, int amount){

    }

    @Deprecated
    public void transfer(Account dest, int amount){
        
    }
}