public class Atelier {
    public void dressMan(Clothing[] clothes) {
        for (Clothing clothing : clothes) {
            if (clothing instanceof MensClothing) {
                ((MensClothing) clothing).dressMan();
                System.out.println(clothing.getSize().getDescription());
            }
        }
    }

    public void dressWoman(Clothing[] clothes) {
        for (Clothing clothing : clothes) {
            if (clothing instanceof WomensClothing) {
                ((WomensClothing) clothing).dressWoman();
                System.out.println(clothing.getSize().getDescription());
            }
        }
    }
}
