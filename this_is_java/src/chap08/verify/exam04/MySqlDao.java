package chap08.verify.exam04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao Db에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao Db에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySqlDao Db를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao Db에서 삭제");
	}
	
}
