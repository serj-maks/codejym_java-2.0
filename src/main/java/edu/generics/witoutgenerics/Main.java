package edu.generics.witoutgenerics;

import static edu.generics.witoutgenerics.DisplayCharArray.displayCharArray;
import static edu.generics.witoutgenerics.DisplayDobArray.displayDobArray;
import static edu.generics.witoutgenerics.DisplayIntArray.displayIntArray;
import static edu.generics.witoutgenerics.DisplayStrArray.displayStrArray;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] dobArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strArray = {"B", "Y", "E"};

        // personal method for each array
        displayIntArray(intArray);
        displayDobArray(dobArray);
        displayCharArray(charArray);
        displayStrArray(strArray);
    }
}
