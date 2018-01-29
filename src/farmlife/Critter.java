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
    private boolean isAlive;
    
    public Critter(int stamina, int staminaToRun)
    {
        super(stamina, staminaToRun);
        isAlive = true;
    }
    
    public void escape()
    {
        stamina += 5;
    }

    public int kill()
    {
    	isAlive = false;
    	return stamina;
    }
}
