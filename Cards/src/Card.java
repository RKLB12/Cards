import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, suit;

    public Card(String faceName, String suit){
        setFaceName (faceName);
        setSuit (suit);
    }

    public String getFaceName() {
        return faceName;
    }
    /**
     * this method returns the list of face names that are valid for card objects
     */
    public static List<String> getValidFaceNames(){
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "queen", "king", "jack", "ace");
    }

    /**
     * this method will validate the argument and set the instance variable
     * @param faceName 2, 3, 4 , 5, 6, 7, 8 , 9, 10, jack, queen, king
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * this method will return a list of valid suits
     * @return spades, hearts, clubs, diamonds
     */

    public static List<String> getValidSuits(){
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }


    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit .toLowerCase();
        if (validSuits.contains(suit))
            this.suit = suit;
    }


    public String toString(){
        return String.format("%s of %s", faceName, suit);
    }
}
