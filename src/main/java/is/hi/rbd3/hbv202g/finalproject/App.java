package is.hi.rbd3.hbv202g.finalproject;

import java.util.Scanner;



public class App 
{
    private static final int life = 100;
    public static void main( String[] args )
    {

        Boss boss = new Boss("Mammochon", life );
        creationPokemon();



    }

    public static void creationPokemon(){
        System.out.println("To start the game, you have to create a pokemon with his name and his type ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the name of your pokemon");
        String name = sc.nextLine();
        System.out.println("The name of your pokemon is : " + name);
        System.out.println("0= water , 1= fire, 2= grass");
        System.out.println("Please choose the type of your pokemon by enter a number between 0 and 2\n");
        System.out.println(" ");
        int  type = sc.nextInt();
        System.out.println("The type of your pokemon is : " + type);
        while (type < 0 || type > 2) {
            System.out.println("Wrong number. Please enter a number between 0 and 2");
            type = sc.nextInt();
        }

        System.out.println("The life of your pokemon is : " + life);

        if (type == 1) {
            FirePokemon pokemon = new FirePokemon(name, life);
        }
        else if (type ==0){
             WaterPokemon pokemon = new WaterPokemon(name, life);

        }
        else if (type == 2){
            GrassPokemon pokemon = new GrassPokemon(name, life);
        }



    }
}
