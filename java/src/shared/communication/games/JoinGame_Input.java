package shared.communication.games;

import com.google.gson.Gson;

public class JoinGame_Input 
{
	private int id;
	private String color;
	
	public JoinGame_Input()
	{
		
	}
	
	public JoinGame_Input(int id, String color)
	{
		this.setId(id);
		this.setColor(color);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toJSON()
	{
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
