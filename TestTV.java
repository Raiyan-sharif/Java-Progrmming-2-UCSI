public class TestTV{
	public static void main(String[] args){
		TV t= new TV(2,4,false);
		t.volumeUp();
		//t.display();
		t.turnOn();
		t.channelUp();
		t.volumeUp();
		t.setChannel(23);
		t.setVolume(20);
		//t.display();
		t.turnOff();
	}
	
}
class TV{
	int channel;
	int volumeLevel;
	boolean on;
	public TV(){
		this.channel=0;
		this.volumeLevel=0;
		this.on=false;
	}
	
	public TV(int channel,int volumeLevel,boolean on){
		this.channel=channel;
		this.volumeLevel=volumeLevel;
		this.on=on;
	}
	public void turnOn(){
		this.on= true;
	}
	public void turnOff(){
		this.on=false;
	}
	public void setChannel(int newChannel){
		if(this.on == true){
			this.channel = newChannel;
		}
	}
	public void setVolume(int newVolume){
		if(this.on == true){
			this.volumeLevel = newVolume;
		}
	}
	public void channelUp(){
		if(this.on == true){
			this.channel++;
		}
	}
	public void channelDown(){
		if(this.on == true){
			this.channel--;
		}
	}
	public void volumeUp(){
		if(this.on == true){
			this.volumeLevel++;
		}
	}
	public void volumeDown(){
		if(this.on == true){
			this.volumeLevel--;
		}
		
	}
	/*
	public void display(){
		System.out.println("Channel : "+this.channel);
		System.out.println("Volume : "+this.volumeLevel);
		System.out.println("TV State on : "+this.on);
		System.out.println("---------------------------------------------------------");
	}*/
		
}