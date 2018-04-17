package Ver1;

import java.util.Scanner;

/**
 * Created by Mr.Tu on 11/7/2016.
 */
class insert_money {
    private static insert_money addmoney=new insert_money();//
    private int money;
    private insert_money() {}//
    // nhập tiền vào
    public void inputmoney() {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("select 0: exit\nselect 1: input your money");
            int x = in.nextInt();
            switch (x) {
                case 0:
                    break;
                case 1:
                    do {
                        System.out.println("please, give me your money\nmultiples cost of moneys: 5 10 20");
                        int temp = in.nextInt();
                        if (temp == 5 || temp == 10 || temp == 20) {
                            this.money += temp;
                            System.out.println("tài khoan hien co "+money+" dong");
                            break;
                        }
                        else System.out.println("Are you foolish boy?");
                    } while (true);
                    break;
                default:
                    break;

            }
            if(x==0) break;
        }
    }
    public void setMoney(int x){
        this.money-=x;
    }// trừ tiền đã dùng
    public int getMoney(){
        return this.money;
    }// lấy dư
    public static insert_money getAddmoney(){
        return addmoney;
    }//
}
