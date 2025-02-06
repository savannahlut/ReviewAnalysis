public class Main{
    public static void main(String[] args)
    {
        Review a = new Review(4, "Good! Thx");
        Review b = new Review(3, "OK site");
        Review c = new Review(5, "Great!");
        Review d = new Review(2, "Poor! Bad.");
        Review e = new Review(3, "");

        ReviewAnalysis analysis1 = new ReviewAnalysis(a, b, c, d, e);
        System.out.println(analysis1.getAverageRating());

        System.out.println(analysis1.collectComments());
    }
}
