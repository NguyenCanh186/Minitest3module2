import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManagement {
public static ArrayList<Material> materials = new ArrayList<>();
public void material(){
    LocalDate localDate = LocalDate.of(2022, 2, 24);
    Material Crispy = new CrispyFlour("1", "bột", localDate, 60000, 10);
    Material Crispy2 = new CrispyFlour("2", "bột chiên giòn", localDate, 70000, 10);
    Material Crispy3 = new CrispyFlour("3", "bột năng", localDate, 80000, 10);
    Material Crispy4 = new CrispyFlour("4", "bột nở", localDate, 90000, 10);
    Material Crispy5 = new CrispyFlour("5", "bột đậu", localDate, 50000, 10);
    Material Meat = new Meat("6", "thịt lợn", localDate, 50000, 10 );
    Material Meat2 = new Meat("7", "thịt trâu", localDate, 70000, 10 );
    Material Meat3 = new Meat("8", "thịt bò", localDate, 90000, 10 );
    Material Meat4 = new Meat("9", "thịt ngan", localDate, 40000, 10 );
    Material Meat5 = new Meat("10", "thịt vịt", localDate, 30000, 10 );
    materials.add(Crispy);
    materials.add(Crispy2);
    materials.add(Crispy3);
    materials.add(Crispy4);
    materials.add(Crispy5);
    materials.add(Meat);
    materials.add(Meat2);
    materials.add(Meat3);
    materials.add(Meat4);
    materials.add(Meat5);
    System.out.println("Danh sách sản phẩm là: ");
    for (Material material : materials
         ) {
        System.out.println(material.toString());
    }
}
public void addMaterial(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. thêm nguyên liệu bột.");
    System.out.println("2. thhêm nguyên liệu thịt.");
    System.out.println("nhập lựa chọn của bạn: ");
    int choose = scanner.nextInt();
    switch (choose){
        case 1:
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("nhập id: ");
            String id = scanner1.nextLine();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("nhập tên bột: ");
            String name = scanner3.nextLine();
            System.out.println("nhập ngày: ");
            int date = scanner.nextInt();
            System.out.println("nhập tháng: ");
            int month = scanner.nextInt();
            System.out.println("nhập năm: ");
            int year = scanner.nextInt();
            System.out.println("nhập giá: ");
            int cost = scanner.nextInt();
            System.out.println("nhập số lượng: ");
            double quantity = scanner.nextDouble();
            LocalDate Date = LocalDate.of(year, month, date);
            CrispyFlour newCrispy = new CrispyFlour();
            newCrispy.setId(id);
            newCrispy.setName(name);
            newCrispy.setManufacturingDate(Date);
            newCrispy.setCost(cost);
            newCrispy.setQuantity(quantity);
            materials.add(newCrispy);
            break;
        case 2:
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("nhập id: ");
            String id1 = scanner2.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("nhập tên thịt: ");
            String name1 = scanner4.nextLine();
            System.out.println("nhập ngày: ");
            int date1 = scanner.nextInt();
            System.out.println("nhập tháng: ");
            int month1 = scanner.nextInt();
            System.out.println("nhập năm: ");
            int year1 = scanner.nextInt();
            System.out.println("nhập giá: ");
            int cost1 = scanner.nextInt();
            System.out.println("nhập khối lượng: ");
            double weight = scanner.nextDouble();
            LocalDate Date1 = LocalDate.of(year1, month1, date1);
            Meat newMeat = new Meat();
            newMeat.setId(id1);
            newMeat.setName(name1);
            newMeat.setManufacturingDate(Date1);
            newMeat.setCost(cost1);
            newMeat.setWeight(weight);
            materials.add(newMeat);
            break;
    }
    System.out.println("Danh sách sản phẩm là: ");
    for (Material material : materials
    ) {
        System.out.println(material.toString());
    }
}
public void editMaterial(){
    System.out.println("Nhập id nguyên liệu muốn chỉnh sửa: ");
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    boolean check = false;
    int size = materials.size();
    for (int i = 0; i < size; i++) {
        if(materials.get(i).getId().equals(id)
                && materials.get(i) instanceof CrispyFlour){
            check = true;
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("nhập tên bột: ");
            String name = scanner3.nextLine();
            System.out.println("nhập ngày: ");
            int date = scanner.nextInt();
            System.out.println("nhập tháng: ");
            int month = scanner.nextInt();
            System.out.println("nhập năm: ");
            int year = scanner.nextInt();
            System.out.println("nhập giá: ");
            int cost = scanner.nextInt();
            System.out.println("nhập số lượng: ");
            double quantity = scanner.nextDouble();
            LocalDate Date = LocalDate.of(year, month, date);
            materials.get(i).setName(name);
            materials.get(i).setManufacturingDate(Date);
            materials.get(i).setCost(cost);
            ((CrispyFlour) materials.get(i)).setQuantity(quantity);
            break;
        } else if (materials.get(i).getId().equals(id)
                && materials.get(i) instanceof Meat){
            check = true;
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("nhập tên thịt: ");
            String name1 = scanner4.nextLine();
            System.out.println("nhập ngày: ");
            int date1 = scanner4.nextInt();
            System.out.println("nhập tháng: ");
            int month1 = scanner4.nextInt();
            System.out.println("nhập năm: ");
            int year1 = scanner4.nextInt();
            System.out.println("nhập giá: ");
            int cost1 = scanner4.nextInt();
            System.out.println("nhập khối lượng: ");
            double weight = scanner4.nextDouble();
            LocalDate Date1 = LocalDate.of(year1, month1, date1);
            materials.get(i).setName(name1);
            materials.get(i).setManufacturingDate(Date1);
            materials.get(i).setCost(cost1);
            ((Meat) materials.get(i)).setWeight(weight);
            break;
        }
    }
    if (!check){
        System.out.println("không có id này trong danh sách!!!");
    } else {
        System.out.println(materials.toString());
    }
}
public void deleteMaterial(){
    Material material = null;
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập id sản phẩm muốn xóa: ");
    String id = scanner.nextLine();
    int size = materials.size();
    for (int i = 0; i < size; i++) {
        if(materials.get(i).getId().equals(id)){
            material = materials.get(i);
            break;
        }
    }
    if(material != null){
        materials.remove(material);
        System.out.println(materials.toString());
    } else {
        System.out.println("mời nhập lại id sản phẩm: ");
    }
}
}
