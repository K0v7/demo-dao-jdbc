package db;

public class DbException extends RuntimeException {

	private static final long seriaVersionUID = 1;

	public DbException(String msg) {
		super(msg);
	}
}
