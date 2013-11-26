/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statement2 extends Statement {

  public IfStatement ifStatement;

  public Statement2 (IfStatement ifStatement) {
    this.ifStatement = ifStatement;
    if (ifStatement != null) ifStatement.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (ifStatement != null) ifStatement.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (ifStatement != null) ifStatement.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (ifStatement != null) ifStatement.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Statement2(\n");
      if (ifStatement != null)
        buffer.append(ifStatement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Statement2]");
    return buffer.toString();
  }
}
