package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int intSymbol = symbol;
        if (intSymbol < 300) {
            System.out.println("English");
        } else if (intSymbol > 900) {
            System.out.println("Non English");
        }
    }
}
