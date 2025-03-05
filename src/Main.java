// 지금부터 클래스를 정의
// 클래스를 정의할 때 첫글자는 대문자를 사용 for 가독성
class Car {
    // Data + function
    // Data -> Member variable
    String name;

    //function -> Member method
    void prtName() {
        System.out.println(name+" 입니다.");
    }
}

// 실행 코드
public class Main {
    public static void main(String[] args) {
        // new 연산자 두가지 장점
        // 1. Heap 공간에 저장된다. ( 생명주기가 길고 전역적으로 접근 가능 )
        // 2. 프로그램이 동작하면서 new 연산자를 사용했을 때 메모리공간을 차지한다.


        int bar[] = new int[5];

        Car car1 = new Car();
        // Car car1 -> 변수를 선언
        // new Car() -> Car 클래스의 인스턴스를 생성 (객체)
        Car car2 = new Car();
        car2.name = "BMW";
        car2.prtName();
        // dot 연산자 뒤에는 맴버를 사용
        // 자바는 오브젝트 클래스를 사용가능하다
    }
}