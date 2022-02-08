public class BankAccount{
    int balance = 0;
    boolean open = false;
    
    public void open(){
        this.open = true;    
    }

    public int getBalance()throws BankAccountActionInvalidException{
       if(this.open){
            return this.balance;
       }else{
           throw new BankAccountActionInvalidException("Account closed");
       }
    }

    public synchronized void deposit(int value)throws BankAccountActionInvalidException{
          if(this.open){
              if(value < 0){
                 throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount"); 
              }else{
                  this.balance += value;
              }
       }else{
           throw new BankAccountActionInvalidException("Account closed");
       }
    }

    public synchronized void withdraw(int value) throws BankAccountActionInvalidException{
      if(this.open){
          if(this.balance > 0){
           if(this.balance >= value){
               if(value >= 0){
                     this.balance -= value;
               }else{
                    throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
                   
               }
            }
          else{
              throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
          }
       }else{
          throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
       }
          }else{
         
            throw new BankAccountActionInvalidException("Account closed");
         
          }
        
    }
    public void close(){
        this.open = false;
    }

}
