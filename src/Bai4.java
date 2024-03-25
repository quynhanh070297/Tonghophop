import java.util.Arrays;
import java.util.Scanner;

public class Bai4
{
    //Bài 4: Nhập số phần tử và giá trị các phần tử của mảng một chiều số
    //nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
    public static void main(String[] args)
    {
        //B1: Nhập số phần tử trong mảng từ bàn phím
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Moi ban nhap so phan tu trong mang");
        int n = Integer.parseInt(scanner.nextLine());
        //B2: Tạo mảng 1 chiều
        int [] arrNum = new int[n];
        //B3: Tạo biến Max bằng index0
        int max = arrNum[0];
        //Duyệt qua for tìm phần tử lớn nhất
        for (int i = 0; i < arrNum.length; i++)
        {
            System.out.println("Moi ban nhap phan tu thu " + i);
            int num = Integer.parseInt(scanner.nextLine());
            arrNum[i] = num;
            // Tim phan tu lon nhat trong mang
            if(arrNum[i]>max){
                max = arrNum [i];
            }
            // In ra giá trị lớn nhất
            System.out.println(max);
         
        }
    }
}
