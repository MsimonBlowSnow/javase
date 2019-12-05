package day11Ecilpes;

public class DemoDebug {
	/** A:删除项目
	* 选中项目 – 右键 – 删除
		* 从项目区域中删除
		* 从硬盘上删除
* B:导入项目
	* 在项目区域右键找到import
	* 找到General，展开，并找到
	* Existing Projects into Workspace
	* 点击next,然后选择你要导入的项目
	* 注意：这里选择的是项目名称

###11.12_Java开发工具(Eclipse中断点调试的基本使用)(了解)
* A:Debug的作用
	* 调试程序
	* 查看程序执行流程
* B:如何查看程序执行流程		
	* 什么是断点：
		* 就是一个标记，从哪里开始。
		
	* 如何设置断点：
		* 你想看哪里的程序，你就在那个有效程序的左边双击即可。
		
	* 在哪里设置断点：
		* 哪里不会点哪里。
		* 目前：我们就在每个方法的第一条有效语句上都加。
		
	* 如何运行设置断点后的程序：
		* 右键 -- Debug as -- Java Application
		
	* 看哪些地方：
		* Debug：断点测试的地方
			* 在这个地方，记住F6，或者点击也可以。一次看一行的执行过程。
		* Variables：查看程序的变量变化
		* ForDemo：被查看的源文件
		* Console：控制台
		
	* 如何去断点：
		* a:再次双击即可
		* b:找到Debug视图，Variables界面，找到Breakpoints，并点击，然后看到所有的断点，最后点击那个双叉。*/
	public static void main(String[] args) {
		int i;
		for (i = 0; i <6; i++) {
			i+=i;
		}
		System.out.println(i);
	}
}
