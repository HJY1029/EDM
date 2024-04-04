package application;

import java.util.Scanner;

import framework.*;

public class ElectronicsManagement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;

		while (keepRunning) {
			CommandUserInterface.clearConsole(); // 清除控制台屏幕
			System.out.println("请选择要进行的操作（输入'c'创建计算机，输入'p'创建手机，输入'q'退出）：");
			String input = scanner.next();

			if (input.equals("c")) {
				// 创建 Computer 对象
				Computer computer = Commander.createComputerCommand.execute(scanner);

				// 输出 Computer 信息
				System.out.println("\nComputer Information:");
				computer.displayInfo();

			} else if (input.equals("p")) {
				// 创建 Phone 对象
				Phone phone = Commander.createPhoneCommand.execute(scanner);

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
