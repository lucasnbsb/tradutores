/*
 * Generated by classgen, version 1.5
 * 11/10/13 6:18 PM
 */
package node;

public class IdentAusdr extends Var {

  public String ident;

  public IdentAusdr (String ident) {
    this.ident = ident;
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

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("IdentAusdr(\n");
    buffer.append("  "+tab+ident);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [IdentAusdr]");
    return buffer.toString();
  }
}
