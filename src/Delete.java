import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "sarandis10";
		Connection connection = null;
		Statement statement = null;
		try {

			// Create a connection (get)
			connection = DriverManager.getConnection(url, username, password);
			// Create a statement
			statement = connection.createStatement();
			// Execute the SQL Query
			String sql = "delete from employees where last_name='Brown'";
			int rowsAffected = statement.executeUpdate(sql);

			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete Complete.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		}
	}

}
