import java.util.Arrays;
import java.util.Scanner;

public class Bai7
{
    // Bài 7: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    // tử của mảng 1 chiều số nguyên. Nhập giá trị (addValue) và chỉ số chèn
    // phần tử vào mảng (addIndex), thực hiện thêm chèn giá trị addValue và chỉ
    // số addIndex của mảng

    public static void main(String[] args)
    {
            // Nhập số Phần tử của mảng
            Scanner scanner = new Scanner(System.in) ;
            System.out.println("Moi ban nhap so phan tu trong mang");
            int n = Integer.parseInt(scanner.nextLine());

            //Tao mang voi n so nguyen
            int [] arrNum = new int[n];

            //Nhap gia vao mang thong qua for
            for (int i = 0; i < arrNum.length; i++)
             {
                 System.out.println("Moi ban nhap phan tu thu " + i);
                 int num = Integer.parseInt(scanner.nextLine());
                 arrNum[i]=num;
             }
            //Nhap gia tri can chen va vi tri Index
            System.out.println("Moi ban nhap gia tri can chen");
            int addValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap chi so chen phan tu vao mang");
             int addIndex = Integer.parseInt(scanner.nextLine());
             //Check xem vi tri muon them co nam trong mang khong
             while (addIndex<0||addIndex>arrNum.length){
                 System.out.println("Nhap sai moi nhap lai");
               addIndex = new Scanner(System.in).nextInt();
             }
             //Khoi tao mot mang moi
             int [] newArr = new int[n+1];
             for (int i = 0; i < arrNum.length; i++)
            {
                //neu i < vi tri can them gan cho bang nhau
            if (i<=addIndex)
            {
                newArr[i]=arrNum[i];
            }
            // Gan gia tri can them vao vi tri can them
            newArr[addIndex]= addValue;
            //Gan lai tu vi tri can them sang mang moi
            newArr[i+1] = arrNum[i];
            }
        System.out.println(Arrays.toString(newArr));
    }




}
