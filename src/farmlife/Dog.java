/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;
import java.lang;

/**
 * A high endurance Predator. Not very skilled, and may attack Cats on a whim.
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Dog extends Predator
{
	private int staminaToAttack;

    public Dog(String name)
    {
        super(10000, 50, name, 1/25);
        staminaToAttack = 100;
    }
    
    public void attackCat(Cat target)
    {
    	stamina -= staminaToAttack;
    	target.defend();
    }

    @Override
    public boolean hunt(Critter prey)
    {
    	if (prey.isAsleep())
    	{
    		return Math.random() < sleepCaptureRate;
    	}

    	// Pursuit the target
    	run();
    	if (prey instanceof Bird)
    	{
    		// A dog will never catch a flying bird
    		prey.fly();
    		return false;
    	}
    	else
    	{
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
}
