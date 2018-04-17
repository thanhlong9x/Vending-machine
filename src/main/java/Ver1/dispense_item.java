package Ver1;

/**
 * Created by Mr.Tu on 11/7/2016.
 */
public class dispense_item {
    private static dispense_item trahang= new dispense_item();
    private dispense_item(){}
    select_item select =select_item.getitem();
    TextFileReader read =TextFileReader.getReader();
    insert_money money = insert_money.getAddmoney();

    private int totalpay=0;

    public boolean dispense() {
        //for (int i = 0; i < read.count; i++) {
            String temp = select.getItem();
            boolean flag=false;
            boolean rr = read.findItem(temp);
            if (rr) {

                if ( read.findNumber(temp)!=0 && money.getMoney() >= read.findCost(temp) ) {
                    totalpay=read.findCost(temp);
                    read.setNumber(temp);
                    System.out.println("Hang ve hang ve, nhin xuong duoi");
                    flag=true;
                }
                else if( read.findNumber(temp)!=0 && money.getMoney()<read.findCost(temp) ){
                    System.out.println("vui long nap them tien de thuc hien giao dich");

                }
            }
            else if(!rr) {
                System.out.println("Khong tim thay hang");
            }
            return flag;
        //}
    }
    public int getTotalpay(){
        return totalpay;
    }
    public static dispense_item getTrahang(){
        return trahang;
    }
}
