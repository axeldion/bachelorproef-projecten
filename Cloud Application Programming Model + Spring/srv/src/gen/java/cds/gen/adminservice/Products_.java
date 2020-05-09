package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.Function;

@CdsName("AdminService.Products")
public interface Products_ extends StructuredType<Products_> {
  String CDS_NAME = "AdminService.Products";

  ElementRef<Instant> modifiedAt();

  ProductsTexts_ localized();

  ProductsTexts_ localized(Function<ProductsTexts_, CqnPredicate> filter);

  ElementRef<String> title();

  ElementRef<String> currency_code();

  ElementRef<Instant> createdAt();

  ElementRef<String> descr();

  ProductsTexts_ texts();

  ProductsTexts_ texts(Function<ProductsTexts_, CqnPredicate> filter);

  ElementRef<Integer> category_ID();

  ElementRef<String> createdBy();

  ElementRef<BigDecimal> price();

  ElementRef<String> modifiedBy();

  Currencies_ currency();

  Currencies_ currency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> ID();

  ElementRef<Integer> stock();

  Categories_ category();

  Categories_ category(Function<Categories_, CqnPredicate> filter);
}
