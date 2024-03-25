import java.util.Arrays;
import java.util.Scanner;

public class Bai8
{
    //Bài 8: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số phần
    //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
    //phần tử có chỉ số updateIndex
    public static void main(String[] args)
    {
        //Nhap so phan tu cua mang n
        // Khai bao mang 1 chieu
        int[] arrNum = new int[]{1,2,3,4,5,6,9,6};
        //Nhap gia tri cho tung phan tu trong mang
        int updateValue = 6;
        //Nhap gia tri Can update va vi tri index cua no
        int updateIndex = 6;
        //Tao mot mang moi
        int[] newNum = new int[arrNum.length];
        //Duyet vong for gan gia tri cua vi tri indexUpdate vao gia tri moi
        for (int i = 0; i < arrNum.length; i++)
        {
           if (i==updateIndex)
           {
               newNum[i]=updateIndex;
               continue;
           }
           newNum[i]=arrNum[i];
        }
        //Duyet vong for in ra mang
        System.out.println(Arrays.toString(newNum));
    }
}

