package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@CdsName("AdminService.Products")
public interface Products extends CdsData {
  String MODIFIED_AT = "modifiedAt";

  String LOCALIZED = "localized";

  String TITLE = "title";

  String CURRENCY_CODE = "currency_code";

  String CREATED_AT = "createdAt";

  String DESCR = "descr";

  String TEXTS = "texts";

  String CATEGORY_ID = "category_ID";

  String CREATED_BY = "createdBy";

  String PRICE = "price";

  String MODIFIED_BY = "modifiedBy";

  String CURRENCY = "currency";

  String ID = "ID";

  String STOCK = "stock";

  String CATEGORY = "category";

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  ProductsTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  String getTitle();

  void setTitle(String title);

  @CdsName(CURRENCY_CODE)
  String getCurrencyCode();

  @CdsName(CURRENCY_CODE)
  void setCurrencyCode(String currencyCode);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  String getDescr();

  void setDescr(String descr);

  List<ProductsTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  @CdsName(CATEGORY_ID)
  Integer getCategoryId();

  @CdsName(CATEGORY_ID)
  void setCategoryId(Integer categoryId);

  String getCreatedBy();

  void setCreatedBy(String createdBy);

  BigDecimal getPrice();

  void setPrice(BigDecimal price);

  String getModifiedBy();

  void setModifiedBy(String modifiedBy);

  Currencies getCurrency();

  void setCurrency(Map<String, ?> currency);

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Integer getStock();

  void setStock(Integer stock);

  Categories getCategory();

  void setCategory(Map<String, ?> category);

  static Products create() {
    return Struct.create(Products.class);
  }
}
