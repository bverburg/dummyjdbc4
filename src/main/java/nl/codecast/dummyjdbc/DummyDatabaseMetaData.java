package nl.codecast.dummyjdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

public class DummyDatabaseMetaData implements DatabaseMetaData {
    
    private static final DummyResultSet DUMMY_RESULT = new DummyResultSet();
    private static final String EMPTY_STRING = "";
    
    private final Connection connection;
    
    public DummyDatabaseMetaData(Connection connection) {
	this.connection = connection;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
	// TODO Auto-generated method stub
	return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean allProceduresAreCallable() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean allTablesAreSelectable() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public String getURL() throws SQLException {
	return EMPTY_STRING;
    }

    public String getUserName() throws SQLException {
	return EMPTY_STRING;
    }

    public boolean isReadOnly() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean nullsAreSortedHigh() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean nullsAreSortedLow() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean nullsAreSortedAtStart() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean nullsAreSortedAtEnd() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public String getDatabaseProductName() throws SQLException {
	return EMPTY_STRING;
    }

    public String getDatabaseProductVersion() throws SQLException {
	return EMPTY_STRING;
    }

    public String getDriverName() throws SQLException {
	return "DummyDriver";
    }

    public String getDriverVersion() throws SQLException {
	return "0.5.1";
    }

    public int getDriverMajorVersion() {
	return 0;
    }

    public int getDriverMinorVersion() {
	return 5;
    }

    public boolean usesLocalFiles() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean usesLocalFilePerTable() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMixedCaseIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesUpperCaseIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesLowerCaseIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesMixedCaseIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public String getIdentifierQuoteString() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getSQLKeywords() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getNumericFunctions() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getStringFunctions() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getSystemFunctions() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getTimeDateFunctions() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getSearchStringEscape() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getExtraNameCharacters() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public boolean supportsAlterTableWithAddColumn() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsAlterTableWithDropColumn() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsColumnAliasing() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean nullPlusNonNullIsNull() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsConvert() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsConvert(int fromType, int toType)
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsTableCorrelationNames() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsDifferentTableCorrelationNames() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsExpressionsInOrderBy() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOrderByUnrelated() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsGroupBy() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsGroupByUnrelated() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsGroupByBeyondSelect() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsLikeEscapeClause() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMultipleResultSets() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMultipleTransactions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsNonNullableColumns() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMinimumSQLGrammar() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCoreSQLGrammar() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsExtendedSQLGrammar() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsANSI92IntermediateSQL() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsANSI92FullSQL() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsIntegrityEnhancementFacility() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOuterJoins() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsFullOuterJoins() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsLimitedOuterJoins() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public String getSchemaTerm() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getProcedureTerm() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public String getCatalogTerm() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public boolean isCatalogAtStart() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public String getCatalogSeparator() throws SQLException {
	// TODO Auto-generated method stub
	return EMPTY_STRING;
    }

    public boolean supportsSchemasInDataManipulation() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSchemasInProcedureCalls() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSchemasInTableDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSchemasInIndexDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCatalogsInDataManipulation() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCatalogsInProcedureCalls() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCatalogsInTableDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsPositionedDelete() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsPositionedUpdate() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSelectForUpdate() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsStoredProcedures() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSubqueriesInComparisons() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSubqueriesInExists() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSubqueriesInIns() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsSubqueriesInQuantifieds() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsCorrelatedSubqueries() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsUnion() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsUnionAll() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public int getMaxBinaryLiteralLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxCharLiteralLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnsInGroupBy() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnsInIndex() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnsInOrderBy() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnsInSelect() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxColumnsInTable() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxConnections() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxCursorNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxIndexLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxSchemaNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxProcedureNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxCatalogNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxRowSize() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public int getMaxStatementLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxStatements() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxTableNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxTablesInSelect() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getMaxUserNameLength() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getDefaultTransactionIsolation() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public boolean supportsTransactions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsTransactionIsolationLevel(int level)
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsDataDefinitionAndDataManipulationTransactions()
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsDataManipulationTransactionsOnly()
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public ResultSet getProcedures(String catalog, String schemaPattern,
	    String procedureNamePattern) throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getProcedureColumns(String catalog, String schemaPattern,
	    String procedureNamePattern, String columnNamePattern)
	    throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getTables(String catalog, String schemaPattern,
	    String tableNamePattern, String[] types) throws SQLException {
	
	return new DummyTableResultSet(tableNamePattern);
    }

    public ResultSet getSchemas() throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getCatalogs() throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getTableTypes() throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getColumns(String catalog, String schemaPattern,
	    String tableNamePattern, String columnNamePattern)
	    throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getColumnPrivileges(String catalog, String schema,
	    String table, String columnNamePattern) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getTablePrivileges(String catalog, String schemaPattern,
	    String tableNamePattern) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getBestRowIdentifier(String catalog, String schema,
	    String table, int scope, boolean nullable) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getVersionColumns(String catalog, String schema,
	    String table) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getPrimaryKeys(String catalog, String schema, String table)
	    throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getImportedKeys(String catalog, String schema, String table)
	    throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getExportedKeys(String catalog, String schema, String table)
	    throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getCrossReference(String parentCatalog,
	    String parentSchema, String parentTable, String foreignCatalog,
	    String foreignSchema, String foreignTable) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getTypeInfo() throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getIndexInfo(String catalog, String schema, String table,
	    boolean unique, boolean approximate) throws SQLException {
	// TODO Auto-generated method stub
	return null;
    }

    public boolean supportsResultSetType(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsResultSetConcurrency(int type, int concurrency)
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean ownUpdatesAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean ownDeletesAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean ownInsertsAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean othersUpdatesAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean othersDeletesAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean othersInsertsAreVisible(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean updatesAreDetected(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean deletesAreDetected(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean insertsAreDetected(int type) throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsBatchUpdates() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public ResultSet getUDTs(String catalog, String schemaPattern,
	    String typeNamePattern, int[] types) throws SQLException {
	return DUMMY_RESULT;
    }

    public Connection getConnection() throws SQLException {
	return null;
    }

    public boolean supportsSavepoints() throws SQLException {
	return false;
    }

    public boolean supportsNamedParameters() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsMultipleOpenResults() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsGetGeneratedKeys() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public ResultSet getSuperTypes(String catalog, String schemaPattern,
	    String typeNamePattern) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getSuperTables(String catalog, String schemaPattern,
	    String tableNamePattern) throws SQLException {
	return DUMMY_RESULT;
    }

    public ResultSet getAttributes(String catalog, String schemaPattern,
	    String typeNamePattern, String attributeNamePattern)
	    throws SQLException {
	return DUMMY_RESULT;
    }

    public boolean supportsResultSetHoldability(int holdability)
	    throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public int getResultSetHoldability() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getDatabaseMajorVersion() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getDatabaseMinorVersion() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getJDBCMajorVersion() throws SQLException {
	// TODO Auto-generated method stub
	return 4;
    }

    public int getJDBCMinorVersion() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public int getSQLStateType() throws SQLException {
	// TODO Auto-generated method stub
	return 0;
    }

    public boolean locatorsUpdateCopy() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean supportsStatementPooling() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public RowIdLifetime getRowIdLifetime() throws SQLException {
	return RowIdLifetime.ROWID_UNSUPPORTED;
    }

    public ResultSet getSchemas(String catalog, String schemaPattern)
	    throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

    public ResultSet getClientInfoProperties() throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getFunctions(String catalog, String schemaPattern,
	    String functionNamePattern) throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getFunctionColumns(String catalog, String schemaPattern,
	    String functionNamePattern, String columnNamePattern)
	    throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public ResultSet getPseudoColumns(String catalog, String schemaPattern,
	    String tableNamePattern, String columnNamePattern)
	    throws SQLException {
	// TODO Auto-generated method stub
	return DUMMY_RESULT;
    }

    public boolean generatedKeyAlwaysReturned() throws SQLException {
	// TODO Auto-generated method stub
	return false;
    }

}
