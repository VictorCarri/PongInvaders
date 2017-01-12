import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * GameObject is parent class to all classes that extend object. This was done to allow different game objects to have their own physics and render
 * <br>
 * <table><tr><td> 
 *  <table summary="">
 *   <tr>
 *      <td>Routine name|</td><td>In</td><td>|Out|</td><td>Exceptions</td>
 *      <tr>
 *      <td>GameObject</td><td>String,float,float,enumeration</td><td></td><td>ID has to be in ID class, Reference to sprite must be in right directory</td>
 *      </tr>
 *      <tr>
 *      <td>tick</td><td></td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>render</td><td>Graphics</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>getBounds</td><td></td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>setX</td><td>int</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>setY</td><td>int</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>getX</td><td></td><td>int</td><td></td>
 *      </tr>
 *      <tr>
 *      <td>getY</td><td></td><td>int</td><td></td>
 *      </tr>
 *      <tr>
 *      <td>setId</td><td>enumeration</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>setvelX</td><td>int</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>setvelY</td><td>int</td><td></td><td></td>
 *      </tr>
 *      <tr>
 *      <td>getvelX</td><td></td><td>int</td><td></td>
 *      </tr>
 *      <tr>
 *      <td>getvelY</td><td></td><td>int</td><td></td>
 *      </tr>
 *   </tr>
 * </table>
 * <br>
 * Assumptions: No Assumptions <br><br>
 * 
 * State Variables: 
 * <br>
 *
 *ref : String<br>
 *Is the reference to which directory the sprite of GameObject is located<br>
 * x: float<br>
 * Is the x-position of game object on window<br>
 * y: float<br>
 * Is the y-position of game object on window<br>
 * id: enumeration<br>
 * Is the identification of which class is being referred to<br>
 * velX: float<br>
 * Is the velocity of game object in the x-direction<br>
 * velY: float<br>
 * Is the velocity of object in the y-direction<br>
 * g: Graphics<br>
 * allows graphics to be drawn on to screen<br>
 * sprite : Sprite<br>
 * Creates object of type Sprite 
 * <br>
 * 
 * Environment  Variables: <br>
 * None<br><br>
 * 
 * Access Routine Semantics: <br>
 * GameObject():<br>
 * transition: Initializes x position y position and ID of a game object  <br>
 * tick():<br>
 * transition: Allows game objects to be placed in game loop <br>
 * render():<br>
 * transition: Will render object to screen with no handler <br>
 * getBounds():<br>
 * transition: Creates hit boxes to allow collision to happen <br>
 * render():<br>
 * transition: Manages the allotment of memory by using Buffer Strategy. Renders black background on to window. <br>
 * getBounds():<br>
 * transition: Creates hit boxes to allow collision to happen <br>
 * setX():<br>
 * transition: Setter for x position of game object <br>
 * setY():<br>
 * transition: Setter for y position of game object <br>
 * getX():<br>
 * transition: Gets value of x position of game object <br>
 * getY():<br>
 * transition: Gets value of x position of game object <br>
 * setID():<br>
 * transition: Sets the id  of game object<br>
 * getID():<br>
 * transition: gets the id  of game object<br>
 * setvelX():<br>
 * transition: Setter for velocity of x position of game object <br>
 * setvelY():<br>
 * transition: Setter for velocity of y position of game object <br>
 * getvelX():<br>
 * transition: Gets value of velocity of x position of game object <br>
 * getvelY():<br>
 * transition: Gets value of velocity x position of game object <br>
 * 
 */	
public abstract class GameObject {

	protected  float x, y;
	protected ID id;
	protected float velX, velY;
	protected Sprite sprite;
	public GameObject(String ref,float x, float y, ID id){
		this.sprite = SpriteStore.get().getSprite(ref);
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render (Graphics g);
	public abstract Rectangle getBounds();
	
	
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
	
	public void setId(ID id){
		this.id = id;
	}
	
	public ID getId(){
		return id;
	}
	
	public void setVelX(int velX){
		this.velX=velX;
	}
	
	public void setVelY(int velY){
		this.velY= velY;
	}
	public float getVelX(){
		return velX;
	}
	public float getVelY(){
		return velY;
	}

}
