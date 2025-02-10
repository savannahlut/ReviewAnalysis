import java.util.ArrayList;

public class ReviewAnalysis {

    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review a, Review b, Review c, Review d, Review e)
    { 
        allReviews = new Review[]{a, b, c, d, e};
    }

    /** Returns a double representing the average rating of all the Review objects to be
    * analyzed, as described in part (a)
    * Precondition: allReviews contains at least one Review.
    * No element of allReviews is null. */
    public double getAverageRating()
    {
        double y = 0; 
        int num = 0;
        for(Review x : allReviews){
            y += x.getRating();
            num++;
        }
        return y / num;
    }

    /** Returns an ArrayList of String objects containing formatted versions of
    * selected user comments, as described in part (b)
    * Precondition: allReviews contains at least one Review.
    * No element of allReviews is null.
    * Postcondition: allReviews is unchanged. */
    public ArrayList<String> collectComments()
    {
        ArrayList<String> newComments = new ArrayList<String>();
        for(int x = 0; x < allReviews.length; x++){
            for(int i = 0; i < allReviews[x].getComment().length(); i++){
                if(allReviews[x].getComment().charAt(i) == '!'){
                    newComments.add(x + "-" + allReviews[x].getComment());
                }
            }
        }
        return newComments;
    }
}