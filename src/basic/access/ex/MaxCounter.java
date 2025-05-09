package basic.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increament() {
        //검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //나가버림
        }

        //실행 로직
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
