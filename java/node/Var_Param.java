/*
 * Generated by classgen, version 1.5
 * 11/10/13 6:18 PM
 */
package node;

public class Var_Param extends Form_Par {

  public Var_Dekl var_Dekl;

  public Var_Param (Var_Dekl var_Dekl) {
    this.var_Dekl = var_Dekl;
    if (var_Dekl != null) var_Dekl.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (var_Dekl != null) var_Dekl.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (var_Dekl != null) var_Dekl.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (var_Dekl != null) var_Dekl.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Var_Param(\n");
      if (var_Dekl != null)
        buffer.append(var_Dekl.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Var_Param]");
    return buffer.toString();
  }
}
