import java.util.Scanner;
/*
 * 구구단-2739 (브3)
 * 문제 :
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 *
 * 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */
public class No2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(1<=N&&N<=9){
            for(int i=1; i<10; i++){
                System.out.println(N+" * "+i+" = "+N*i);
            }
        }
    }
}
/*
* 후기 :
* N은 1보다 크거나 같고, 9보다 작거나 같다는 if문의 조건식을 넣어주고,
* N값을 곱해줄 i를 1부터 9까지 for문으로 반복해서 해결하였다.
*/
