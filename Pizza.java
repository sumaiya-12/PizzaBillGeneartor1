import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 150;
    private int extraToppingsPrice =250;
    private int backPackprice =50;

    private int basePizzaPrice;

    private boolean isExtraCheeseadded= false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway= false;

    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=200;

        }
        else{
            this.price=400;
        }
        basePizzaPrice = this. price;
    }
    public void addExtraCheese(){
        isExtraCheeseadded = true;
        this. price += extraCheesePrice;
    }
    public void addExtraToopings(){
        isExtraToppingsAdded = true;
        this. price += extraToppingsPrice;
    }
    public void takeAway(){
        isOptedForTakeAway = true;
        this. price +=backPackprice;
    }
    public void getBill() {
        String bill ="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseadded) {
            bill +="Extra cheese added:"+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill +="Extra Toppings added:"+extraToppingsPrice +"" + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away:"+extraCheesePrice+ "\n";
        }
        bill += "Bill:"+this. price+"\n";
        System.out.println(bill);

    }
}
