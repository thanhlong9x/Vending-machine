package Ver1;

import java.util.*;
/**
 * Created by Mr.Tu on 11/7/2016.
 */
public class select_item {
    private static select_item putitem=new select_item();
    private String item;//dạng int chon so
    private select_item(){}
    //chon hang
    public void select() {
                Scanner in = new Scanner(System.in);
        /*do {}while (true);
            System.out.println("vui long chon ten hang\nchon 1 de nhap ten\nchon 2 de exit");
            int y=in.nextInt();
            in.next();
            if(y==1) {*/
                System.out.println("vui long nhap ten hang");
                this.item = in.nextLine();

                //System.out.println("contining...");
            //}
    }
    public String getItem(){
        return item;
    } // tra ve item
    public static select_item getitem(){
        return putitem;
    }
}
