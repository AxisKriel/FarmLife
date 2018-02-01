/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;

/**
 * Represents a critter animal
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Critter extends Animal
{
    /**
     * Whether or not this Critter is alive
     */
    private boolean alive;
    
    public Critter(int stamina, int staminaToRun)
    {
        super(stamina, staminaToRun);
        alive = true;
    }
    
    public void escape()
    {
        stamina += 5;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public int kill()
    {
    	alive = false;
    	return stamina;
    }
}
