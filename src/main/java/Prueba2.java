
public class Prueba2 {

    public static void main(String[] args) {

        String zombies = "814";
        String humans = "334";

        System.out.println(battleHorde(zombies, humans));

    }

    private static String battleHorde(String zombies, String humans) {

        int z = 0, h = 0;

        for(int i = 0; i<zombies.length(); i++){
            z += Integer.parseInt(String.valueOf(zombies.charAt(i)));
            h += Integer.parseInt(String.valueOf(humans.charAt(i)));
        }

        int dif = Math.abs(z - h);

        if(dif == 0){
            return "x";
        }

        String letter;
        if(h>z){
            letter = "h";
        } else {
            letter = "z";
        }

        return dif + letter;

    }

}
