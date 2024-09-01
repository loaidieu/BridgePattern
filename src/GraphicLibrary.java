
public abstract class GraphicLibrary {
	protected IPlatformRenderer renderer;
	
	public GraphicLibrary()
	{
		this.renderer = null;
	}
	
	public GraphicLibrary(IPlatformRenderer renderer) {
		this.renderer = renderer;
	}
	
	public abstract void draw();
}
