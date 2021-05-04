package spring5_basic_study.di;

import java.util.Collection;

public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) { // injection
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
	
}
