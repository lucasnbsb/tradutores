/*
 * Generated by classgen, version 1.5
 * 11/10/13 6:18 PM
 */
package node;

public class Dekl implements SyntaxNode {

  private SyntaxNode parent;
  public boolean istvarParam;
  public boolean istformParam;

  public Dekl () {
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
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Dekl(\n");
    buffer.append(tab);
    buffer.append(") [Dekl]");
    return buffer.toString();
  }
}
