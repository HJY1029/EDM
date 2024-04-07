package framework;

// Phone class representing a mobile phone
public class Phone extends Electronics {  
    // Instance variables
    private String os; // 存储操作系统
    private int storageCapacity; // 存储存储空间
  
    // Constructor
    public Phone(double weight, double price, double powerConsumption, String manufacturer, String os, int storageCapacity) {  
        super(weight, price, powerConsumption, manufacturer);  // 调用父类构造方法
        this.os = os;  // 初始化操作系统
        this.storageCapacity = storageCapacity;  // 初始化存储空间
    }  
  
    // Getter method for os
    public String getOs() {  
        return os;  
    }  
  
    // Setter method for os
    public void setOs(String os) {  
        this.os = os;  
    }  
  
    // Getter method for storageCapacity
    public int getStorageCapacity() {  
        return storageCapacity;  
    }  
  
    // Setter method for storageCapacity
    public void setStorageCapacity(int storageCapacity) {  
        this.storageCapacity = storageCapacity;  
    }  
  
    // Method to override the parent class's displayInfo method, adding phone-specific attributes
    @Override  
    public void displayInfo() {  
        super.displayInfo();  // 调用父类的displayInfo方法
        System.out.println("Operating System: " + os);  // 显示操作系统
        System.out.println("Storage Capacity: " + storageCapacity + " GB");  // 显示存储空间
    }  
}