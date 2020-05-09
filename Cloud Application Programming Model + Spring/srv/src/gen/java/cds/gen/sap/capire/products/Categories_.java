package cds.gen.sap.capire.products;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("sap.capire.products.Categories")
public interface Categories_ extends StructuredType<Categories_> {
  String CDS_NAME = "sap.capire.products.Categories";

  ElementRef<String> descr();

  Categories_ parent();

  Categories_ parent(Function<Categories_, CqnPredicate> filter);

  CategoriesTexts_ texts();

  CategoriesTexts_ texts(Function<CategoriesTexts_, CqnPredicate> filter);

  Categories_ children();

  Categories_ children(Function<Categories_, CqnPredicate> filter);

  ElementRef<Integer> parent_ID();

  ElementRef<String> name();

  CategoriesTexts_ localized();

  CategoriesTexts_ localized(Function<CategoriesTexts_, CqnPredicate> filter);

  ElementRef<Integer> ID();
}
