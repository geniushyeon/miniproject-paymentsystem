package payment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PaymentSystem {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	MemberInformation memberInformation;

	public PaymentSystem() {
		memberInformation = new MemberInformation();
	}

	public void run() {
		choice();
	}

	public void choice() {
		while(true) {
			System.out.println("결제하시겠습니까?");
			System.out.println("1. 예\t2. 아니오");
			System.out.print("입력: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				showInformation();
				chooseChangeAddress();
				break;
			}
			if (choice == 2) {
				System.out.println("결제를 취소하였습니다. 프로그램을 종료합니다. ");
				break;
			}
		}
	}//choice();
	
	public void showInformation() {
		System.out.println("\n고객님의 정보를 확인해주세요. ");
		System.out.println("==============================================");
		memberInformation.getMemberInformation();
		System.out.println("==============================================");
		checkInformation();

	}

	public void checkInformation() {
		while(true) {
			System.out.println("\n고객님의 정보가 맞습니까?");
			System.out.println("1. 예\t2. 아니오");
			System.out.print("입력: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				showAddress();
				break;
			}
			if (choice == 2) {
				setNewInformation();
			}
		}
	}//checkInformation();

	public void setNewInformation() {
		System.out.println("\n고객님의 정보를 다시 설정해주세요. ");
		System.out.print("이름: ");
		String newName = scan.next();
		memberInformation.member.setName(newName);
		System.out.print("주민등록번호 : ");
		String newPersonNumber = scan.next();
		memberInformation.member.setPersonNumber(newPersonNumber);
		memberInformation.memberlist.add(memberInformation.member);
		System.out.println("\n입력하신 정보로 설정하였습니다. ");
		System.out.println("==============================================");
		memberInformation.getMemberInformation();
		System.out.println("==============================================");
	}

	public void showAddress() {
		System.out.println("\n회원님의 주소입니다. ");
		System.out.println("==============================================");
		System.out.println(memberInformation.member.getAddress());
		System.out.println("==============================================");

	}

	public void chooseChangeAddress() {
		while(true) {
			System.out.println("\n주소를 바꾸시겠습니까?");
			System.out.println("1. 예\t2. 아니오");
			System.out.print("입력: ");
			int choice = scan.nextInt();
			if (choice == 1)
				changeAddress();
			if (choice == 2) {
				System.out.println("==============================================");
				System.out.println(memberInformation.member.toString());
				System.out.println("==============================================");
				checkCart();
				break;
			}
		}
	}//chooseChangeAddress();
	

	public void changeAddress() {
		System.out.println("\n바꿀 주소를 입력하세요. ");
		System.out.print("새 주소: ");
		String newAddress = null;
		try {
			newAddress = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		memberInformation.member.setAddress(newAddress);
		memberInformation.memberlist.add(memberInformation.member);
		System.out.println("\n입력하신 주소로 설정하였습니다. ");
		System.out.println("==============================================");
		System.out.println(memberInformation.member.toString());
		System.out.println("==============================================");

	}


	public void checkCart() {
		System.out.println("\n회원님이 주문하신 상품 목록과 결제 금액입니다. ");
		System.out.println("==============================================");
		System.out.println(memberInformation.cart.toString());
		System.out.println("==============================================");
		System.out.println("\n결제하시겠습니까?");
		System.out.println("1. 예\t2. 아니오");
		System.out.print("입력: ");
		int choice = scan.nextInt();
		if (choice == 1) {
			choosePayment();
		}

		if (choice == 2) {
			shoppingcart();

		}
	}

	public void shoppingcart() {
		System.out.println("\n장바구니의 상품을 관심 물품에 등록하였습니다.");
		System.out.println("==============================================");
		memberInformation.wishlist();
		System.out.println("==============================================");
	}

	public void choosePayment() {
		while(true) {
			System.out.println("\n결제 방법을 선택하세요. ");
			System.out.println("1. 포인트\t2. 신용카드  ");
			System.out.print("입력: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("아직 구상 중");
			}
			
			if (choice == 2) {
				payment();
				break;

			}
		}

	}//choosePayment();

	public void payment() {
		while(true) {
			System.out.print("\n카드 번호를 입력하세요: ");
			long cardNumber = scan.nextInt();
			System.out.print("카드 비밀번호를 입력하세요: ");
			long password = scan.nextInt();

			if (cardNumber == memberInformation.pay.getCardNumber() && password == memberInformation.pay.getPassword()) {
				System.out.println("\n결제가 완료되었습니다. 감사합니다. ");
				break;
			}
			else {
				System.out.println("\n카드 번호와 비밀번호를 다시 입력하세요.");
			}

		}

	}//payment();
}
