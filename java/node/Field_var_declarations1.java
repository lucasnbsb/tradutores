/*
 * Generated by classgen, version 1.5
 * 11/26/13 11:02 AM
 */
package node;

public class Field_var_declarations1 extends Field_var_declarations {

  public Field_var_dec field_var_dec;
  public Field_var_declarations field_var_declarations;

  public Field_var_declarations1 (Field_var_dec field_var_dec, Field_var_declarations field_var_declarations) {
    this.field_var_dec = field_var_dec;
    if (field_var_dec != null) field_var_dec.setParent(this);
    this.field_var_declarations = field_var_declarations;
    if (field_var_declarations != null) field_var_declarations.setParent(this);
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (field_var_dec != null) field_var_dec.accept(visitor);
    if (field_var_declarations != null) field_var_declarations.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (field_var_dec != null) field_var_dec.traverseTopDown(visitor);
    if (field_var_declarations != null) field_var_declarations.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (field_var_dec != null) field_var_dec.traverseBottomUp(visitor);
    if (field_var_declarations != null) field_var_declarations.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    
      if (field_var_dec != null)
        buffer.append(field_var_dec.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (field_var_declarations != null)
        buffer.append(field_var_declarations.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Field_var_declarations1]");
    return buffer.toString();
  }
}
