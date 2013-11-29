/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class DeclaracaoMetodo1 extends DeclaracaoMetodo {

  public String mod;
  public String staticKeyword;
  public String tipo;
  public String nome;
  public String lpar;
  public ListParam listParam;
  public String rpar;
  public String lcha;
  public Statements statements;
  public String rcha;

  public DeclaracaoMetodo1 (String mod, String staticKeyword, String tipo, String nome, String lpar, ListParam listParam, String rpar, String lcha, Statements statements, String rcha) {
    this.mod = mod;
    this.staticKeyword = staticKeyword;
    this.tipo = tipo;
    this.nome = nome;
    this.lpar = lpar;
    this.listParam = listParam;
    if (listParam != null) listParam.setParent(this);
    this.rpar = rpar;
    this.lcha = lcha;
    this.statements = statements;
    if (statements != null) statements.setParent(this);
    this.rcha = rcha;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (listParam != null) listParam.accept(visitor);
    if (statements != null) statements.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (listParam != null) listParam.traverseTopDown(visitor);
    if (statements != null) statements.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (listParam != null) listParam.traverseBottomUp(visitor);
    if (statements != null) statements.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(mod);
    buffer.append(" "+staticKeyword);
    buffer.append(" "+tipo);
    buffer.append(" "+nome);
    buffer.append(" "+lpar);
    if (listParam != null)
      buffer.append(listParam.toString(" "));
    buffer.append(" "+rpar);
    buffer.append(" "+lcha);
    if (statements != null)
      buffer.append(statements.toString(" "));
    buffer.append(" "+rcha);
    return buffer.toString();
  }
}
