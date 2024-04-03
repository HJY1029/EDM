package framework;
public class Phone extends Electronics {  
    private String os; // 系统  
    private int storageCapacity; // 存储空间  
  
    // 构造方法  
    public Phone(double weight, double price, double powerConsumption, String manufacturer, String os, int storageCapacity) {  
        super(weight, price, powerConsumption, manufacturer);  
        this.os = os;  
        this.storageCapacity = storageCapacity;  
    }  
  
    // Getter 和 Setter 方法  
    public String getOs() {  
        return os;  
    }  
  
    public void setOs(String os) {  
        this.os = os;  
    }  
  
    public int getStorageCapacity() {  
        return storageCapacity;  
    }  
  
    public void setStorageCapacity(int storageCapacity) {  
        this.storageCapacity = storageCapacity;  
    }  
  
    // 覆盖父类的输出设备信息的方法，增加手机特有的属性  
    @Override  
    public void displayInfo() {  
        super.displayInfo();  
        System.out.println("Operating System: " + os);  
        System.out.println("Storage Capacity: " + storageCapacity + " GB");  
    }  
}