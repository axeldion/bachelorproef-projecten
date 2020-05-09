package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;

@CdsName("AdminService.Categories_texts")
public interface CategoriesTexts extends CdsData {
  String DESCR = "descr";

  String NAME = "name";

  String ID = "ID";

  String LOCALE = "locale";

  String getDescr();

  void setDescr(String descr);

  String getName();

  void setName(String name);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getLocale();

  void setLocale(String locale);

  static CategoriesTexts create() {
    return Struct.create(CategoriesTexts.class);
  }
}
