/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class ClassStatements1 extends ClassStatements {

  public ClassStatement classStatement;

  public ClassStatements1 (ClassStatement classStatement) {
    this.classStatement = classStatement;
    if (classStatement != null) classStatement.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (classStatement != null) classStatement.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (classStatement != null) classStatement.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (classStatement != null) classStatement.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    
      if (classStatement != null)
        buffer.append(classStatement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    return buffer.toString();
  }
}
