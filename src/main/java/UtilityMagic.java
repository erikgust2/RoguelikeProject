// Funktionalitetsmagi. Används för att ändra på standard attribut.

public class UtilityMagic extends Magic {

    // Värde
    private int utilityValue;

    // Konstruktor
    public UtilityMagic(int spellCost, String spellName, int utilityValue){
        super(spellCost, spellName);

        this.utilityValue = utilityValue;

    }

    // Set-metod.
    public void setUtilityValue(double amount){
        if(amount < 0 ) {
            throw new IllegalArgumentException("Value cannot be lower than zero");
        }
        this.utilityValue *= amount;
    }

    // Get-metod
    public int getUtilityValue() {
        return utilityValue;
    }
}
