package shared.communication.moves;

import com.google.gson.Gson;

import shared.locations.HexLocation;

public class RobPlayer_Input 
{
	private final String type = "robPlayer";
	private int playerIndex;
	private int victimIndex;
	private HexLocation location;
	
	public RobPlayer_Input(int playerIndex, int victimIndex, HexLocation location) 
	{
		super();
		this.playerIndex = playerIndex;
		this.victimIndex = victimIndex;
		this.location = location;
	}

	/**
	 * @return the playerIndex
	 */
	public int getPlayerIndex()
	{
		return playerIndex;
	}

	/**
	 * @param playerIndex the playerIndex to set
	 */
	public void setPlayerIndex(int playerIndex)
	{
		this.playerIndex = playerIndex;
	}

	/**
	 * @return the victimIndex
	 */
	public int getVictimIndex()
	{
		return victimIndex;
	}

	/**
	 * @param victimIndex the victimIndex to set
	 */
	public void setVictimIndex(int victimIndex)
	{
		this.victimIndex = victimIndex;
	}

	/**
	 * @return the location
	 */
	public HexLocation getLocation()
	{
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(HexLocation location)
	{
		this.location = location;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	
	public String toJSON()
	{
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
