package bookmanage1;
/**
*Description:课本习题6.三.1
*Author:qjh
*Date:2019-10-30
*/
public class Book1 {
    public int pages;
    public int price;
    public Book1(int pages,int price){
        this.pages=pages;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
