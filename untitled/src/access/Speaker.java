package access;

public class Speaker {

    private int volume ;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할수없습니다. 최대음량입니다");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void VolumeDowm() {
        if (volume <= 0) {
            System.out.println("볼륨이 더이상 내려갈수없습니다");
        }else {
            volume -= 10;
            System.out.println("VolumeDowm 호출");
        }
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }

}
