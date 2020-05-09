package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("AdminService.Products_texts")
public interface ProductsTexts_ extends StructuredType<ProductsTexts_> {
  String CDS_NAME = "AdminService.Products_texts";

  ElementRef<String> descr();

  ElementRef<String> ID();

  ElementRef<String> locale();

  ElementRef<String> title();
}
