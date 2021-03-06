/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class IdentList0 extends IdentList {

  public String nome;
  public String virgula;
  public IdentList identList;

  public IdentList0 (String nome, String virgula, IdentList identList) {
    this.nome = nome;
    this.virgula = virgula;
    this.identList = identList;
    if (identList != null) identList.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (identList != null) identList.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (identList != null) identList.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (identList != null) identList.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    
    buffer.append("  "+tab+nome);
    buffer.append("\n");
    buffer.append("  "+tab+virgula);
    buffer.append("\n");
      if (identList != null)
        buffer.append(identList.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [IdentList0]");
    return buffer.toString();
  }
}
