package nl.codecast.dummyjdbc;

import java.sql.SQLException;

public class DummyTableResultSet extends DummyResultSet {

    private final String tableName;
    private int accessCount = 0;
    
    public DummyTableResultSet(String tableName) {
	this.tableName = tableName;
    }

    @Override
    public String getString(String columnLabel) throws SQLException {
	return tableName;
    }

    @Override
    public boolean next() throws SQLException {
	if(accessCount > 0)
	    return false;
	
	accessCount++;
	return true;
    }    
}
