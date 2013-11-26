/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class VarDefinition implements SyntaxNode {

  private SyntaxNode parent;
  public String nome;
  public IdentList identList;

  public VarDefinition (String nome, IdentList identList) {
    this.nome = nome;
    this.identList = identList;
    if (identList != null) identList.setParent(this);
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

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("VarDefinition(\n");
    buffer.append("  "+tab+nome);
    buffer.append("\n");
      if (identList != null)
        buffer.append(identList.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [VarDefinition]");
    return buffer.toString();
  }
}
