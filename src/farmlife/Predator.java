package farmlife;

/**
 * Represents a predator animal
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public abstract class Predator extends Animal
{
    /**
     * The name of this predator instance
     */
    protected String name;
    /**
     * The probability, between 0 and 1, to capture a basic Critter, like a Mouse
     */
    protected float captureRate;
    /**
     * The probability, between 0 and 1, to capture any sleeping prey
     */
    protected float sleepCaptureRate;

    /**
     * Creates a new instance of an Animal capable of preying on Critters
     * @param stamina The starting amount of stamina
     * @param staminaToRun The amount of stamina consumed for a single run
     * @param name The name for this predator
     * @param captureRate The rate at which the predator successfully hunts its prey
     */
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
    
    /**
     * Hunts down a prey
     * @param prey The prey to hunt
     * @return True if the hunt succeeded; false if the prey escaped
     */
    public abstract boolean hunt(Critter prey);
}
