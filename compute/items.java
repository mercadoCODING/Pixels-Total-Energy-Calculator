package compute;

import java.util.HashMap;

public class items {
    private static HashMap<String, Double> items;

    public void initializeItems(){
        items = new HashMap<>(){{
            put("Popberry", 3.5);
            put("Butterberry" , 3.5);
            put("Scarrot" , 8.0);
            put("Grainbow" , 4.0);
            put("Grumpkin" , 7.5);
            put("Orange Grumpkin", 1.5);
            put("Watermint", 8.0);
            put("Astracactus" , 11.5);
            put("Clover" , 5.0);
            put("Four-leaf Clover" , 5.0);
            put("Heartbeet" , 3.5);
            put("Shorelime" , 3.0);
            put("Razzleberry Cotton Candy" , 1.5);
            put("Bluzberry Cotton Candy" , 1.5);
            put("Bluzzleberry Swirl Cotton Candy" , 1.5);
            put("Hotato", 10.5);
            put("Muckchuck" , 8.5);
            put("Java Bean" , 2.0);
        }};
    }

    public static HashMap<String,Double> getItems(){
        return items;
    }
}
