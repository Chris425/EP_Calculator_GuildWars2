
package logic;


/**
 * Class designed to take data from the form and store it in an object
 * to facilitate the file saving process.
 * @author CDiconza
 */
public class FormInfo {

    private String txtMight;
    private String txtFuryUptime;
    private String txtPower;
    private String txtPrecision;
    private String txtFerocity;
    private String txtMultipliers;
    private String mySigil;
    private String txtHitPoints;
    private String txtArmour;
    private String txtBaseArmour;
    
    private String lblEP;
    private String lblBloodlust;
    private String lblPerception;
    private String lblCruelty;    
    private String lblEH;
    private String lblEHAddHealth;
    private String lblEHAddTough;
    
    private String txtArea;

    //Default Constructor:
    public FormInfo() {
    }   

    //parameterized Constructor
    public FormInfo(String txtMight, String txtFuryUptime, String txtPower, String txtPrecision, String txtFerocity, String txtMultipliers, String mySigil, String txtHitPoints, String txtArmour, String txtBaseArmour, String lblEP, String lblBloodlust, String lblPerception, String lblCruelty, String lblEH, String lblEHAddHealth, String lblEHAddTough, String txtArea) {
        this.txtMight = txtMight;
        this.txtFuryUptime = txtFuryUptime;
        this.txtPower = txtPower;
        this.txtPrecision = txtPrecision;
        this.txtFerocity = txtFerocity;
        this.txtMultipliers = txtMultipliers;
        this.mySigil = mySigil;
        this.txtHitPoints = txtHitPoints;
        this.txtArmour = txtArmour;
        this.txtBaseArmour = txtBaseArmour;
        this.lblEP = lblEP;
        this.lblBloodlust = lblBloodlust;
        this.lblPerception = lblPerception;
        this.lblCruelty = lblCruelty;
        this.lblEH = lblEH;
        this.lblEHAddHealth = lblEHAddHealth;
        this.lblEHAddTough = lblEHAddTough;
        this.txtArea = txtArea;
    }
  
    /**
     * Displays all relevant information in a formatted string.
     * @return 
     */
    @Override
    public String toString()
    {        
    String output ="RESULTS: " + "\r\n \r\n Might: " + txtMight + "\r\n Fury Uptime: " + txtFuryUptime + "\r\n Power: " + txtPower +
            "\r\n Precision: " + txtPrecision + "\r\n Ferocity: " + txtFerocity + "\r\n Multipliers: " + 
            txtMultipliers + "\r\n Sigil? " + mySigil + "\r\n Hitpoints: " + txtHitPoints + "\r\n Armour: " 
            + txtArmour + "\r\n Base Armour class: " + txtBaseArmour + "\r\n Effective Power: " + lblEP + 
            "\r\n EP with 25 Bloodlust stacks: " + lblBloodlust + "\r\n EP with 25 Perception stacks: "  
            + lblPerception + "\r\n EP with 25 Cruelty stacks: " + lblCruelty + "\r\n Effective Health: " +
            lblEH + "\r\n Effect of adding 100 vitality: " + lblEHAddHealth  + "\r\n Effect of adding 100 toughness: "
            + lblEHAddTough + "\r\n Your notes: " + txtArea + "\r\n" + "\r\n" + "\r\n" +  "\r\n Created by Chris 2015. ";
    
    return output;       
    }
    
    public String toHTML()
    {
        
         String output = 
            
                "<tr>" + 
            "<td> Might: </td> <td><b>" + txtMight + "</b> </td>" + "</tr>" +
                 "<tr>" +
            "<td> Fury Uptime: </td> <td><b> " + txtFuryUptime + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> Power: </td> <td><b> " + txtPower +"</b> </td>" + "</tr>" +
                 "<tr>" +
            "<td> Precision: </td> <td><b>" + txtPrecision + "</b> </td>" + "</tr>" +
                 "<tr>" +
            "<td> Ferocity: </td><td><b>" + txtFerocity + "</b> </td>" + "</tr>" +
                 "<tr>" +
            "<td> Multipliers: </td> <td><b> " + txtMultipliers + "</b> </td>" + "</tr>" +
                 "<tr>" +
            "<td> Sigil? </td> <td><b>" + mySigil + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> Hitpoints: </td> <td><b>" + txtHitPoints + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> Armour: </td> <td><b>" + txtArmour + "</b></td>" + "</tr>" + 
                 "<tr>" +
            "<td> Base Armour class:</td> <td><b> " + txtBaseArmour + "</b></td>" +  "</tr>" +
                 "<tr>" +            
            "<td> Effective Power: </td> <td><b>" + lblEP + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> EP with 25 Bloodlust stacks: </td> <td><b>" + lblBloodlust + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> EP with 25 Perception stacks: </td> <td><b>" + lblPerception + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> EP with 25 Cruelty stacks: </td> <td><b>" + lblCruelty + "</b></td>" + "</tr>" +
                 "<tr>" +            
            "<td> Effective Health: </td> <td><b>" + lblEH + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> Effect of adding 100 vitality: </td> <td><b>" + lblEHAddHealth  + "</b></td>" + "</tr>" +
                 "<tr>" +
            "<td> Effect of adding 100 toughness: </td> <td><b>" + lblEHAddTough + "</b></td>" + "</tr>" +
                 "<tr>" +                            
            "<td> Your notes: </td><td>" + txtArea + "</td>" + "</tr>";           
            
    
    return output;
    }
    
    
    //Accessors (getters)

    public String getTxtMight() {
        return txtMight;
    }    

    public String getTxtFuryUptime() {
        return txtFuryUptime;
    }


    public String getTxtPower() {
        return txtPower;
    }

    public String getTxtPrecision() {
        return txtPrecision;
    }


    public String getTxtFerocity() {
        return txtFerocity;
    }

    public String getTxtMultipliers() {
        return txtMultipliers;
    }

   
    public String getMySigil() {
        return mySigil;
    }

    public String getTxtHitPoints() {
        return txtHitPoints;
    }

   
    public String getTxtArmour() {
        return txtArmour;
    }

    
    public String getTxtBaseArmour() {
        return txtBaseArmour;
    }

    
    public String getLblEP() {
        return lblEP;
    }

    

    public String getLblBloodlust() {
        return lblBloodlust;
    }

   
    public String getLblPerception() {
        return lblPerception;
    }

   
    public String getLblCruelty() {
        return lblCruelty;
    }

    public String getLblEH() {
        return lblEH;
    }

   
    public String getLblEHAddHealth() {
        return lblEHAddHealth;
    }

    public String getLblEHAddTough() {
        return lblEHAddTough;
    }

  
    public String getTxtArea() {
        return txtArea;
    }

   
    
}