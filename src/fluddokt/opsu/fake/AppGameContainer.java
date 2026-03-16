package fluddokt.opsu.fake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;

public class AppGameContainer extends GameContainer {

	public static int containerWidth, containerHeight;
	
	public AppGameContainer(Game2 game) {
		super((StateBasedGame) game);
	}

	public AppGameContainer(Game2 game, int width, int height, boolean fullscreen) {
		super((StateBasedGame) game);
	}

	public void setWindowedMode(int containerWidth, int containerHeight) throws SlickException {
		System.out.println("setWindowedMode :" + containerWidth + " "
				+ containerHeight);
		AppGameContainer.containerWidth = containerWidth;
		AppGameContainer.containerHeight = containerHeight;

		Gdx.graphics.setWindowedMode(containerWidth, containerHeight);
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
	}

	public void setFullscreenMode(Graphics.DisplayMode DisplayMode) throws SlickException {
		System.out.println("setFullscreenMode :");
		Gdx.graphics.setFullscreenMode(DisplayMode);
	}

	public void setIcons(String[] icons) {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
