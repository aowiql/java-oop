package ch06.sec11.exam01;

public class Korean {
    // 인스턴스 fianl 필드 선언
    final String nation = "KOREA";
    final String ssn;

    // 인스턴스 필드
    String name;

    // 생성자

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
