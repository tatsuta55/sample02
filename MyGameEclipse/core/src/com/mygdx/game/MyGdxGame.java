package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.sun.javafx.text.GlyphLayout;

public class MyGdxGame extends ApplicationAdapter {
	final int SIZE_CHR = 64;
	final int VIEWPORT_WIDTH = 800;
	final int VIEWPORT_HEIGHT = 800;


	SpriteBatch batch;
	Texture img;
	Animation anim;
	BitmapFont font;
	GlyphLayout glyph;
	OrthographicCamera camera;
	Music music;
	Sound coin;

	float mCurrentDeltaTime = 0;
	private int touchCount = 0;


	@Override
	public void create()
	{
		batch = new SpriteBatch();

		img = new Texture("UnityChan.png");
		Array<TextureRegion> frames = new Array<TextureRegion>();
		for(int rows = 1; rows <=2; ++rows){
			for(int columns = 0; columns < 4; ++columns){
				TextureRegion region  = new TextureRegion(img,columns * SIZE_CHR,rows * SIZE_CHR,SIZE_CHR,SIZE_CHR);
				frames.add(region);
			}
		}

		//batch.end();

;	}

	@Override
	public void render()
	{

	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
