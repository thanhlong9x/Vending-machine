package Ver1;

import java.util.Scanner;

/**
 * Created by Mr.Tu on 11/7/2016.
 */
public class test {

    public static void main(String args[]){
        TextFileReader read=TextFileReader.getReader();
        insert_money money= insert_money.getAddmoney();
        return_money ballance=return_money.getOdd();
        dispense_item suport=dispense_item.getTrahang();
        select_item buy =select_item.getitem();
        boolean flag=false;
        Scanner in=new Scanner(System.in);
        read.ReadTextFile();
        do{
            System.out.println("select 1 nap tien\nselect 2 chon san pham\nselect 3 nhan tien du\nselect 4 exit");
            int x=in.nextInt();

            switch (x){
                case 1:
                    money.inputmoney();
                    break;
                case 2:
                    read.PrintFile();
                    buy.select();
                    flag=suport.dispense();
                    ballance.remoney(flag);
                    if(!flag){
                        System.out.println("Giao dich khong thanh cong, vui long thu lai");
                    }
                    break;
                case 3:
                    ballance.Ballance(true);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            if(x==4){break;}
        }while (true);
    }
}
