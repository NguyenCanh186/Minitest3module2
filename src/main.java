import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MaterialManagement material = new MaterialManagement();
        material.material();
        System.out.println("menu: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. thêm nguyên liệu. ");
        System.out.println("2. sửa nguyên liệu. ");
        System.out.println("3. xóa nguyên liệu. ");
        System.out.println("nhập lựa chọn của bạn: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                material.addMaterial();
                break;
            case 2:
                material.editMaterial();
                break;
            case 3:
                material.deleteMaterial();
                break;
        }

    }
}
