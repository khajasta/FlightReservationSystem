package apa2;

@SuppressWarnings("serial")
public class UniqueEmail extends RuntimeException {

	public UniqueEmail(String message)
	{
		super(message);
	}
}
