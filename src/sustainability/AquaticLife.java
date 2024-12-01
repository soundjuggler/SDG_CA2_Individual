/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @HARRY 
 */
public class AquaticLife {
    private String name;
    private String location;
    private int population;
    private String status;

    public AquaticLife(String name, String location, int population, String status) {
        this.name = name;
        this.location = location;
        this.population = population;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPopulation() {
        return population;
    }

    public String getStatus() {
        return status;
    }
    
    public String toString() {
        return name + " | Location: " + location + " | Population: " + population + " | Status: " + status;
    }
    
}
