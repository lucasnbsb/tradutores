/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class ImportStatement implements SyntaxNode {

  private SyntaxNode parent;
  public String importKeyword;
  public String qualifiedName;
  public String ptvirgula;

  public ImportStatement (String importKeyword, String qualifiedName, String ptvirgula) {
    this.importKeyword = importKeyword;
    this.qualifiedName = qualifiedName;
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
    buffer.append(" "+importKeyword);
    buffer.append(" "+qualifiedName);
    buffer.append(" "+ptvirgula);
    return buffer.toString();
  }
}
