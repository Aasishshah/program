public class Bus extends Vehicle{
//public void playHorn(){
//System.out.println("Bus ko awaj");
//}
public void play(){
	super.playHorn();
	this.playHorn();
}
public static void main(String[] args){
Bus b = new Bus();
this.play();
}
}