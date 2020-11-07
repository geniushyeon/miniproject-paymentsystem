package payment;
import java.util.*;
public class MemberInformation {

	List<Member> memberlist = new ArrayList<>();
	List<Cart> shoppingCart = new ArrayList<>();
	List<Cart> wishlist = new ArrayList<>();
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

	public void getMemberNameAndNumber() {
		System.out.println("이름\t생년월일");
		System.out.println("------------------");
		System.out.println(member.getName() + "\t" + member.getPersonNumber());

	}
	
	public void getMemberInformation() {

		System.out.println("\n이름\t생년월일\t주소");
		System.out.println("------------------------------------");
		System.out.println(member.toString());
	}

	public void setShoppingCart() {
		cart.setProductName("일리 커피머신");
		cart.setProductPrice(100000);
		shoppingCart.add(cart);
	}
	
	public void getShoppingCart() {
		System.out.println("\n상품명\t\t가격");
		System.out.println("-------------------------");
		System.out.println(cart.toString());
	}
	
	public void	wishlist() {
		wishlist.add(cart);
		System.out.println("상품명\t\t가격");
		System.out.println("------------------------");
		System.out.println(wishlist.get(0));

	}
	
	public void setPaymentInformation() {
		pay.setCardNumber(12341234);
		pay.setPassword(0000);
		paymentlist.add(pay);
		
	}

}