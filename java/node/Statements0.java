/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statements0 extends Statements {

  public Statement statement;
  public Statements statements;

  public Statements0 (Statement statement, Statements statements) {
    this.statement = statement;
    if (statement != null) statement.setParent(this);
    this.statements = statements;
    if (statements != null) statements.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (statement != null) statement.accept(visitor);
    if (statements != null) statements.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (statement != null) statement.traverseTopDown(visitor);
    if (statements != null) statements.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (statement != null) statement.traverseBottomUp(visitor);
    if (statements != null) statements.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
      if (statement != null)
        buffer.append(statement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    //buffer.append("\n");
      if (statements != null)
        buffer.append(statements.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    return buffer.toString();
  }
}
