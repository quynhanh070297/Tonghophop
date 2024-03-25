import java.util.Arrays;
import java.util.Scanner;

public class Bai1
{
    //Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
    //tử từ bàn phím và in ra giá trị các phần tử của mảng


    public static void main(String[] args)
    {

        //B1: Khơi tạo mảng có 5 phần tử
        Scanner scanner = new Scanner(System.in);
        int[] arrNum = new int[5];
        int i;
        //B2: Duyệt qua mảng và cho nhập giá trị
        for ( i = 0; i < arrNum.length; i++)
        {
            System.out.println("Moi ban nhap vao phan tu thu" + i);
            int x = Integer.parseInt(scanner.nextLine());
            arrNum[i] = x;
        }
        //B3: In ra mảng
        System.out.println(Arrays.toString(arrNum));





    }





}
