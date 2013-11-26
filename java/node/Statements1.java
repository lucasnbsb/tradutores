/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statements1 extends Statements {

  public Statement statement;

  public Statements1 (Statement statement) {
    this.statement = statement;
    if (statement != null) statement.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (statement != null) statement.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (statement != null) statement.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (statement != null) statement.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Statements1(\n");
      if (statement != null)
        buffer.append(statement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Statements1]");
    return buffer.toString();
  }
}
