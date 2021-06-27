
public class Account {
  private String accountNo;
  private int zandaka;

    private AccountType accountType;
    public Account(String aNo, AccountType aType) {
        this.accountNo = aNo;
        this.accoutType = aType;
    }

  public String getAccountNo() {
    return this.accountNo;
  }
  public int getZandaka() {
    return this.zandaka;
  }
  public void setZandaka(int zandaka) {
    this.zandaka = zandaka;
  }
  public AccountType getAccountType() {
    return accountType;
  }
}
