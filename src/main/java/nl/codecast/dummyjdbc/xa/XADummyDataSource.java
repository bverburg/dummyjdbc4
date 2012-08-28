package nl.codecast.dummyjdbc.xa;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.XAConnection;
import javax.sql.XADataSource;

public class XADummyDataSource implements XADataSource {

    
    public PrintWriter getLogWriter() throws SQLException {
	return null;
    }

    public void setLogWriter(PrintWriter out) throws SQLException {}

    public void setLoginTimeout(int seconds) throws SQLException {}

    public int getLoginTimeout() throws SQLException {
	return 0;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
	throw new SQLFeatureNotSupportedException();
    }

    public XAConnection getXAConnection() throws SQLException {
	return new XADummyConnection();
    }

    public XAConnection getXAConnection(String user, String password)
	    throws SQLException {
	return new XADummyConnection();
    }

    
    //specifics for mocking postgre and mysql like configurations
    public void setDatabaseName(String name) {}
    public String getDatabaseName() {
	return null;
    }
    
    public void setURL(String url) {}
    public String getURL() {
	return null;
    }
    
    public void setServerName(String name) {}
    public String getServerName() {
	return null;
    }
    
    public void setPortNumber(String name) {}
    public String getPortNumber() {
	return null;
    }
}
