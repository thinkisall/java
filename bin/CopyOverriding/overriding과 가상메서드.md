메서드 호출에 대해

- 메서드가 있다고 가정하면 메서드 안에는 변수들, 명령어들이 존재한다.
- 메서드의 이름은 나중에 컴파일과정에서 주소로 변환된다.
- 프로그램이 실행되면 (=메모리에 올라가면) Code영역 , data영역으로 나뉜다고했다.
- Code영역 = 로직들(메서드)이 존재, data영역 = 상수나 static
- Code영역에서 기능들은 인스턴스들마다 다르지않다. 다른 것은 data영역의 변수일뿐
- 변수의 영역은 따로 잡힌다. 지역변수 = stack 인스턴스 = heap
- 여기까지 정리 : 기능은 변하지않아 변수만 변할뿐.

---

여기서부터 가상메서드

- 자바는 모두 가상메서드.
- 컴파일이되고 실행되는 단계에서 모든 메서드는 주소를 갖고 그 주소에 실행로직(메서드영역)이 있는데
- 참조하고있는 메서드 영역이 overriding이 되는 경우 overriding된 주소를 가리킴.

메서드는 JVM에 Method Area로

클래스 로더(Class Loader)는 자바 가상 머신(JVM) 내에서 클래스 파일을 동적으로 로딩하는 역할을 담당하는 컴포넌트입니다.
자바 프로그램이 실행될 때, 해당 클래스가 필요할 때 클래스 로더를 통해 클래스 파일을 로딩하고, JVM의 메모리 영역 중 하나인 Method Area에 클래스 정보를 저장합니다.
클래스 로더는 필요한 클래스를 로딩할 때 계층 구조를 따르며, 부모 클래스 로더에서 클래스를 찾을 수 없을 때 자신이 로딩을 시도합니다. 이러한 방식으로 클래스 로더는 클래스의 중복 로딩을 방지하고, 자바의 동적인 특성을 지원합니다.
