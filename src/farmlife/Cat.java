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
    /**
     * The probability, between 0 and 1, to hunt down a Bird
     */
    private float birdCaptureRate;
    /**
     * The amount of stamina used for defending against a Dog attack
     */
    private int staminaToDefend;

    public Cat(String name)
    {
        super(500, 25, name, 1/5);
        birdCaptureRate = 1/10;
        staminaToDefend = 25;
    }

    /**
     * The cat fends off an incoming Dog attack, spending some stamina
     */
    public void defend()
    {
    	stamina -= staminaToDefend;
    }
    
    @Override
    public boolean hunt(Critter prey)
    {
        // Logic for sleeping preys is simplified
    	if (prey.isAsleep())
    	{
            if (test(sleepCaptureRate))
            {
                stamina += prey.kill();
                return true;
            }
            else
            {
                prey.escape();
                return false;
            }
        }
        
        // Pursuit the target
        run();
        
        float testStatistic = prey instanceof Mouse ? 1/5 : 1/10;
        
        // The prey attempts to escape the predator
        prey.run();
        if (Math.random() < captureRate)
        {
            // The prey is killed and the dog obtains its stamina
            stamina += prey.kill();
            return true;
        }
        else
        {
            // The prey escaped and recovers some stamina
            prey.escape();
            return false;
        }
    }
}
