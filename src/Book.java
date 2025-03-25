public class Book {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount){
        if (title == null || title.trim().length() == 0){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (pageCount <= 0){
            throw new IllegalArgumentException("Page count must be positive");
        }
        this.pageCount = pageCount;
        this.title = title;
    }
    //getter های مناسب
    public String getTitle(){
        return title;
    }

    public int getPageCount(){
        return pageCount;
    }

    //چاپ اسم کتاب و تعداد صفحات
    @Override
    public String toString(){
        return title + "(" + pageCount + ")" ;
    }

}
