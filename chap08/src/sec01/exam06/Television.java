package sec01.exam06;

public class Television implements RemoteControl{
    public int volume;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
