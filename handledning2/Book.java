public class Book {
    private String title;
    private String author;
    private String releaseDate;
    private int upvotes;
    private int downvotes;

    public Book(String title, String author, String releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String displayInfo() {
        String rating = "Bad";
        if (isGood()) {
            rating = "Good";
        }

        return String.format(
                "Title: %s%nAuthor: %s%nRelease date: %s%nUpvotes: %d%nDownvotes: %d%nRating: %s%n",
                title,
                author, releaseDate, upvotes, downvotes, rating);
    }

    public void upvote(int amount) {
        upvotes += amount;
    }

    public void downvote(int amount) {
        downvotes += amount;
    }

    public boolean isGood() {
        return upvotes > downvotes;
    }
}