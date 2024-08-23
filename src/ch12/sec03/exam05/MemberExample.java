package ch12.sec03.exam05;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User usr = new User();
		Member mb = new Member();
		usr.setId("spring");
		
		System.out.println(usr.getId());
		
		mb.setId("winter");
		
		System.out.println(mb.getId());
		
	}

}
