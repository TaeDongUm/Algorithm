package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class backjoon_1992 {
	static char[][] map; // 전체 배열
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력받기
		int size = Integer.parseInt(br.readLine()); // size 입력 받기
		map = new char[size][size]; // 배열 선언
		for(int i=0;i<size;i++) { // map에 char 형태로 값 넣기
			map[i] = br.readLine().toCharArray();
		}
		if(size==1) { // 크기가 1일 때는 쪼갤 수 없으므로
			System.out.println("("+map[0][0]+")");
			System.exit(0);
		}
		press(0,0,size); // 쪼개기 메서드
		System.out.println(sb);
	}
	public static boolean check(int x, int y, int size){ // x,y 위치의 값이 map을 탐방하면서 값이 다르면
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(map[i][j] != map[x][y]) {
					return false; // false 리턴
				}
			}
		}
		return true; // 이중 for문을 돌리고도 false 반환 안되면 true 반환
	}
	public static void press(int x, int y, int size) { //쪼개면서 살펴보기
		if(check(x,y,size)) { // 처음 들어온 값이 사분면 내에서 모두 값이 같은지 판단
			sb.append(map[x][y]);
			return;
		}
		size = size/2; // 사분면에서 값이 모두 같지 않다면 size 절반으로 줄이기
		sb.append("("); // 괄호 열기
		press(x,y,size); // 1사분면
		press(x,y+size,size); // 2사분면
		press(x+size,y,size); // 3사분면
		press(x+size,y+size,size); // 4사분면
		sb.append(")");
	}

}

