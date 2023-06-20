public class Main {
    public static void main(String[] args) {
        //Pizza basePizza =new Pizza(true);
      //  Pizza basePizza =new Pizza(false);
      //  basePizza.addExtraCheese();
      //  basePizza.addExtraToopings();
      //  basePizza.takeAway();
      //  basePizza. getBill();

        DeluxPizza dp = new DeluxPizza(false);
        //DeluxPizza dp=new Deluxpizza(true);
       // dp.addExtraCheese();
       // dp.addExtraToopings();
        dp.takeAway();
        dp.getBill();

    }
}
