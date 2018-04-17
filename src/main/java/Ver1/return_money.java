package Ver1;

/**
 * Created by Mr.Tu on 11/7/2016.
 */
public class return_money {
    private static return_money odd=new return_money();
    dispense_item total = dispense_item.getTrahang();

    insert_money money= insert_money.getAddmoney();

    private int ballance=0;

    private return_money(){}
    public void remoney(boolean x){
            if(x) {
                int temp = total.getTotalpay();
                money.setMoney(temp);
                this.ballance = money.getMoney();
            }
            else this.ballance = money.getMoney();
    }
    public void Ballance(boolean x){
        if(x){
            System.out.println("Ballance " + ballance);
        }
        else System.out.println("Giao dich khong thanh cong");
    }
    public static return_money getOdd(){
        return odd;
    }
}
