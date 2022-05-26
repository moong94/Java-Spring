package ch16.gamelevel;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		upgradeLevel(level);
	}
		
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
