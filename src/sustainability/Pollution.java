/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @HARRYR
 */
public class Pollution {
    private String type;
    private String impact;
    private String fix;

    public Pollution(String type, String impact, String fix) {
        this.type = type;
        this.impact = impact;
        this.fix = fix;
    }

    public String getType() {
        return type;
    }

    public String getImpact() {
        return impact;
    }

    public String getFix() {
        return fix;
    }
    
    public String toString() {
        return "-Type: " + type + "\n" + "-Impact: " + impact + "\n" + "-Fix: " + fix;
    }
    
}
