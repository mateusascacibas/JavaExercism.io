public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        if(daysSkipped > 5){
            return 0.85;
        }else{
            return 1;
        }
    }

    public int multiplierPerProductsSold(int productsSold) {
        if(productsSold > 20){
            return 13;
        }else{
            return 10;
        }
    }

    public double bonusForProductSold(int productsSold) {
          if(productsSold > 20){
              return productsSold * 13;
          }else{
              return productsSold * 10;
          }
    }

    public double finalSalary(int daysSkipped, int productsSold) {
         double mult = multiplierPerDaysSkipped(daysSkipped);
        double bonus = bonusForProductSold(productsSold);
        double salary = mult * 1000 + bonus;
        if(salary > 2000){
            return 2000;
        }else{
            return salary;
        }
    } 
}
