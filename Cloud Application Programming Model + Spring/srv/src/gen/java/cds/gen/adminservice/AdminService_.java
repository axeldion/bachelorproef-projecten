package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("AdminService")
public interface AdminService_ {
  String CDS_NAME = "AdminService";

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<CategoriesTexts_> CATEGORIES_TEXTS = CategoriesTexts_.class;

  Class<Products_> PRODUCTS = Products_.class;

  Class<ProductsTexts_> PRODUCTS_TEXTS = ProductsTexts_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;

  Class<Categories_> CATEGORIES = Categories_.class;
}
