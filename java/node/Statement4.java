/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statement4 extends Statement {

  public PrintStatement printStatement;

  public Statement4 (PrintStatement printStatement) {
    this.printStatement = printStatement;
    if (printStatement != null) printStatement.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (printStatement != null) printStatement.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (printStatement != null) printStatement.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (printStatement != null) printStatement.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Statement4(\n");
      if (printStatement != null)
        buffer.append(printStatement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Statement4]");
    return buffer.toString();
  }
}
