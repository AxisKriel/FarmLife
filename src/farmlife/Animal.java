package farmlife;

/**
 * Animal Base Class
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public abstract class Animal
{
    /**
     * The amount of stamina the Animal currently possesses
     */
    protected int stamina;
    /**
     * The maximum amount of stamina the Animal may have
     */
    protected int staminaMax;
    /**
     * Whether or not the Animal is sleeping
     */
    private boolean sleeping;
    /**
     * The amount of stamina the Animal uses to run
     */
    private int staminaToRun;
    
    /**
     * Creates a new instance of the Animal class with given stamina values
     * @param stamina The starting amount of stamina
     * @param staminaToRun The amount of stamina consumed for a single run
     */
    public Animal(int stamina, int staminaToRun)
    {
        this.stamina = stamina;
        staminaMax = stamina;   // the stamina cap is set to the starting value
        sleeping = false;
        
        this.staminaToRun = staminaToRun;
    }
    
    /**
     * The animal runs around, spending some of its stamina
     */
    public void run()
    {
        stamina -= staminaToRun;
    }

    /**
     * Gets the animal's current stamina
     */
    public int getStamina()
    {
        return stamina;
    }

    public int getStaminaMax()
    {
        return staminaMax;
    }

    /**
     * Gets a fraction, between 0 and 1, of the current stamina
     * @return A float representing the fraction of stamina the Animal has
     */
    public float getStaminaPercent()
    {
        return stamina / staminaMax;
    }

    /**
     * Checks if the Animal is sleeping
     * @return True if the animal is asleep; false if it's not
     */
    public boolean isAsleep()
    {
        return sleeping;
    }
    
    /**
     * Makes the Animal sleep
     */
    public void sleep()
    {
        sleeping = true;
    }
    
    /**
     * Runs a random probability test with the given probability value
     * @param probability The probability factor, between 0 and 1
     * @return True if it succeeds; false otherwise
     */
    public static boolean test(float probability)
    {
        return Math.random() < probability;
    }
}
