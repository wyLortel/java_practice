package charset;

import java.nio.charset.Charset;
import java.util.SortedMap;
import java.util.Set; // ✅ 추가해야 함

public class AvailableCharsetsMain {

    public static void main(String[] args) {
        // 이용 가능한 모든 charset (Java + OS 환경에서 지원되는 문자셋들)
        // SortedMap = Map + "키가 정렬된 상태 유지"
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();

        // 키(문자셋 이름)만 출력
        for (String charsetName : stringCharsetSortedMap.keySet()) {
            System.out.println(charsetName);
        }

        System.out.println("=====");

        // 특정 Charset 생성
        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset1 = " + charset1);

        // 별칭 조회
        Set<String> aliases = charset1.aliases();

        System.out.println("Aliases:");
        for (String alias : aliases) {
            System.out.println(" - " + alias);
        }
    }
}

