/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;

/**
 * Represents a predator animal
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Predator extends Animal
{
    protected String name;
    protected float captureRate;
    protected float sleepCaptureRate;

    public Predator(int stamina, int staminaToRun, String name, float captureRate)
    {
    	super(stamina, staminaToRun);
    	this.name = name;
    	this.captureRate = captureRate;

    	// If the target is sleeping, capture rate is a fixed 50% chance
        sleepCaptureRate = 1/2;
    }

    public String getName()
    {
    	return name;
    }
    
    public boolean hunt(Critter target)
    {
        
    }
}
