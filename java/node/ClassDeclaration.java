/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class ClassDeclaration implements SyntaxNode {

  private SyntaxNode parent;
  public String pub;
  public String cla;
  public String nome;
  public String lcol;
  public ClassStatements classStatements;
  public String rcol;

  public ClassDeclaration (String pub, String cla, String nome, String lcol, ClassStatements classStatements, String rcol) {
    this.pub = pub;
    this.cla = cla;
    this.nome = nome;
    this.lcol = lcol;
    this.classStatements = classStatements;
    if (classStatements != null) classStatements.setParent(this);
    this.rcol = rcol;
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
    if (classStatements != null) classStatements.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (classStatements != null) classStatements.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (classStatements != null) classStatements.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("ClassDeclaration(\n");
    buffer.append("  "+tab+pub);
    buffer.append("\n");
    buffer.append("  "+tab+cla);
    buffer.append("\n");
    buffer.append("  "+tab+nome);
    buffer.append("\n");
    buffer.append("  "+tab+lcol);
    buffer.append("\n");
      if (classStatements != null)
        buffer.append(classStatements.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append("  "+tab+rcol);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [ClassDeclaration]");
    return buffer.toString();
  }
}
