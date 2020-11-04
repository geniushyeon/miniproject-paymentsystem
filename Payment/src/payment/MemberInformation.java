package payment;
import java.util.*;
public class MemberInformation {

	List<Member> memberlist = new ArrayList<>();
	List<Cart> shoppingCart = new ArrayList<>();
	List<Pay> paymentlist = new ArrayList<>();
	Member member = new Member();
	Cart cart = new Cart();
	Pay pay = new Pay();

	public MemberInformation() {
		setMemberInformation();
		setShoppingCart();
		setPaymentInformation();
	}

	public void setMemberInformation() {
		member.setName("이지현");
		member.setPersonNumber("960912");
		member.setAddress("서울시 관악구 어쩌구동");
		memberlist.add(member);
	}

	public void getMemberInformation() {
		System.out.println("이름: " + member.getName() + ", 생년월일: " + member.getPersonNumber());
	}

	public void setShoppingCart() {
		cart = new Cart();
		cart.setProductName("일리 커피머신");
		cart.setProductPrice(100000);
		shoppingCart.add(cart);
	}
	
	public void	wishlist() {
		setShoppingCart();
		System.out.println(cart.toString());
	}
	
	public void setPaymentInformation() {
		pay.setCardNumber(12341234);
		pay.setPassword(0000);
		paymentlist.add(pay);
		
	}



}