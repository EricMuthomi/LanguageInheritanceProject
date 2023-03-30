public class Dinner {
    //create a makeNoodles() method that accepts Noodle object as an argument

    private void makeNoodles(Noodle noodles, String sauce){
        noodles.cook();

        System.out.println("Mixing "+noodles.texture + " noodles made from "
        +noodles.ingredients + " with "+ sauce + ".");

        System.out.println("Dinner is ready to be served!");
    }

    public static void main(String[] args) {
        Dinner dinner = new Dinner();

        //Here, we instantiate a BiangBiang object as a Noodle called biangBiang

        Noodle biangBiang = new BiangBiang();

        //Then, we call makeNoodles on dinner with the following arguments
        // biangBiang
        // "soy sauce and chili oil"
        dinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }
}
