package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("AdminService.Products_texts")
public interface ProductsTexts extends CdsData {
  String DESCR = "descr";

  String ID = "ID";

  String LOCALE = "locale";

  String TITLE = "title";

  String getDescr();

  void setDescr(String descr);

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getLocale();

  void setLocale(String locale);

  String getTitle();

  void setTitle(String title);

  static ProductsTexts create() {
    return Struct.create(ProductsTexts.class);
  }
}
