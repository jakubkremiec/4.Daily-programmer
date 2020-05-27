public class Main {



    public int taxCalculate(int amount){

        int tax=0;

        if(amount>=10000 && amount<30000){
            tax = tax + smallTax(amount);
        }
        if(amount>=30000 && amount<100000){
            tax = 2000  + tax + mediumTax(amount);
        }
        if(amount>=100000){
            tax = 2000 + 17500 + tax + bigTax(amount);
        }
        if (amount<10000){
            tax = 0;
        }


     return tax;
    }


    public int smallTax(int amount){
        return (int)((amount-10000)*0.1);
    }

    public int mediumTax(int amount){
        return (int)((amount-30000)*0.25);
    }

    public int bigTax(int amount){
        return (int)((amount-100000)*0.4);
    }
}
