package org.earthcube.geosoft.software.classes.sn;

import org.earthcube.geosoft.util.URIEntity;

public class SNAssumption extends URIEntity {
  private static final long serialVersionUID = 1L;
  
  private String categoryId;
  private String note;
  
  public SNAssumption(String id) {
    super(id);
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
