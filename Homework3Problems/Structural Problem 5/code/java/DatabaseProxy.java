import java.util.LinkedList;
import java.util.HashMap;
public class DatabaseProxy implements Transaction {

	private LinkedList<String> transactions;
	private HashMap<String, Object> tables;
	private Database realDB;
	private String address;

	public DatabaseProxy(String address) {
		this.address = address;
		this.realDB = new Database(address);
	}
	public void openDatabase() {
		this.transactions = new LinkedList<String>();
		this.tables = new HashMap<String, Object>();
	}
	public void executeSQL(String sql) {
		String tableName = extractTable(sql);
		if (!tables.containsKey(tableName))
			{ tables.put(tableName, loadTable(tableName)); }
		if (canExecute(sql, tables.get(tableName))) {
			transactions.add(sql);
			updateTable(tableName, sql);
		} else { System.exit(1); }
	}
	public void closeDatabase() {
		realDB.openDatabase();
		for (short i = 0; i < transactions.size(); i++)
			{ realDB.executeSQL(transactions.get(i)); }
		realDB.closeDatabase();
	}

	private Object loadTable(String table) { return null; }
	private String extractTable(String sql) { return null; }
	private boolean canExecute(String sql, Object table) { return true; }
	private void updateTable(Object table, String sql) { return; }
}