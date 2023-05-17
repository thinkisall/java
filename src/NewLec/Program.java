package NewLec;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Exam kors = new Exam();
        boolean keepLoop = true;
        int menu;

        while(keepLoop)

        {
            menu = showMenu();

            switch(menu)
            {
                case 1:
               inputGrade(kors);
                    break;
                case 2:
                outputGrade(kors);
                    break;
                case 3:
                keepLoop = exit();
                    break;

                default:
                    System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
            }
        }

    }
    private static int showMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("┌──────────────────┐");
        System.out.println("│     메인 메뉴      │");
        System.out.println("└──────────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.println("\t선택> ");
        int menu = scan.nextInt();
        return menu;
    }
    private static void inputGrade(Exam kors) {
        Scanner scan = new Scanner(System.in);

        System.out.println("┌──────────────────┐");
        System.out.println("│     성적 입력      │");
        System.out.println("└──────────────────┘");
        System.out.println();

        int kor, eng, math;
        do
        {
            System.out.print("국어 : ");
            kor = scan.nextInt();

            if(kor< 0 || 100 < kor)
            {
                System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        }while(kor<0 || 100 < kor);
        kors.setKor(kor);

        do
        {
            System.out.print("영어 : ");
            eng = scan.nextInt();

            if(eng< 0 || 100 < eng)
            {
                System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        }while(eng<0 || 100 < eng);
        kors.setEng(eng);

        do
        {
            System.out.print("수학 : ");
            math = scan.nextInt();

            if(math< 0 || 100 < math)
            {
                System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        }while(math<0 || 100 < math);
        kors.setMath(math);

        System.out.println("────────────────────────");
    }


    private static void outputGrade(Exam kors){
        int total = kors.getKor() + kors.getEng() + kors.getMath();
        float avg = (float)total / 3;

        System.out.println("┌──────────────────┐");
        System.out.println("│     성적 출력      │");
        System.out.println("└──────────────────┘");
        System.out.println();

        System.out.printf("국어  : %3d\n", kors.getKor());
        System.out.printf("영어  : %3d\n", kors.getEng());
        System.out.printf("수학  : %3d\n", kors.getMath());
        System.out.printf("총점 : %3d\n", total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.println("────────────────────────");
    }

    private static boolean exit(){
        System.out.println("Bye~~");

       return false;
    }

}