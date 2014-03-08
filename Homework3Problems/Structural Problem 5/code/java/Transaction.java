public interface Transaction {
	public void openDatabase();
	public void executeSQL(String sql);
	public void closeDatabase();
}