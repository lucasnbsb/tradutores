/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Field_var_dec implements SyntaxNode {

  private SyntaxNode parent;
  public String mod;
  public String tipo;
  public String nome;
  public String ptvirgula;

  public Field_var_dec (String mod, String tipo, String nome, String ptvirgula) {
    this.mod = mod;
    this.tipo = tipo;
    this.nome = nome;
    this.ptvirgula = ptvirgula;
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
    buffer.append(" "+mod);
    buffer.append(" "+tipo);
    buffer.append(" "+nome);
    buffer.append(" "+ptvirgula);
    return buffer.toString();
  }
}
