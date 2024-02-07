package KitapSiralayici;

public class Book  {

    
    
    
    private String bookName;
    private String releaseDate;
    private String authorName;
    private int totalPage;

    public Book(String bookName, String releaseDate, String authorName, int totalPage ){
        
        this.authorName = authorName;
        this.bookName = bookName;
        this.releaseDate = releaseDate;
        this.totalPage = totalPage;
    }

    public int getTotalPage(){
        return totalPage;
    }

    public void setTotalPage(int totalPage){
        this.totalPage = totalPage;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
}
