package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.common.Currencies_texts")
public interface CurrenciesTexts extends CdsData {
  String DESCR = "descr";

  String CODE = "code";

  String NAME = "name";

  String LOCALE = "locale";

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  String getName();

  void setName(String name);

  String getLocale();

  void setLocale(String locale);

  static CurrenciesTexts create() {
    return Struct.create(CurrenciesTexts.class);
  }
}
