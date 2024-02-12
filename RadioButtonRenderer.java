import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;

// RadioButtonEditor class implements DefaultCaret interface 
class RadioButtonEditor extends    DefaultCellEditor
                        implements ItemListener {
  private JRadioButton button;
  
  // public constractor
  public RadioButtonEditor(JCheckBox checkBox) {
    super(checkBox);
  }
  
  // to get the table content
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
    if (value==null) return null;
    button = (JRadioButton)value;
    button.addItemListener(this);
    return (Component)value;
  }
  // to get the call Editor value
  public Object getCellEditorValue() {
    button.removeItemListener(this);
    return button;
  }
  
  // to update change 
  public void itemStateChanged(ItemEvent e) {
    super.fireEditingStopped();
  }
}

public class RadioButtonRenderer implements TableCellRenderer {
	
	//to get the table component 
  public Component getTableCellRendererComponent(JTable table, Object value,
                   boolean isSelected, boolean hasFocus, int row, int column) {
    if (value==null) return null;
    return (Component)value;
  }
}
