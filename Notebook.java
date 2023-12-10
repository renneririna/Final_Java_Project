public class Notebook {
    private String brand;
    private int ram; //  ОЗУ оперативная память
    private int hardDriveCapacity; // Объем ЖД
    private String os; // Операционная система
    private String color; // цвет
    
    public Notebook(String brand, int ram, int hardDriveCapacity, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hardDriveCapacity = hardDriveCapacity;
        this.os = os;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRam() {
        return ram;
    }
     public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }
    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ноутбук: Брэнд - " + brand + ", ОЗУ - " + ram +  " ГБ, Объем ЖД - " + hardDriveCapacity + " ГБ, ОС - " + os + ", Цвет - " + color + "";
    }
}