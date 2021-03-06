// Funktionalitetsmagi. Används för att ändra på standard attribut.

public class UtilityMagic extends Magic {

    // Värde
    private double utilityValue;
    private final String utilityType;

    // Konstruktor
    public UtilityMagic(int spellCost, String spellName, double utilityValue, String type){
        super(spellCost, spellName);
        this.utilityType = type;
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
    public double getUtilityValue() {
        return this.utilityValue;
    }

    // Get-metod
    public String getUtilityType(){
        return utilityType;
    }
}
