package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("AdminService.Currencies")
public interface Currencies_ extends StructuredType<Currencies_> {
  String CDS_NAME = "AdminService.Currencies";

  ElementRef<String> descr();

  ElementRef<String> symbol();

  ElementRef<String> code();

  CurrenciesTexts_ texts();

  CurrenciesTexts_ texts(Function<CurrenciesTexts_, CqnPredicate> filter);

  ElementRef<String> name();

  CurrenciesTexts_ localized();

  CurrenciesTexts_ localized(Function<CurrenciesTexts_, CqnPredicate> filter);
}
