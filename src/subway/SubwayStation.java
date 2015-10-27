package subway;

public class SubwayStation {
	public enum State {UNLOCKED, LOCKED};
	private State currState;
	public SubwayStation(){
		currState = State.LOCKED;
	}
	public void insertCoin(){
		if(currState == State.UNLOCKED){
			System.out.println("It is already unlocked");
			lightUpThanks();
		}
		else if(currState == State.LOCKED){
			System.out.println("Coin inserted");
			currState = State.UNLOCKED;
		}
		else{
			System.out.println("How did you do that");
		}
	}
	public State getCurrState() {
		return currState;
	}
	public void setCurrState(State currState) {
		this.currState = currState;
	}
	public void pass(){
		if(currState == State.UNLOCKED){
			System.out.println("Welcome to the Subway");
			currState = State.LOCKED;
		}
		else if(currState == State.LOCKED){
			System.out.println("You shall not pass!");
			signalAlarm();
		}
		else{
			System.out.println("How did you do that");
		}
	}
	public void signalAlarm(){
		if(currState == State.LOCKED){
			System.out.println("WeeWooWeeWooWeeWooEHHHHHHHHHHHH");
		}
	}
	public void lightUpThanks(){
		if(currState == State.UNLOCKED){
			System.out.println("Thank You Light Activated");
		}
	}

}
