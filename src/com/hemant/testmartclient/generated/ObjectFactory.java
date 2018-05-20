
package com.hemant.testmartclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hemant.testmartclient.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProductResponse_QNAME = new QName("http://testmart.com", "addProductResponse");
    private final static QName _GetProductsV2_QNAME = new QName("http://testmart.com", "getProductsV2");
    private final static QName _GetProductsV2Response_QNAME = new QName("http://testmart.com", "getProductsV2Response");
    private final static QName _FetchProductCategories_QNAME = new QName("http://testmart.com", "fetchProductCategories");
    private final static QName _FetchProductCategoriesResponse_QNAME = new QName("http://testmart.com", "fetchProductCategoriesResponse");
    private final static QName _Product_QNAME = new QName("http://testmart.com", "Product");
    private final static QName _AddProduct_QNAME = new QName("http://testmart.com", "addProduct");
    private final static QName _GetProducts_QNAME = new QName("http://testmart.com", "getProducts");
    private final static QName _GetProductsResponse_QNAME = new QName("http://testmart.com", "getProductsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hemant.testmartclient.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link FetchProductCategoriesResponse }
     * 
     */
    public FetchProductCategoriesResponse createFetchProductCategoriesResponse() {
        return new FetchProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link FetchProductCategories }
     * 
     */
    public FetchProductCategories createFetchProductCategories() {
        return new FetchProductCategories();
    }

    /**
     * Create an instance of {@link GetProductsV2Response }
     * 
     */
    public GetProductsV2Response createGetProductsV2Response() {
        return new GetProductsV2Response();
    }

    /**
     * Create an instance of {@link GetProductsV2 }
     * 
     */
    public GetProductsV2 createGetProductsV2() {
        return new GetProductsV2();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "getProductsV2")
    public JAXBElement<GetProductsV2> createGetProductsV2(GetProductsV2 value) {
        return new JAXBElement<GetProductsV2>(_GetProductsV2_QNAME, GetProductsV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "getProductsV2Response")
    public JAXBElement<GetProductsV2Response> createGetProductsV2Response(GetProductsV2Response value) {
        return new JAXBElement<GetProductsV2Response>(_GetProductsV2Response_QNAME, GetProductsV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "fetchProductCategories")
    public JAXBElement<FetchProductCategories> createFetchProductCategories(FetchProductCategories value) {
        return new JAXBElement<FetchProductCategories>(_FetchProductCategories_QNAME, FetchProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "fetchProductCategoriesResponse")
    public JAXBElement<FetchProductCategoriesResponse> createFetchProductCategoriesResponse(FetchProductCategoriesResponse value) {
        return new JAXBElement<FetchProductCategoriesResponse>(_FetchProductCategoriesResponse_QNAME, FetchProductCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testmart.com", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

}
