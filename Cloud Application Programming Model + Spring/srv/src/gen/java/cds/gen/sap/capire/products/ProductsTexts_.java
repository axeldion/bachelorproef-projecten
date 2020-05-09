package cds.gen.sap.capire.products;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.capire.products.Products_texts")
public interface ProductsTexts_ extends StructuredType<ProductsTexts_> {
  String CDS_NAME = "sap.capire.products.Products_texts";

  ElementRef<String> descr();

  ElementRef<String> ID();

  ElementRef<String> locale();

  ElementRef<String> title();
}
