package work0605;

import javax.swing.JOptionPane;

public class Thread04 {
	public static boolean chk = false;
	
	public static void main(String[] args) {
		InputThread it = new InputThread();
		CountDownThread ct = new CountDownThread();
		
		it.start();
		ct.start();
	}
}
class InputThread extends Thread{
	public void run() {
		String name = JOptionPane.showInputDialog("이름을 입력해주세요");
		Thread04.chk = true;
		System.out.println("안녕하세요."+name+"님");
	
	}
}

class CountDownThread extends Thread{

	@Override
	public void run() {
		for(int i= 10; i>0; i--) {
			if(Thread04.chk == true) {
				return; //run() 종료
			}
			
			
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("입력시간이 지나 프로그램을 종료합니다.");
		System.exit(0);
	}
	
}




