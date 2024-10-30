package com.threadpractice;

class Pen {
	public void writeWithPenAndPaper(Paper paper)
	{
		System.out.println(Thread.currentThread().getName()+" is using pen "+this);
		paper.finishedWriting();
	}
	
	public void finishedWriting() {
		System.out.println("Finished using pen");
	}
}

class Paper {
	public void writeWithPaperAndPen(Pen pen)
	{
		System.out.println(Thread.currentThread().getName()+" is using paper "+this);
		pen.finishedWriting();
	}
	
	public void finishedWriting() {
		System.out.println("Finished using paper");
	}
}

class MyThread extends Thread{
	Pen pen;
	Paper paper;
	
	MyThread(Pen pen, Paper paper)
	{
		this.pen = pen;
		this.paper = paper;
	}
	
	public void run() {
		pen.writeWithPenAndPaper(paper);
	}
}

class MyThread2 extends Thread{
	Pen pen;
	Paper paper;
	
	MyThread2(Pen pen, Paper paper)
	{
		this.pen = pen;
		this.paper = paper;
	}
	
	public void run() {
		paper.writeWithPaperAndPen(pen);
	}
}

public class DeadlockExample {
	
	public static void main(String args[])
	{
		Pen pen = new Pen();
		Paper paper = new Paper();
		Thread t1 = new Thread((pen, paper) -> pen);
		Thread t2 = new Thread();
	}
}
