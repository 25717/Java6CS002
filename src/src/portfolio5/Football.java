package portfolio5;

public class Football implements Comparable<Football>{
	private int position;
	  private String club;
	  private int played;
	  private int won;
	  private int drawn;
	  private int lost;
	  private int totalPoint;
	  private int goalsForward;
	  private int goalsAway;
	  private int goalsDiffer;

	  public Football(int position, String club, int played, int won, int drawn, int lost, int totalPoint, int goalsForward, int goalsAway,int goalsDiffer) {
	    this.position = position;
	    this.club = club;
	    this.played = played;
	    this.won = won;
	    this.drawn = drawn;
	    this.lost = lost;
	    this.totalPoint = totalPoint;
	    this.goalsForward = goalsForward;
	    this.goalsAway = goalsAway;
	    this.goalsDiffer = goalsDiffer;
	   
	  }

	  public String toString() {
	    return String.format("%-3d%-20s%10d%10d%10d", position, club, totalPoint,
	        goalsForward, goalsAway);
	  }

	  public int getPosition() { //position
	    return position;
	  }

	  public void setPosition(int position) {
	    this.position = position;
	  }

	  public String getClub() { //club name
	    return club;
	  }

	  public void setClub(String club) {
	    this.club = club;
	  }

	  public int getPlayed() { //games played
	    return played;
	  }

	  public void setPlayed(int played) {
	    this.played = played;
	  }

	  public int getWon() { //games won
	    return won;
	  }

	  public void setWon(int won) {
	    this.won = won;
	  }

	  public int getDrawn() { //games drawn
	    return drawn;
	  }

	  public void setDrawn(int drawn) {
	    this.drawn = drawn;
	  }

	  public int getLost() {  // games lost
	    return lost;
	  }

	  public void setLost(int lost) {
	    this.lost = lost;
	  }

	  public int getTotalPoints() { //total points
	    return totalPoint;
	  }

	  public void setTotalPoints(int totalPoint) {
	    this.totalPoint = totalPoint;
	  }

	  public int getGoalsForward() { //goals forward
	    return goalsForward;
	  }

	  public void setGoalsForward(int goalsForward) {
	    this.goalsForward = goalsForward;
	  }

	  public int getGoalsAway() {  //goal away
	    return goalsAway;
	  }

	  public void setGoalsAway(int goalsAway) {
	    this.goalsAway = goalsAway;
	  }

	  public int getGoalDifference() {  //goal differences
	    return goalsDiffer;
	  }

	  public void setGoalDifference(int goalsDiffer) {
	    this.goalsDiffer = goalsDiffer;
	  }
 
	  public int compareTo(Football c) {
	    return ((Integer) goalsForward).compareTo(c.goalsForward);
	  }

	
}
