
public class Circle extends GraphicLibrary{
	public Circle()
	{
		super(getRenderer());
	}
	
	private static IPlatformRenderer getRenderer()
	{
		IPlatformRenderer renderer;
		String os = System.getProperty("os.name");
		if(os.equalsIgnoreCase("windows")) {
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
		renderer.RenderCircle();
	}
}
