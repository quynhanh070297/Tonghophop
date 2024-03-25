import java.util.Scanner;

public class Bai5
{
    //Bài 5: Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
    //nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
    //phần tử có giá trị chẵn và tính tổng các phần tử đó
    public static void main(String[] args)
    {

        // Nhập vào số dòng và cột
        System.out.println("Nhập số dòng");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số cột ");
        int col = new Scanner(System.in).nextInt();
        //Khai báo mảng 2 chiều kiểu dữ liệu Float
        float[][] arr = new float[row][col];
        //Duyệt vòng for để thêm giá trị cho chúng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("mời bạn nhập vào phần tử hàng thứ %d cột thứ %d \n",i+1,j+1);
                arr[i][j]= Float.parseFloat(new Scanner(System.in).nextLine());
            }
        }
      // Tìm phần tử chia hết cho 2 và tổng của chúng
        float sum=0;
        System.out.println("Các phần tử chia hết cho 2 là");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+"__");
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("\n tổng là\n "+sum);
    }
}
