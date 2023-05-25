package com.hspedu.ticket;

public class SellTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SellTicket01 sellTicket01 = new SellTicket01();
		//SellTicket01 sellTicket02 = new SellTicket01();
		//SellTicket01 sellTicket03 = new SellTicket01();
		//sellTicket01.start();
        //sellTicket02.start();
		//sellTicket03.start();
		System.out.println("接口方式卖票");
		SellTicket02 sellTicket02 = new SellTicket02();
		new Thread(sellTicket02).start();
		new Thread(sellTicket02).start();
		new Thread(sellTicket02).start();
		
		
	}

}
class SellTicket01 extends Thread{
	private static int ticketNum = 100;
	public void run() {
		while (true)
		{
			if(ticketNum <= 0) {
				System.out.println("票已售完");
				break;
				}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			System.out.println("窗口"+Thread.currentThread().getName() +"售出一张票" + "剩余票数="+(--ticketNum));
			}
			
		}
}
class SellTicket02 implements Runnable{
	private  int ticketNum = 100;
	public void run() {
		while (true)
		{
			if(ticketNum <= 0) {
				System.out.println("票已售完");
				break;
				}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			System.out.println("窗口"+Thread.currentThread().getName() +"售出一张票" + "剩余票数="+(--ticketNum));
			}
			
		}
}