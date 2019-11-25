package day16List;

public class StacksAndQueue {
	public static void main(String[] args) {
		DemoLinkedListStacks sta=new DemoLinkedListStacks();
		DemoLinkedListQueue que=new DemoLinkedListQueue();
		sta.stacksIn("a");
		sta.stacksIn("b");
		sta.stacksIn("c");
		sta.stacksIn("d");
		System.out.println("======================");
		que.QueueIn("a");
		que.QueueIn("b");
		que.QueueIn("c");
		que.QueueIn("d");
		
		System.out.print("原StacKs:");
		sta.stacksToString();
		sta.stacksOut();
		System.out.print("现Stacks:");
		sta.stacksToString();
		System.out.print("原queue:");
		que.queueToString();
		que.QueueOut();
		System.out.print("现queue:");
		que.queueToString();
	}
}
