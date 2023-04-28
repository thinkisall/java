import java.util.Arrays;

public class Jvm extends Jdk{
    
    static String jvmDefinition = "자바 프로그램을 실행하기 위한 가상머신";
    static String classLoader;
    static String RuntimeDataArea;
    static String executionEngine;
    static String garbageCollector;

    public static String[] runClassLoader(){
        // 컴파일러가 소스코드를 바이트코드로 바꾸고나면 그 클래스파일을 처리하는 녀석
        classLoader = "클래스 파일을 메모리로 로딩하는 역할";

        boolean classLoading = true;

        if (classLoading) {
            return new String[] {
                "로딩 : 클래스 파일을 읽어와 메모리에 로딩",
                "링크 : 메모리에 로딩된 클래스 파일에 대한 검증, 준비, 해석 수행",
                "초기화 : 클래스 변수를 초기화하고, static 블록 실행"
            };
        } else {
            return new String[] { "실행" };
        }
        
    }

    public static String[] runRuntimeDataArea() {
        RuntimeDataArea = "JVM 내에서 자바 애플리케이션이 실행되는 동안 데이터가 저장되는 메모리영역";
    
        String[] 데이터영역 = {
            "method영역: 클래스 정보+클래스 변수(static)등이 저장",
            "heap영역: new연산자로 생성된 객체와 배열이 저장되는 곳",
            "stack영역: 메소드 호출시 생성되는 지역 변수와 연산중 발생하는 임시데이터등이 저장되는 곳",
            "ProgramCounter: 현재 실행 중인 JVM의 명령의 주소를 저장하는 영역",
            "네이티브 메소드 스택: 자바코드에서 네이티브 메소드를 호출할 때 사용되는 영역"
        };
    
        return 데이터영역;
    }

    public static void runExeEngine(String sourceCode){
        executionEngine = "바이트코드를 실행하는 역할 인터프리터방식+JIT컴파일러방식으로 구현";
        String[] JIT = 
        {"바이트코드를 기계어로 바꿔주는 역할", 
        "프로그램이 처음시작되고 한번에 컴파일을 다해버리는게 = AOT(ahead of time) 방식",
        "하지만 JIT는 자주사용되는 코드만 기계어로 컴파일 이후 바로 실행 => 인터프리터보다 빠르다."};

        System.out.println(sourceCode+"가 들어와서 컴파일된 이후에 바이트코드로 컴파일된 후"+Arrays.toString(JIT));
        
    }

    public static void runGarbageCollector(){
        String[] 설명 = 
            {"자바에서 메모리는 자동으로 관리된다.",
            "단, 더 이상 필요하지 않은 객체는 가비지컬렉터가 회수한다",
            "메모리 영역 중 heap 영역에 존재하는 객체 중 안쓰는 녀석들 회수",
            "회수 = null"
            };
        String[] 동작방식 = 
            {"첫번째 = Mark단계 : 참조되는 객체를 표시, 표시된(사용되는) 객체만 유지",
            "두번째 = Sweep : 표시되지 않은 객체들(쓰지않는) 제거",
            "세번째 = Compact : 객체가 제거되면서 빈 공간을 한 곳으로 모아 Heap 영역의 남은 공간을 최대한 확보"
            };
        String[] 주의사항 = 
            {"너무 자주 Gc가 돌게되면 프로그램에 성능영향을 끼친다", 
            "메모리가 부족하면 outOfMemoryError가 발생하므로 메모리관리하자"};

        System.out.println("설명 = "+Arrays.toString(설명));
        System.out.println("동작방식 = "+Arrays.toString(동작방식));
        System.out.println("주의사항 = "+Arrays.toString(주의사항));
    }
    
    public static void main(String[] args) {
        // 자바 클래스 로더
        String[] result = runClassLoader();
        for(String item : result){
            System.out.println(item);
        }
        // 자바런타임데이터영역
        String[] data = runRuntimeDataArea();
        for(String item : data){
            System.out.println(item);
        }

        // 자바 실행엔진
        runExeEngine(sourceCode);
        runGarbageCollector();
    }
}
