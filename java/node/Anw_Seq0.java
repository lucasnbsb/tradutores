/*
 * Generated by classgen, version 1.5
 * 11/10/13 6:18 PM
 */
package node;

public class Anw_Seq0 extends Anw_Seq {

  public Anw anw;
  public Anw_Seq anw_Seq;

  public Anw_Seq0 (Anw anw, Anw_Seq anw_Seq) {
    this.anw = anw;
    if (anw != null) anw.setParent(this);
    this.anw_Seq = anw_Seq;
    if (anw_Seq != null) anw_Seq.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (anw != null) anw.accept(visitor);
    if (anw_Seq != null) anw_Seq.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (anw != null) anw.traverseTopDown(visitor);
    if (anw_Seq != null) anw_Seq.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (anw != null) anw.traverseBottomUp(visitor);
    if (anw_Seq != null) anw_Seq.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Anw_Seq0(\n");
      if (anw != null)
        buffer.append(anw.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (anw_Seq != null)
        buffer.append(anw_Seq.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Anw_Seq0]");
    return buffer.toString();
  }
}
