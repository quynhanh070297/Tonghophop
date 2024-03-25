import java.util.Scanner;

public class Bai6
{
    //Bài 6: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập vào một giá trị (findNumber), in ra
    //chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber
    public static void main(String[] args)
    {
        //Nhap so phan tu cua mang
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        //Khai báo Mảng
        int[] arr = new int[num];
        //Nhập giá trị phần tử qua vòng for
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mời bạn nhạp vào phầnt tử thứ "+(i+1));
            arr[i]= new Scanner(System.in).nextInt();
        }
        //Nhập số cần tìm
        System.out.println("Mời bạn nhập vào số muốn check");
        //Khai báo biến tổng
        int sum = 0;
        int findNumber = new Scanner(System.in).nextInt();
        System.out.print("chỉ số của phần tử là : ");
        //Duyệt mảng
        for (int i = 0; i < arr.length; i++) {
            // Kiểm tra điều kiện
            //In ra chỉ số
            if (findNumber==arr[i]){
                System.out.print(i +" và ");
                sum+=arr[i];
            }
        }
        // In Sum ra
        System.out.println("Tổng là :"+sum
        );
    }
}
