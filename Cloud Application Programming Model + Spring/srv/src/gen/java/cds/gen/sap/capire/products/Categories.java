package cds.gen.sap.capire.products;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("sap.capire.products.Categories")
public interface Categories extends CdsData {
  String DESCR = "descr";

  String PARENT = "parent";

  String TEXTS = "texts";

  String CHILDREN = "children";

  String PARENT_ID = "parent_ID";

  String NAME = "name";

  String LOCALIZED = "localized";

  String ID = "ID";

  String getDescr();

  void setDescr(String descr);

  Categories getParent();

  void setParent(Map<String, ?> parent);

  List<CategoriesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  List<Categories> getChildren();

  void setChildren(List<? extends Map<String, ?>> children);

  @CdsName(PARENT_ID)
  Integer getParentId();

  @CdsName(PARENT_ID)
  void setParentId(Integer parentId);

  String getName();

  void setName(String name);

  CategoriesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  static Categories create() {
    return Struct.create(Categories.class);
  }
}
