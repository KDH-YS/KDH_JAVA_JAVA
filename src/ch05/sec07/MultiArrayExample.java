package ch05.sec07;

public class MultiArrayExample {

    public static void main(String[] args) {
        
        String[] scoreArray1 = {"철수", "영희", "말자"};
   
        String[] subject = {"국어", "영어", "수학"};
        
        int[][][] scoreArray3 = {
            {
                {90, 80, 70},
                {80, 80, 80},
                {100, 60, 80}
            },
            {
                {40, 50, 100},
                {50, 50, 100},
                {60, 50, 100}
            },
            {
                {100, 100, 30},
                {100, 100, 10},
                {100, 100, 20}
            }
        };

        for (int i = 0; i < 3; i++) {            
            System.out.printf("%-3s", scoreArray1[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-6s", subject[j]);
            }
            System.out.println(); 

            for (int j = 0; j < 3; j++) {
                System.out.printf("%d차: ", j + 1);
                for (int k = 0; k < 3; k++) {
                    System.out.printf("%-6d", scoreArray3[i][j][k]);
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}
