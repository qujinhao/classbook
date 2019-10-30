package bookmanage1;
/**
*Description:课本习题6.三.1
*Author:qjh
*Date:2019-10-30
*/
public class Zazhi1 extends Book1 {
    private String zdate;
    public Zazhi1(int pages,int price,String zdate){
        super(pages,price);
        this.pages = pages;
        this.price = price;
        this.zdate = zdate;
    }
    public void Info(){
        System.out.println("这是一本杂志，"+pages+"页，"+price+"元,"+"出版日期"+zdate );
    }
}
