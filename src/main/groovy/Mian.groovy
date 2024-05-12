import groovy.sql.Sql
def sql = Sql.newInstance("jdbc:oracle:thin:@qarep:1521:rep", "csqa", "c67")
def result = sql.rows("SELECT VERSION FROM VERSIONLIST")
result.each { row ->
    println row
}
sql.close()
