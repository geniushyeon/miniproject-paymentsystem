package payment;
import java.util.*;
public class MemberInformation {

	List<Member> memberlist = new ArrayList<>();
	List<Cart> shoppingCart = new ArrayList<>();
	List<Pay> paymentlist = new ArrayList<>();

	public MemberInformation() {
		setMemberInformation();
	}

	public void setMemberInformation() {
		memberlist.add(0, new Member("이지", "어쩌구"));

	}
	
	public void getMemberInformation() {
		System.out.println(memberlist.get(0).toString());

	}

	@Override
	public String toString() {
		return "MemberInformation [memberlist=" + memberlist + "]";
	}

}