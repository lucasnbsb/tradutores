/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class ImportList1 extends ImportList {

  public ImportStatement importStatement;
  public ImportList importList;

  public ImportList1 (ImportStatement importStatement, ImportList importList) {
    this.importStatement = importStatement;
    if (importStatement != null) importStatement.setParent(this);
    this.importList = importList;
    if (importList != null) importList.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (importStatement != null) importStatement.accept(visitor);
    if (importList != null) importList.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (importStatement != null) importStatement.traverseTopDown(visitor);
    if (importList != null) importList.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (importStatement != null) importStatement.traverseBottomUp(visitor);
    if (importList != null) importList.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
      if (importStatement != null)
        buffer.append(importStatement.toString(" "));
      else
        buffer.append(tab+"  null");
      if (importList != null)
        buffer.append(importList.toString(" "));
      else
        buffer.append(tab+"  null");
    return buffer.toString();
  }
}
