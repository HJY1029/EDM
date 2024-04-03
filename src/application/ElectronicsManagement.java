package application;

import java.util.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import framework.Computer;
import framework.Electronics;
import framework.Phone;

public class ElectronicsManagement {  
    public static void main(String[] args) {  
        // 创建 Computer 对象  
        Computer computer = new Computer(  
                2.5, // 重量  
                1000.0, // 价格  
                65.0, // 耗电量  
                "Apple", // 制造商  
                "16GB", // 内存  
                "Intel i7" // CPU 型号  
        );  
  
        // 输出 Computer 信息  
        System.out.println("Computer Information:");  
        computer.displayInfo();  
  
        // 创建 Phone 对象  
        Phone phone = new Phone(  
                0.15, // 重量  
                500.0, // 价格  
                5.0, // 耗电量  
                "Samsung", // 制造商  
                "Android", // 系统  
                128 // 存储空间  
        );  
  
        // 输出 Phone 信息  
        System.out.println("\nPhone Information:");  
        phone.displayInfo();  
    }  
}