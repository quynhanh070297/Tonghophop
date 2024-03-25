import java.util.Scanner;

public class Bai2
{
    //Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
    //trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
    //trung bình cộng của các phần tử trong mảng
    public static void main(String[] args)
    {
        //B1: Nhập số phần tuqwr trong mảng từ bàn phím
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Moi ban nhap so phan tu trong mang");
        int n = Integer.parseInt(scanner.nextLine());
        //B2: Khai báo mảng
        int [] arrNum = new int[n];
        //B3: Tạo biến tổng và duyệt qua for để tính tổng
        int sum = 0;
        for (int i = 0; i < arrNum.length; i++)
        {
            System.out.println("Moi ban nhap phan tu thu " + i);
            int num = Integer.parseInt(scanner.nextLine());
            arrNum[i] = num;
            sum += num;
        }
        //B4: In ra Trung bình cộng
        System.out.println("Trung binh cong la :" + sum/(arrNum.length));




    }
}
