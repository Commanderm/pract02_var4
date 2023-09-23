package pract02var4;

public class TestMassiv {
    public static void main(String[] args) {
        Massiv mass = new Massiv();
        System.out.println("Сгенерированный массив до сортировки");
        mass.showMassiv();
        mass.sortMassiv();
        System.out.println("Сгенерированный массив после сортировки");
        mass.showMassiv();
    }
}
