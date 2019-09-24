package assembly;


/**
 *  상속보단 조립
 *
 *  상속과 재사용
 *      - 상위 클래스의 기능을 재사용, 확장하는 방법으로 활요하나...
 *
 *  상속을 통한 기능 재사용시 발생할 수 있는 단점
 *      - 상위 클래스 변경 어려움
 *          : 상위 클래스를 변경하게 되면 그 모든 하위 클래스들에 영향이 끼침
 *          : 어떤 하위 클래스가 추가 될 지 모름
 *          : 하위 클래스에 대한 캡슐화가 어려워짐
 *      - 클래스 증가
 *          : 상위 클래스마다의 각 기능을 사용하고자 하는 하위 클래스가 있을 때 어떤 클래스 상속 받아야 할 지 모름
 *      - 상속 오용
 *          : 하위 클래스의 기능을 제대로 이해하지 못하고 하위 클래스에서 불필요한 상위 클래스의 메소드를 사용
 *
 *  상속의 단점 해결 방법 -> 조립
 *      - 조립(Composition)
 *          : 여러 객체를 묶어서 더 복잡한 기능을 제공
 *          : 보통 필드로 다른 객체를 참조하는 방식으로 조립 또는 객체를 필요 시점에 생성 / 구함
 *      - 상속하기에 앞서 조립으로 풀 수 없는지 검토
 *      - 진짜 하위 타입인 경우에만 상속 사용
 *
 */
public class AssemblyRatherThenInheritance {
}
