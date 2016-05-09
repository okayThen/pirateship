package org.vashonsd.pirateship.interactions;

import org.vashonsd.pirateship.commands.*;

public class Stopwatch extends Actor {

	private double start;
	private double end;
	
	public Stopwatch()
	{
		super("rusty", "stopwatch", "a rusty old timepeice", "what time is it?!?!?");
		this.enrollCommand(new Examine());
	}
	
	public Stopwatch(String name, String description, String splash)
	{
		super(name, "stopwatch", description, splash);
		this.enrollCommand(new Examine());
	}
	
	public void startTime()
	{
		start = System.currentTimeMillis();
	}
	
	public String examine()
	{
		double time = 0;
		end = System.currentTimeMillis();
		time = end - start;
		time = time/1000;
		start = 0;
		end = 0;
		
		if(time > 0)
			return "It has been " + time + " seconds since you started me.";
		else
			return "An unstarted stopwatch.";
	}
	
}
