/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class NumericExpression2 extends NumericExpression {

  public NumericExpression numericExpression;
  public String operador;
  public NumericExpression numericExpression2;

  public NumericExpression2 (NumericExpression numericExpression, String operador, NumericExpression numericExpression2) {
    this.numericExpression = numericExpression;
    if (numericExpression != null) numericExpression.setParent(this);
    this.operador = operador;
    this.numericExpression2 = numericExpression2;
    if (numericExpression2 != null) numericExpression2.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (numericExpression != null) numericExpression.accept(visitor);
    if (numericExpression2 != null) numericExpression2.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (numericExpression != null) numericExpression.traverseTopDown(visitor);
    if (numericExpression2 != null) numericExpression2.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (numericExpression != null) numericExpression.traverseBottomUp(visitor);
    if (numericExpression2 != null) numericExpression2.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("NumericExpression2(\n");
      if (numericExpression != null)
        buffer.append(numericExpression.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append("  "+tab+operador);
    buffer.append("\n");
      if (numericExpression2 != null)
        buffer.append(numericExpression2.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [NumericExpression2]");
    return buffer.toString();
  }
}
