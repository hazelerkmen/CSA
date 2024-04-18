public class SpecialCheckingAccount extends CheckingAccount{

    private double mb;
    private double air;

    public SpecialCheckingAccount(int id, double balance, double cc, double annualIR, double minBalance){
        super(id,balance,cc);
        mb = minBalance; air = annualIR;
    }

    public void clearCheck(double amount){
        if(currentBalance()>mb){
            decreaseBalance(amount);
        }
        else
            super.clearCheck(amount);
    }

    public double monthlyInterest(){
        if(currentBalance()>mb){
            return currentBalance()*air/12;
        }
        else
            return super.monthlyInterest();
    }

}