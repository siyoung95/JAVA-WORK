package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 뛰어진 단어들을 문자열로 str에 저장
	private String str = "birthday election opportunity measurement politics assignment president intention strategy equipment director analysis industry statement imagination disaster professor instruction leadership decision preparation entertainment marketing hospital medicine maintenance departure difficulty psychology contract definition audience property secretary category security satisfaction magazine explanation procedure platform presentation recommendation solution contribution inspector communication technology profession distribution";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 단어로 입력

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)
	private Random random = new Random();

	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)]; // 1. 랜덤으로 선택 수정
		characters = new char[selectWord.length()]; // 선택단어의 길이만큼 문자배열 크기로 생성
	}

	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		// characters[3] = 'X'; //테스트
		for (char c : characters) {
			sb.append(c == '\u0000' ? '_' : c); // 못맞추면 _ 맞춘건 c
			sb.append(' ');
		}
		//System.out.println(selectWord);// 정답출력 (테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for (int i = 0; i < selectWord.length(); i++) { //단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크해서 true or false로 리턴
		for (char c : characters) { // 단어 전체 철자 반복 검사
			if(c=='\u0000') {
				return false; //아직 맞춰야할 문자가 있음
			}
		}
		return true; //다 맞췄음
	}
}
