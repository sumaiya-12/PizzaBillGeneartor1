public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToopings();
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese();
    }

    @Override
    public void addExtraToopings() {
        super.addExtraToopings();
    }
}
