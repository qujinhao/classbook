package bookmanage1;
/**
*Description:课本习题6.三.1
*Author:qjh
*Date:2019-10-30
*/
public class Keben extends Book1 {
    private String duixiang;
    public Keben(int pages,int price,String duixiang){
        super(pages,price);
        this.duixiang =duixiang;
    }
    public void Info(){
        System.out.println("这是一本课本，"+pages+"页，"+price+"元,"+"使用者群体:"+duixiang);
    }
}
