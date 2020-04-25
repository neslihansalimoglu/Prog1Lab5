public class Question55{

	//attribute
	public String teamName;

	//constructor
	public Question55(String teamName){
		this.teamName =teamName;
	}

	//accesor
	public String getteamName(){
		return teamName;
	}

	public String setTeamName(String teamName){
		this.teamName = teamName;
		return this;
	}

	//tostring
	 public String toString() {
        return "The team name is : " + teamName;
    }

    public boolean equals(Question55 other){
        return (teamName.equals(other.teamName));
    }
}