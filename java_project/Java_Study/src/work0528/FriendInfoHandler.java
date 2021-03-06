package work0528;

import java.util.Scanner;

public class FriendInfoHandler {
	Friend [] friends;
	int numOfFriend;
	
	
	public FriendInfoHandler(int num) {
		this.friends = new Friend[num];
		this.numOfFriend = 0;
	}
	
	public void addFriend(int choice) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 > ");
		String name = s.nextLine();
		System.out.println("전화 번호를 입력해주세요 >");
		String phoneNumber = s.nextLine();
		System.out.println("주소를 입력해주세요 >");
		String address = s.nextLine();
		
		if(choice == 1) {
			System.out.println("직업을 입력해주세요 >");
			String work = s.nextLine();
			addFriendInfo(new HighFriend(name, phoneNumber, address, work));
		}else {
			System.out.println("전공을 입력해주세요 >");
			String major = s.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNumber, address, major));
		}
	}
	public void addFriendInfo(Friend f) {
		friends[numOfFriend++] = f;
		System.out.println("정보가 저장되었습니다. ");
	}
	public void showAllData() {
		System.out.println("친구의 모든 정보를 출력합니다.");
		System.out.println("===========================");
		if(numOfFriend > 0) {
			for( int i= 0; i< numOfFriend ; i++) {
				friends[i].showData();
				System.out.println("============================");
			}
		}else {
			System.out.println("입력된 정보가 없습니다. ");
		}
	}
	public void showAllBasicData() {
		System.out.println("친구의 모든 기본 정보를 출력합니다. ");
		System.out.println("==============================");
		if( numOfFriend >0) {
			for( int i = 0; i < numOfFriend ; i++) {
				friends[i].showBasicData();
				System.out.println("==========================");
			}
		}else {
			System.out.println("입력된 정보가 없습니다.");
		}
		System.out.println("================================");
	}
	
	
}
