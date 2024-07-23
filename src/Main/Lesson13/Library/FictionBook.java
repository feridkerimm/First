package Main.Lesson13.Library;

    class FictionBook extends Book{
        protected String genre;

        public FictionBook(String title, String author, String ISBN, String genre) {
            super(title, author, ISBN);
            this.genre = genre;
        }

        @Override
        public String toString() {
            return super.toString() + " Genre: " +genre;
        }
    }


