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
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;

		while (keepRunning) {
			System.out.println("请选择要进行的操作（输入'c'创建计算机，输入'p'创建手机，输入'q'退出）：");
			String input = scanner.next();

			if (input.equals("c")) {
				// 从用户处读取 Computer 信息
				System.out.println("请输入 Computer 的重量:");
				double computerWeight = scanner.nextDouble();
				System.out.println("请输入 Computer 的价格:");
				double computerPrice = scanner.nextDouble();
				System.out.println("请输入 Computer 的耗电量:");
				double computerPowerConsumption = scanner.nextDouble();
				System.out.println("请输入 Computer 的制造商:");
				String computerManufacturer = scanner.next();
				System.out.println("请输入 Computer 的内存:");
				String computerMemory = scanner.next();
				System.out.println("请输入 Computer 的 CPU 型号:");
				String computerCpu = scanner.next();

				// 创建 Computer 对象
				Computer computer = new Computer(computerWeight, computerPrice, computerPowerConsumption,
						computerManufacturer, computerMemory, computerCpu);

				// 输出 Computer 信息
				System.out.println("\nComputer Information:");
				computer.displayInfo();

			} else if (input.equals("p")) {
				// 从用户处读取 Phone 信息
				System.out.println("\n请输入 Phone 的重量:");
				double phoneWeight = scanner.nextDouble();
				System.out.println("请输入 Phone 的价格:");
				double phonePrice = scanner.nextDouble();
				System.out.println("请输入 Phone 的耗电量:");
				double phonePowerConsumption = scanner.nextDouble();
				System.out.println("请输入 Phone 的制造商:");
				String phoneManufacturer = scanner.next();
				System.out.println("请输入 Phone 的系统:");
				String phoneSystem = scanner.next();
				System.out.println("请输入 Phone 的存储空间:");
				int phoneStorage = scanner.nextInt();

				// 创建 Phone 对象
				Phone phone = new Phone(phoneWeight, phonePrice, phonePowerConsumption, phoneManufacturer, phoneSystem,
						phoneStorage);

				// 输出 Phone 信息
				System.out.println("\nPhone Information:");
				phone.displayInfo();
			} else if (input.equals("q")) {
				keepRunning = false; // 设置标志以退出循环
				System.out.println("程序已退出。");
			} else {
				System.out.println("无效输入，请重新输入。");
			}
		}

		// 关闭 Scanner
		scanner.close();
	}
}
