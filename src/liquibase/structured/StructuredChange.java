package liquibase.structured;

import liquibase.change.custom.CustomSqlChange;
import liquibase.database.Database;
import liquibase.exception.CustomChangeException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationErrors;
import liquibase.resource.ResourceAccessor;
import liquibase.statement.SqlStatement;

/**
 * Generates changes from existing database objects (views, procedures and indexes, grants)
 * 
 * @author Ruslan
 */
public class StructuredChange implements CustomSqlChange {
	/**
	 * Single file to read
	 */
	String file;
	
	/**
	 * Directory of files
	 */
	String dir;

	/**
	 * Resource accessor
	 */
	ResourceAccessor res;
	
	
	
	public void readAll() {
		res.list(relativeTo, path, includeFiles, includeDirectories, recursive);
	}
	
	@Override
	public SqlStatement[] generateStatements(Database database) throws CustomChangeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConfirmationMessage() {
		return null;
	}
	
	@Override
	public void setUp() throws SetupException {
	}

	@Override
	public void setFileOpener(ResourceAccessor resourceAccessor) {
		this.res = resourceAccessor;
	}

	@Override
	public ValidationErrors validate(Database database) {
		return null;
	}
}
