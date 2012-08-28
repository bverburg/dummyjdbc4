package nl.codecast.dummyjdbc.xa;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;
import javax.sql.XAConnection;
import javax.transaction.xa.XAResource;

import nl.codecast.dummyjdbc.DummyConnection;

public class XADummyConnection implements XAConnection {

    public Connection getConnection() throws SQLException {
	return new DummyConnection();
    }

    public void close() throws SQLException {
	// TODO Auto-generated method stub

    }

    public void addConnectionEventListener(ConnectionEventListener listener) {
	// TODO Auto-generated method stub

    }

    public void removeConnectionEventListener(ConnectionEventListener listener) {
	// TODO Auto-generated method stub

    }

    public void addStatementEventListener(StatementEventListener listener) {
	// TODO Auto-generated method stub

    }

    public void removeStatementEventListener(StatementEventListener listener) {
	// TODO Auto-generated method stub

    }

    public XAResource getXAResource() throws SQLException {
	return new XADummyResource();
    }

}
