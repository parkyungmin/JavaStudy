package mid1.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // 다운캐스팅

        return id.equals(user.id); // 나의 id와 인수로 받은 id의 값이 같은지 확인
    }
*/
    //정확한 equals() 생성
    @Override
    public boolean equals(Object object) {
        if (this == object) return true; // 참조값 같으면 true 반환
        if (object == null || getClass() != object.getClass()) return false; // null이면 false 반환
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
