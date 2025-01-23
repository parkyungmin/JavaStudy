package basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //this.을 생략해도 됨.
    }
}
