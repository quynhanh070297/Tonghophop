import java.util.Scanner;

public class Bai3
{
    //Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
    //nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
    //mảng theo ma trận
    public static void main(String[] args)
    {
        //B1: Nhập từ bàn phím số hàng và số cột
        int row, col ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so dong");
        row= Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap vao  so cot");
        col= Integer.parseInt(scanner.nextLine());
        //B2: Khai báo mảng 2 chiêu
        int [][] arrNum = new int[row][col];
        //B3: Duyệt qua mảng 2 chiều bằng 2 vòng for
        for(int i=0 ; i < row ; i++){
            for(int j=0 ; j < col ; j++){
                System.out.println("Moi ban nhap vao phan tu hang" +i + "cot" + j );
                int num = scanner.nextInt();
                arrNum[i][j]= num;
            }
        }
        //In ra mảng 2 chiều theo ma trận
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arrNum[i][j]);
            }
            System.out.println();
        }

    }
}
