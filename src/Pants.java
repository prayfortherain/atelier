public class Pants extends Clothing implements MensClothing, WomensClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в штаны");
    }
}
