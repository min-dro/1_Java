package com.kh.set.practice;

public class Member {
	// �ʵ�
	// -memberId:int
	// -memberName:String
	// * ���������� Ŭ���� ���̾�׷� ��ȣ: + > # > ~ > -
	private int memberId;
	private String memberName;
	
	
	// +Member(memberId:int, memberName:String)
	public Member(int memberId, String memberName) {
		// �Ű������� �ִ� ��� �밳�ʱ�ȭ �۾��� ����
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// �޼ҵ�
	//	getter/setter
	//	+hashCode():int					// memberId�� ���ذ����� ����
	//	+equals(obj:Object):boolean		// ���� ����� ���޵� ������ memberId�� �����ϸ� true, �׷��� ������ false
	//	+toString():String				// ���� ��ü�� �ʵ� ������ ���. ����: "[memberId] memberName"
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public int hashCode() {
		return memberId;
		// ���� �����Ͱ� �ƴ� ���� .hashCode() �޼ҵ带 ���� �ؽð��� ��ȯ
	}
	public boolean equals(Object obj) {
		// ���޵� ��ü�� Member Ÿ������ Ȯ�� : instanceof
		if (obj instanceof Member){
			// ���޵� ��ü�� ���� ��ü�� memberId ���� ���� ��� true ��ȯ(����)
			if(this.memberId == ((Member)obj).getMemberId()) {
				return true;	
			}
		}
		// ���޵� ��ü�� ���� ��ü�� memberId ���� �ٸ��ų�,
		// 	���޵� ��ü�� Member Ÿ���� �ƴ� ��� false ��Ⱥ(����)
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("[%d] %s", memberId, memberName);
	}
}
