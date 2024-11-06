import java.util.HashMap;
import java.util.Map;

public class Prueba1 {

    public static void main(String[] args) {

        int[] potions = {2, 2, 4, 1};
        int goal = 5;

        int[] result = createMagicPotion(potions, goal);

        if (result != null) {
            System.out.println("Indices encontrados: " + result[0] + " y " + result[1]);
        } else {
            System.out.println("No se encontró ninguna combinación.");
        }

    }

    public static int[] createMagicPotion(int[] potions, int goal){
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i<potions.length; i++){
            int currentPotion = potions[i];
            int complement = goal - currentPotion;

            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement), i};
            }

            seen.put(currentPotion, i);
        }
        return null;
    }


}
