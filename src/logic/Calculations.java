
package logic;

/**
 *
 * @author CDiconza
 */
public class Calculations {
    
     /**
     * Method to determine effective power. Takes in 4 double parameters 
     * (power, precision, ferocity and damage multipliers) 
     * and puts them through DeKeyZ's EP formula. 
     * @param pow
     * @param prec
     * @param fer
     * @param mul
     * @param fury
     * @return 
     */    
     public static double getEP(double pow, double prec, double fer, double mul, double fury)
    {
    double power = pow;
    double precision = prec;
    double ferocity = fer;
    double constDiv = 2100.0;
    double furyConst = 0.2;
    double feroConst = 1500.0;
    double damageMul = mul;
    double furyUptime = fury;
    
    
   
    double myOutput = (((((precision - 832)/ constDiv + (furyConst * furyUptime)) * (ferocity/feroConst + 0.5)) + 1) * power) * damageMul;
    return myOutput;
    }
    
    /**
     * Method to get Effective Health.
     * @param health
     * @param arm
     * @param baseArm
     * @return 
     */
    public static double getEH(double health, double arm, double baseArm){
    double myHealth = health;
    double armour = arm;
    double baseArmour = baseArm;
    double effectiveHealth = ((myHealth * armour ) / baseArmour);
    return effectiveHealth;

    }
    
}
