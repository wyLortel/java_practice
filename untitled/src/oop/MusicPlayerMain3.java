package oop;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);

        volumeDown(data);

        showStatus(data);


        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        data.voliume++;
        System.out.println("음악 플레이어 볼륨 : " + data.voliume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.voliume--;
        System.out.println("음악 플레이어 볼륨 : " + data.voliume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태확인");

        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.voliume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
