/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statement3 extends Statement {

  public WhileStatement whileStatement;

  public Statement3 (WhileStatement whileStatement) {
    this.whileStatement = whileStatement;
    if (whileStatement != null) whileStatement.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (whileStatement != null) whileStatement.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (whileStatement != null) whileStatement.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (whileStatement != null) whileStatement.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
      if (whileStatement != null)
        buffer.append(whileStatement.toString(" "));
      else
        buffer.append(tab+"  null");
    return buffer.toString();
  }
}
