package oop;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        data.voliume++;
        System.out.println("음악 플레이어 볼륨 : " + data.voliume);

        data.voliume++;
        System.out.println("음악 플레이어 볼륨 : " + data.voliume);

        data.voliume--;
        System.out.println("음악 플레이어 볼륨 : " + data.voliume);

        System.out.println("음악 플레이어 상태확인");

        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.voliume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");

    }

}
