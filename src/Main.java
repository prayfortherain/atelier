public class Main{
    public static void main(String[] args){
        Clothing[] cloths = new Clothing[4];

        cloths[0] = new TShirt(ClothingSize.XXS, 500, "black");
        cloths[1] = new Pants(ClothingSize.XS, 1200, "green");
        cloths[2] = new Skirt(ClothingSize.M, 1000, "blue");
        cloths[3] = new Tie(ClothingSize.L, 900, "yellow");

        Atelier atelier = new Atelier();

        atelier.dressMan(cloths);
        atelier.dressWoman(cloths);
    }
}