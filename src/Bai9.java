import java.util.Scanner;

public class Bai9
{
    //Bài 9: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
    //tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
    //và thực hiện xóa phần tử trong mảng theo deleteIndex

    public static void main(String[] args)
    {
        //Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int [] arayy = {1,3,4,5,7,9,19};
        //Bước 2: Nhập X là phần tử cần xoá
        System.out.println("Nhap phan tu muon xoa");
        Scanner scanner = new Scanner(System.in);
        //Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        //Giả sử vị trí này là: index_del
        int x = Integer.parseInt(scanner.nextLine());
        int indexDel = -1;
        //Bước 4: Thực hiện xoá phần tử X khỏi mảng
        for (int i = 0; i < arayy.length; i++)
        {
            if (x == arayy[i])
            {
                //Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
                for ( indexDel= i;indexDel < arayy.length-1 ; indexDel++)
                {
                    //- Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
                    arayy[indexDel] = arayy[indexDel+1];
                }
                arayy[arayy.length-1] =0;
                break;
            }
        }
        //Bước 5: Kết thúc duyệt mảng. In ra mảng.
        for (int i = 0; i < arayy.length-1; i++)
        {
            System.out.println(arayy[i]);
        };
    }
}
