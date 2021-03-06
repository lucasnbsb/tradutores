/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class ListParam0 extends ListParam {

  public Parametro parametro;
  public String virgula;
  public ListParam listParam;

  public ListParam0 (Parametro parametro, String virgula, ListParam listParam) {
    this.parametro = parametro;
    if (parametro != null) parametro.setParent(this);
    this.virgula = virgula;
    this.listParam = listParam;
    if (listParam != null) listParam.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (parametro != null) parametro.accept(visitor);
    if (listParam != null) listParam.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (parametro != null) parametro.traverseTopDown(visitor);
    if (listParam != null) listParam.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (parametro != null) parametro.traverseBottomUp(visitor);
    if (listParam != null) listParam.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    if (parametro != null)
      buffer.append(parametro.toString("  "+tab));
    buffer.append("  "+tab+virgula);
    if (listParam != null)
      buffer.append(listParam.toString("  "+tab));
    buffer.append(tab);
    return buffer.toString();
  }
}
