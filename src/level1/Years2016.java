package level1;

public class Years2016 {

    public String solution(int a, int b) {
        // 1) 각 달의 일 수 (2016년은 윤년이므로 2월은 29일)
        int[] daysInMonth = {
                31, // 1월
                29, // 2월 (윤년)
                31, // 3월
                30, // 4월
                31, // 5월
                30, // 6월
                31, // 7월
                31, // 8월
                30, // 9월
                31, // 10월
                30, // 11월
                31  // 12월
        };

        // 2) 요일 이름 배열: 인덱스 0=SUN, …, 5=FRI, 6=SAT
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        // 3) 1월 1일부터 (a월 b일) 전날까지 지난 일 수를 계산
        int totalDays = 0;
        // 3-1) 1월부터 (a-1)월까지의 누적 일 수
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        // 3-2) a월의 (b-1)일 만큼 더하기 (1일은 0일 경과로 본다)
        totalDays += b - 1;

        // 4) 기준 요일 인덱스: 2016년 1월 1일은 금요일(FRI)이므로 인덱스 5
        int startIdx = 5;
        // 5) 기준 인덱스에 경과 일 수를 더한 뒤 7로 나눈 나머지 → 해당 요일 인덱스
        int weekDayIdx = (startIdx + totalDays) % 7;

        // 6) 계산된 인덱스에 대응하는 문자열 반환
        return week[weekDayIdx];
    }
}
