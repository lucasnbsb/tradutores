/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Statement0 extends Statement {

  public Expression expression;
  public String ptvirgula;

  public Statement0 (Expression expression, String ptvirgula) {
    this.expression = expression;
    if (expression != null) expression.setParent(this);
    this.ptvirgula = ptvirgula;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (expression != null) expression.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (expression != null) expression.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (expression != null) expression.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
      if (expression != null)
        buffer.append(expression.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("  "+tab+ptvirgula);
    buffer.append("\n");
    return buffer.toString();
  }
}
