package eu.ricardocabral.remote;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand celingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffWithCD = new StereoOffCommand(stereo);
		
		
		remoteControl.setCommand(0, livingRoomLightOn,livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, celingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPusshed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPusshed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPusshed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPusshed(3);
		
		RemoteControlWithUndo remoteWithUndo = new RemoteControlWithUndo();
		
		Light lightLivingRoom = new Light("Living Room");
		
		LightOnCommand lightOnLivingRoom = new LightOnCommand(lightLivingRoom);
		LightOffCommand lightOffLivingRoom = new LightOffCommand(lightLivingRoom);
		
		remoteWithUndo.setCommand(0, lightOnLivingRoom, lightOffLivingRoom);
		
		remoteWithUndo.onButtonWasPushed(0);
		remoteWithUndo.offButtonWasPushed(0);
		System.out.println(remoteWithUndo);
		remoteWithUndo.undoButtonWasPushed();
		remoteWithUndo.offButtonWasPushed(0);
		remoteWithUndo.onButtonWasPushed(0);
		System.out.println(remoteWithUndo);
		remoteWithUndo.undoButtonWasPushed();
	}
	
	
	
}
