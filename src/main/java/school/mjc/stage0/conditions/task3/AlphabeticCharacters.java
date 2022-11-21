package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        int intChar = character;
        int endingIntChar = intChar % 10;

        if (intChar < 300) {
            if (endingIntChar == 1 || endingIntChar == 7) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else if (intChar > 900) {
            System.out.println("wrong alphabet");
        }


    }
}
