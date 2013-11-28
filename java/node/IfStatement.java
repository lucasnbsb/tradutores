/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class IfStatement implements SyntaxNode {

  private SyntaxNode parent;
  public String ifKeyword;
  public String lpar;
  public LogicalExpression logicalExpression;
  public String rpar;
  public String lcha;
  public Statements statements;
  public String rcha;

  public IfStatement (String ifKeyword, String lpar, LogicalExpression logicalExpression, String rpar, String lcha, Statements statements, String rcha) {
    this.ifKeyword = ifKeyword;
    this.lpar = lpar;
    this.logicalExpression = logicalExpression;
    if (logicalExpression != null) logicalExpression.setParent(this);
    this.rpar = rpar;
    this.lcha = lcha;
    this.statements = statements;
    if (statements != null) statements.setParent(this);
    this.rcha = rcha;
  }

  public SyntaxNode getParent() {
    return parent;
  }

  public void setParent(SyntaxNode parent) {
    this.parent = parent;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (logicalExpression != null) logicalExpression.accept(visitor);
    if (statements != null) statements.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (logicalExpression != null) logicalExpression.traverseTopDown(visitor);
    if (statements != null) statements.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (logicalExpression != null) logicalExpression.traverseBottomUp(visitor);
    if (statements != null) statements.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(" "+tab+ifKeyword);
    buffer.append(" "+lpar);
      if (logicalExpression != null)
        buffer.append(logicalExpression.toString(" "));
      else
        buffer.append(tab+"  null");
    buffer.append(" "+rpar);
    buffer.append(" "+lcha);
    buffer.append("\n");
    buffer.append(tab);
      if (statements != null)
        buffer.append(statements.toString(" "));
      else
        buffer.append(tab+"  null");
    buffer.append(" "+tab+rcha);
    buffer.append("\n");
    return buffer.toString();
  }
}
