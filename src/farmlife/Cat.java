/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;

/**
 * A Predator with lower endurance but good hunting skills. Can hunt Birds.
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Cat extends Predator
{
	private float birdCaptureRate;
	private int staminaToDefend;

    public Cat(String name)
    {
        super(500, 25, name, 1/5);
        birdCaptureRate = 1/10;
        staminaToDefend = 25;
    }

    public void defend()
    {
    	stamina -= staminaToDefend;
    }
    
    public boolean huntBird(Bird target)
    {
        
    }
}
