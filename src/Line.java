
public class Line extends GraphicLibrary{
	
	public Line() {
		super(getRenderer());
	}
	
	private static IPlatformRenderer getRenderer() {
		IPlatformRenderer renderer;
		String os = System.getProperty("os.name");
		if(os.equalsIgnoreCase("Windows"))
		{
			renderer = new WindowsRenderer();
		}
		else
		{
			renderer = new MacRenderer();
		}
		return renderer;
	}
	public void draw()
	{
		renderer.RenderLine();
	}
}
