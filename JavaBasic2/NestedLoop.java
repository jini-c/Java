package ch3;

public class NestedLoop {

public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {         // 단
            for(int j = 1; j < 10; j++) {     // 곱해지는 수
                System.out.print(i + "*" + j + "=" + (i * j));
                System.out.print('\t');       // 탭으로 정렬
            }
            System.out.println();             // 한 줄 출력 후 줄바꿈
        }
    }
}
