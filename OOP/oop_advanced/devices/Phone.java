public class Phone extends Device{

    public void makeCall(){
        this.battery -= 5;
        System.out.println("You are making a call.");
        super.deviceStatus();
    }

    public void playGame(){
        this.battery -= 20;
        System.out.println("You are playing a game.");
        super.deviceStatus();
    }

    public void charge(){
        this.battery +=50;
        System.out.println("You are charging.");
        super.deviceStatus();
    }
    
}