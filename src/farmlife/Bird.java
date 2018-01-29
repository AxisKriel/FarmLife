/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmlife;

/**
 * A Critter capable of flight.
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Bird extends Critter
{
	private int staminaToFly;

	public Bird()
	{
		super(20, 5);
		staminaToFly = 2;
	}

    public void fly()
    {
        
    }
}
