package spring5_basic_study.di;

public class ChangePasswordService {

	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		
		member.changePassword(oldPwd, newPwd); // 원래는 true면 update해야하기 때문에 try-catch 필요한데 일단은 그냥 한거임
		
		memberDao.update(member);
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
