/*
 * Generated by classgen, version 1.5
 * 11/10/13 6:18 PM
 */
package node;

public class Proc_Dekl implements SyntaxNode {

  private SyntaxNode parent;
  public String ident;
  public Form_Par_Seq form_Par_Seq;
  public Block block;

  public Proc_Dekl (String ident, Form_Par_Seq form_Par_Seq, Block block) {
    this.ident = ident;
    this.form_Par_Seq = form_Par_Seq;
    if (form_Par_Seq != null) form_Par_Seq.setParent(this);
    this.block = block;
    if (block != null) block.setParent(this);
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
    if (form_Par_Seq != null) form_Par_Seq.accept(visitor);
    if (block != null) block.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (form_Par_Seq != null) form_Par_Seq.traverseTopDown(visitor);
    if (block != null) block.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (form_Par_Seq != null) form_Par_Seq.traverseBottomUp(visitor);
    if (block != null) block.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Proc_Dekl(\n");
    buffer.append("  "+tab+ident);
    buffer.append("\n");
      if (form_Par_Seq != null)
        buffer.append(form_Par_Seq.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (block != null)
        buffer.append(block.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Proc_Dekl]");
    return buffer.toString();
  }
}
