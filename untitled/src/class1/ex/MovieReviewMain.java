package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();

        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프";

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movies = {movieReview1, movieReview2};

        for (MovieReview m : movies) {
            System.out.println("영화제목: " + m.title + ", 리뷰: " + m.review);
        }

    }
}
