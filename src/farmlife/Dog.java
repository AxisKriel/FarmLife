/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;

/**
 * A high endurance Predator. Not very skilled, and may attack Cats on a whim.
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Dog extends Predator
{
    /**
     * The amount of stamina required to attack a cat
     */
    private int staminaToAttack;

    /**
     * Creates a new instance of the Dog class with the given name
     * @param name The name for this Dog
     */
    public Dog(String name)
    {
        super(10000, 50, name, 1/25);
        staminaToAttack = 100;
    }
    
    /**
     * Attacks a Cat.
     * @param target 
     */
    public void attackCat(Cat target)
    {
    	stamina -= staminaToAttack;
    	target.defend();
    }

    /**
     * Hunts target Critter.
     * @param prey The Critter to hunt.
     * @return True if the hunt succeeded; false if the prey escaped.
     */
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
    	if (prey instanceof Bird)
    	{
    		// A dog will never catch a flying bird
                ((Bird)prey).fly();
    		return false;
    	}
    	else
    	{
    		// The prey attempts to escape the predator
    		prey.run();
    		if (test(captureRate))
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
