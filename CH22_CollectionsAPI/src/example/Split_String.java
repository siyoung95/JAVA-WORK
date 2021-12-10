package example;

public class Split_String {
	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "(CNN)As./-- the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- !even./ beyond the growing data about waning vaccine immunity.";
		String text2 = "오늘(9일) 엠브레인퍼블릭·케이스탯리서치·코리아리서치·한국리서치 4개 여론조사기관은 지난 6일부터 8일까지 3일간 전국 만 18세 이상 1004명을 대상으로 진행한 여론조사 결과를 발표했습니다.\r\n"
				+ "조사에 따르면 대선 후보 지지도 조사에서 이재명 후보는 전주보다 5%포인트 오른 38%를 기록했습니다. 윤석열 후보는 2%포인트 오른 36%로 나타났습니다. 두 후보 간 격차는 2%로 오차범위 내입니다.";
		//String[] words = text1.split("[^a-zA-Z]+"); //정규표현식 영문철자를 제외한 특수문자 스페이스 점 슬래시같은 것들을 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); //소문자로 변환해서 출력
		}
	}

}
