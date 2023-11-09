public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book() {

    }

    public Book(String title,String author, int numberOfPages) {
        if(numberOfPages<0) {
            this.numberOfPages=1;
        }
        else {
            this.numberOfPages=numberOfPages;
        }
        if(title==null||title=="") {
            this.title="";
        } else {
            this.title= title;
        }
         if(author==null||author=="") {
            this.author="";
        } else {
             this.author=author;
         }

    }
    @Override
    public String toString() {
        return "Book: "+this.title+ " by "
                +this.author+", Pages: "+this.numberOfPages+".";
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Book temp) {
            if(this.author.equals(temp.author)
            && this.title.equals(temp.title)
            && this.numberOfPages==temp.numberOfPages) {
                return true;
            }
            return false;
        }
        else {
            return false;
        }
    }
}
