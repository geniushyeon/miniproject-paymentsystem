package payment;
import java.util.Scanner;

public class PaymentSystem {
	Scanner scan = new Scanner(System.in);
	Member member = new Member();
	Cart cart = new Cart(); 
	Pay pay = new Pay();
	MemberInformation memberInformation = new MemberInformation();
	int choice;
	
	public PaymentSystem() {
		
	}
	
	public void run() {
		choice();
		showInformation();
		checkInformation();
		chooseChangeAddress();
	}
	
	public void choice() {
		System.out.println("결제하시겠습니까? 1. 예 2. 아니오 ");
		choice = scan.nextInt();
		
	}
	
	public void showInformation() {
		System.out.println("고객님의 정보를 확인해주세요. ");
//		member.getName();
//		member.getPersonNumber();
		
		memberInformation.getMemberInformation();
	}

	public void checkInformation() {
		System.out.println("고객님의 정보가 맞습니까? 1. 예 2. 아니오 ");
		choice = scan.nextInt();
		if (choice == 1) {
			showAddress();
		}
		if (choice == 2) {
			setNewInformation();
		}
				
	}
	
	public void setNewInformation() {
		System.out.println("회원님의 정보를 다시 설정해주세요. ");
		System.out.print("이름: ");
		String newName = scan.next();
		member.setName(newName);
		System.out.print("주민등록번호 : ");
		String newPersonNumber = scan.next();
		member.setPersonNumber(newPersonNumber);
		System.out.println("입력하신 정보로 설정하였습니다. ");
		showAddress();
	}
	
	public void showAddress() {
		System.out.println("회원님의 주소입니다. ");
		member.getAddress();
	}
	
	public void chooseChangeAddress() {
		System.out.println("주소를 바꾸시겠습니까? 1. 예 2. 아니오 ");
		choice = scan.nextInt();
		if (choice == 1)
			changeAddress();
		if (choice == 2)
			checkCart();
	}
	
	public void changeAddress() {
		System.out.println("바꿀 주소를 입력하세요. ");
		String newAddress = scan.next();
		member.setNewAddress(newAddress);
		System.out.println("입력하신 주소로 설정하였습니다. ");
	}
	
	public void checkCart() {
		System.out.println("회원님이 주문하신 상품 목록과 결제 금액입니다. ");
		System.out.println(cart.toString());
		System.out.println("결제하시겠습니까? 1. 예 2. 아니오 ");
		choice = scan.nextInt();
		if (choice == 1) {
			choosePayment();
		}
		
		//아니오 선택 시 장바구니에 있는 상품을 관심 물품에 등록하고 결제 종료
		//ArrayList에 저장?
		
	}

	public void choosePayment() {
		System.out.println("결제 방법을 선택하세요. ");
		System.out.println("1. 포인트 2. 신용카드  ");
		choice = scan.nextInt();
		if (choice == 2) {
			payment();
		}
		
	}

	public void payment() {
		System.out.print("카드 번호를 입력하세요: ");
		long cardNumber = scan.nextInt();
		System.out.print("카드 비밀번호를 입력하세요: ");
		long password = scan.nextInt();
		
		if (cardNumber == pay.getCardNumber() && password == pay.getPassword()) {
			paymentPossible();
		}
		else {
			paymentImpossible();
		}
		
	}
	
	public void paymentImpossible() {
		System.out.println("카드 번호와 비밀번호를 다시 입력하세요. ");
		
	}

	public void paymentPossible() {
		System.out.println("카드 번호와 비밀번호가 일치합니다. ");
		System.out.println("결제가 성공적으로 완료되었습니다.");
	}
	
	
}
