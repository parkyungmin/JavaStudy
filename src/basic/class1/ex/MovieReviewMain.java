package basic.class1.ex;

public class MovieReviewMain {
  public static void main(String[] args) {

    MovieReview movie1 = new MovieReview(); //무비 객체 선언
    movie1.title = "인셉션";
    movie1.review = "인생은 무한 루프";

    MovieReview movie2 = new MovieReview(); //무비 객체 선언
    movie2.title = "어바웃 타임";
    movie2.review = "인생 시간 영화!";


    //출력 방법1 - 반복문 사용
    MovieReview[] movies = {movie1, movie2}; //!! movie 객체가 담고 있는 참조갑을 저장.

    for(int i=0; i<movies.length; i++) {
      System.out.println("영화 제목: " + movies[i].title + ", 리뷰: " + movies[i].review);
    }

    //출력 방법2 -for문 리팩토링
    for(int i=0; i<movies.length; i++) {
      MovieReview m = movies[i]; //값을 담을 객체 생성
      System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review); //조금 더 간단하게 생성 가능
    }

    //출력 방법3 - 향상된 for문
    for(MovieReview m : movies) { //movies가 갖고 있는 값만큼 배열을 돌려주면서 MovieReview m = movies[i];의 역할을 한다.
      System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review); //조금 더 간단하게 생성 가능
    }

    //영화 리뷰 정보 출력
    System.out.println("영화 제목: " + movie1.title + ", 리뷰: " + movie1.review);
    System.out.println("영화 제목: " + movie2.title + ", 리뷰: " + movie2.review);
  }
}
