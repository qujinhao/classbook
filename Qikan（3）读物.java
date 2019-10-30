package bookmanage1;
/**
*Description:课本习题6.三.1
*Author:qjh
*Date:2019-10-30
*/
public class Qikan extends Book1 {
    private String qdate;
    public Qikan(int pages,int price,String qdate ){
        super(pages,price);
        this.qdate = qdate;
    }
    public void Info(){
        System.out.println("这是一本期刊，"+pages+"页，"+price+"元,"+"出版日期"+qdate);
    }
}
