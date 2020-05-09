package cds.gen.sap.capire.products;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;

@CdsName("sap.capire.products.Categories_texts")
public interface CategoriesTexts_ extends StructuredType<CategoriesTexts_> {
  String CDS_NAME = "sap.capire.products.Categories_texts";

  ElementRef<String> descr();

  ElementRef<String> name();

  ElementRef<Integer> ID();

  ElementRef<String> locale();
}
