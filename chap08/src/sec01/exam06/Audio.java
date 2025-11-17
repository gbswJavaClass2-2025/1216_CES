package sec01.exam06;

public class Audio implements RemoteControl{
    public int volume;

    @Override
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}
