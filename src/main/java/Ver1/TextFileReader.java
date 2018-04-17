package Ver1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Mr.Tu on 11/7/2016.
 */
public class TextFileReader {
    private String Item[];
    private int Cost[];
    private int soluong[];
    private int count,j;
    private static TextFileReader input=new TextFileReader();
    private TextFileReader(){
        Item=new String[100];
        Cost=new int[100];
        soluong=new int[100];
        count=1;
        j=0;
    }

    public void ReadTextFile (){

        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("C:\\Users\\Mr.Tu\\VENDING MACHINE\\src\\main\\java\\Ver1\\itemList_3.txt");
            FileReader fr = new FileReader(f);

            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            line = br.readLine();

            while ((line = br.readLine()) != null){
                //System.out.println(line);
                String item[] = line.split(" "); //cat cac thong tin cua line bang dau phay

                Item[j]     = item[0];
                Cost[j]     =Integer.valueOf(item[1]);
                soluong[j]  =Integer.valueOf(item[2]);

                count++;
                j++;
            }

            //Bước 3: Đóng luồng
            fr.close();
            br.close();
        }
        catch (Exception ex) {
                System.out.println("Loi doc file: "+ex);
        }

    }

    public String print_element_Item(int i){
        return Item[i];
    }
    public int print_element_Cost(int i){
        return Cost[i];
    }
    public int print_element_Soluong(int i){
        return soluong[i];
    }
    public void PrintFile(){
        System.out.println("Menu\t\t\tCost\t\t\tNumber");
        for (int i=0;i<this.count-1;i++){
            String ite = print_element_Item(i);
            int    cos = print_element_Cost(i);
            int    sol = print_element_Soluong(i);
            if(ite.length()==8) {
                System.out.println(ite + "\t\t" + cos + "\t\t\t\t" + sol);
            }
            if (ite.length()==4){
                System.out.println(ite + "\t\t\t" + cos + "\t\t\t\t" + sol);
            }
            if(ite.length()==3){
                System.out.println(ite + "\t\t\t\t" + cos + "\t\t\t\t" + sol);
            }

        }
    }
    public boolean findItem(String item){
        boolean x = false;
        for (int i=0;i<this.count;i++){
            if (Item[i].equalsIgnoreCase(item)) {
                x = true;
                break;
            }
            else x = false;
        }
        return x;
    }
    public int findNumber(String item){
        int i;
        for( i=0; i<this.count; i++){
            if (item.equalsIgnoreCase(Item[i])) {
                break;
            }
        }
        return soluong[i];
    }
    public void setNumber(String item){
        for (int i = 0; i < this.count; i++) {
            if (item.equalsIgnoreCase(Item[i])==true) {
                soluong[i]--;
                //System.out.println(soluong[i]);
            }
        }
    }
    public int findCost(String item) {
        int i;
        for (i = 0; i < this.count; i++){
            if (item.equalsIgnoreCase(Item[i])) {
                break;
            }
        }
        return Cost[i];
    }
    public static TextFileReader getReader(){
        return input;
    }
}
