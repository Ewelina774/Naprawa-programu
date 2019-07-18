public class Main {

    public static void main(String[] args) {

        Ingredient ingredient1 = new Ingredient ();
        ingredient1.name = "woda";
        ingredient1.amount = 250;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "herbata";
        ingredient2.amount = 1;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "cukier";
        ingredient3.amount = 2;

        Drink drink1 = new Drink ();
        drink1.name = "herbata";
        drink1.prize = 12;
        drink1.isAlcohol = false;
        drink1.ingredient1 = ingredient1;
        drink1.ingredient2 = ingredient2;
        drink1.ingredient3 = ingredient3;

        double sum = drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount;

        System.out.println("Nazwa: " + drink1.name + "\n" +
                "Cena: " + drink1.prize + "\n" +
                "Czy zawiera alkohol? " + drink1.isAlcohol + "\n " +
                "Składniki: " + drink1.ingredient1.name + " " + drink1.ingredient2.name + " " + drink1.ingredient3.name + "\n" +
                "Suma ilości wszystkich składników: " + sum);

    }
}
