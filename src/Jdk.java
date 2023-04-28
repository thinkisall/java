public class Jdk {
    
    static String javaCompiler;
    static String jre;
    static String jvm;
    static String 자바API;
    static String 디버깅;
    static String 프로파일링;
    
    static String sourceCode = "sourceCode";

    public static String runJavaCompiler(String sourceCode){

        javaCompiler = "소스코드를 바이트코드로 바꿔주는 녀석";
        // 소스코드를 바이트코드로 바꾼다 = 컴파일러
        // 바이트코드를 기계어로 바꾼다 그다음 실행시킨다 = JVM 
        return sourceCode.replaceAll("sourceCode", "byteCode");

    }

    public static String runJRE(){
        jre = "자바런타임실행환경";
        return jre;
    }

    public static String[] run자바API(){
        String 라이브러리 = "자바에서 사용하는 다양한 라이브러리";
        String 클래스 = "자바에서 사용하는 다양한 클래스들";

        return new String[]{라이브러리, 클래스};
    }

    public static String run디버깅(){
        디버깅 = "디버깅에 필요한 도구 제공";
        return  디버깅;
    }

    public static String run프로파일링(){
        프로파일링 = "자바 프로그램의 성능 분석에 필요한 도구들을 제공";
        return 프로파일링;
    }


}
