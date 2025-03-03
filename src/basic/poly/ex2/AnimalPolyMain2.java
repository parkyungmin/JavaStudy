package basic.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        
        Animal[] animalArr = {dog, cat, caw}; //다형적 참조
//        Animal[] animalArr2 = new Animal[]{dog, cat, caw}; //위와 동일한 코드

        //아래의 의미와 같음..
//        Animal index1 = dog;
//        Animal index2 = cat;
//        Animal index3 = caw;
        
        //동물이 추가돼도 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }


    }
}
