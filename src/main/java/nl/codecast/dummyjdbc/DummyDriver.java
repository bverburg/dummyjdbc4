/**
 * 
 */
package nl.codecast.dummyjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author bas
 *
 */
public class DummyDriver implements Driver {

    /* (non-Javadoc)
     * @see java.sql.Driver#connect(java.lang.String, java.util.Properties)
     */
    public Connection connect(String url, Properties info) throws SQLException {
	// TODO Auto-generated method stub
	return null;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#acceptsURL(java.lang.String)
     */
    public boolean acceptsURL(String url) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#getPropertyInfo(java.lang.String, java.util.Properties)
     */
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
	    throws SQLException {
	// TODO Auto-generated method stub
	return null;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#getMajorVersion()
     */
    public int getMajorVersion() {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#getMinorVersion()
     */
    public int getMinorVersion() {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#jdbcCompliant()
     */
    public boolean jdbcCompliant() {
	// TODO Auto-generated method stub
	return false;
    }

    /* (non-Javadoc)
     * @see java.sql.Driver#getParentLogger()
     */
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
	// TODO Auto-generated method stub
	return null;
    }

}
