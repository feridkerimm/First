package Main.Lesson13.Library;

class NonFictionBook extends Book {
    protected String subject;

    public NonFictionBook(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+ " subject: " +subject;
    }
}
