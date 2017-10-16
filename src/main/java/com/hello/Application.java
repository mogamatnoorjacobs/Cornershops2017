package com.hello;

import com.hello.Domain.*;
import com.hello.Factory.*;
import com.hello.Services.ServiceImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fatimam on 04/09/2017.
 */


//@EnableAutoConfiguration
@SpringBootApplication

@RequestMapping(path="/hello")
public class Application {

    //*************Address**************************************************************
    @Autowired
    private AddressServiceImpl addressService;

    @GetMapping(path = "/addAddress/{addressID},{streetNumber},{streetName},{area},{suburb},{city}")
    public
    @ResponseBody
    String addAddress(@PathVariable String addressID, @PathVariable String streetNumber, @PathVariable String streetName, @PathVariable String area, @PathVariable String suburb, @PathVariable String city) {
        Address address = AddressFactory.getAddress(addressID, streetNumber, streetName, area, suburb, city);
        addressService.save(address);
        return "Saved";
    }

    @GetMapping(path = "/addUpdateAddress")
    public
    @ResponseBody
    String addUpdateAddress(String addressID, String streetNumber, String streetName, String area,  String suburb,String city) {
        Address address = AddressFactory.getAddress(addressID, streetNumber, streetName, area, suburb, city);
        addressService.save(address);
        return "Saved";
    }

//    @GetMapping(path = "/findAddress/{addressID}")
//    public
//    @ResponseBody
//    String findAddress(@PathVariable String addressID) {
//
//        Address address = addressService.findById(addressID);
//
//        return address.getAddressId() + " " + address.getStreetName();
//    }


    @GetMapping(path = "/findAddressById")
    public
    @ResponseBody
    Address findAddressById(String addressID) {

        Address address = addressService.findById(addressID);

        return address;
    }




    @GetMapping(path = "/updateAddress")
    public
    @ResponseBody
    String updateAddress( String addressID,  String streetNumber,  String streetName,  String area,  String suburb, String city) {

        Address address = AddressFactory.getAddress(addressID, streetNumber, streetName, area, suburb, city);
        addressService.update(address);
        return "Address updated";
    }

    @GetMapping(path = "/deleteAddress")
    public
    @ResponseBody
    String deleteAddress( String addressID) {

        addressService.delete(addressID);

        return "Address deleted";
    }
//*************MainCategories**************************************************************
    @Autowired
    private MainCategoriesServiceImpl mainCategoriesService;

    Map<String, String> mainCategoriesValues;

    @GetMapping(path = "/addMainCategories")

    public
    @ResponseBody
    String addMainCategories(String categoryId,String category) {

        mainCategoriesValues = new HashMap<String, String>();

        mainCategoriesValues.put("categoryId", categoryId);

        mainCategoriesValues.put("category", category);

        MainCategories mainCategories = MainCategoriesFactory.getMainCategories(mainCategoriesValues);
        mainCategoriesService.save(mainCategories);
        return "Saved";
    }

    @GetMapping(path = "/findMainCategories")
    public
    @ResponseBody
    MainCategories findMainCategories(String mainCategoriesID) {

        MainCategories mainCategories = mainCategoriesService.findById(mainCategoriesID);

        return mainCategories;
    }

    @GetMapping(path = "/updateMainCategories")
    public
    @ResponseBody
    String updateMainCategories(String categoryId,String category) {

        mainCategoriesValues = new HashMap<String, String>();

        mainCategoriesValues.put("categoryId", categoryId);

        mainCategoriesValues.put("category", category);

        MainCategories mainCategories = MainCategoriesFactory.getMainCategories(mainCategoriesValues);
        mainCategoriesService.save(mainCategories);
        return "Saved";
    }

    @GetMapping(path = "/deleteMainCategories/")
    public
    @ResponseBody
    String deleteMainCategories(String categoryId) {

        mainCategoriesService.delete(categoryId);

        return "Main Category deleted";
    }


    //*************SubCategories**************************************************************

    @Autowired
    private SubCategoriesServiceImpl subCategoriesService;

    Map<String, String> subCategoriesValues;

    @GetMapping(path = "/addSubCategories")

    public
    @ResponseBody
    String addSubCategories(String subCategoryId,String subCategory){//,String mainCategoriesId) {

        subCategoriesValues = new HashMap<String, String>();

        subCategoriesValues.put("subCategoryId", subCategoryId);

        subCategoriesValues.put("subCategory", subCategory);
       // subCategoriesValues.put("mainCategoriesId", mainCategoriesId);

        SubCategories subCategories = SubCategoriesFactory.getSubCategories(subCategoriesValues);
        subCategoriesService.save(subCategories);
        return "Saved";
    }

    @GetMapping(path = "/findSubCategories")
    public
    @ResponseBody
    String findSubCategories(String subCategoriesID) {

        SubCategories subCategories = subCategoriesService.findById(subCategoriesID);

        return subCategories.getCatergoryId() + " " + subCategories.getCategory();
    }

    @GetMapping(path = "/updateSubCategories")

    public
    @ResponseBody
    String updateSubCategories( String subCategoryId,String subCategory){//,String mainCategoriesId) {

        subCategoriesValues = new HashMap<String, String>();

        subCategoriesValues.put("subCategoryId", subCategoryId);

        subCategoriesValues.put("subCategory", subCategory);
        //subCategoriesValues.put("mainCategoriesId", mainCategoriesId);

        SubCategories subCategories = SubCategoriesFactory.getSubCategories(subCategoriesValues);
        subCategoriesService.save(subCategories);
        return "Updated Subcategories";
    }

    @GetMapping(path = "/deleteSubCategories")
    public
    @ResponseBody
    String deleteSubCategories(String subCategoryId) {

        subCategoriesService.delete(subCategoryId);

        return "Sub Category deleted";
    }

    //*************Products**************************************************************

    @Autowired
    private ProductsServiceImpl productsService;

    Map<String, String> productsValues;

    @GetMapping(path = "/addProducts")

    public
    @ResponseBody
    String addProducts( String productID, String productName,String productDescription, String subCategoriesId) {

        productsValues = new HashMap<String, String>();

        productsValues.put("productID", productID);

        productsValues.put("productName", productName);
        productsValues.put("productDescription", productDescription);
        productsValues.put("subCategoriesId", subCategoriesId);

        Products products = ProductsFactory.getProducts(productsValues);
        productsService.save(products);
        return "Saved";
    }

    @GetMapping(path = "/findProducts")
    public
    @ResponseBody
    String findProducts(String productID) {

        Products products = productsService.findById(productID);

        return products.getProductID() + " " + products.getProductName() + " " + products.getProductDescription() + " " + products.getSubCategoriesId();
    }

    @GetMapping(path = "/updateProducts")

    public
    @ResponseBody
    String updateProducts( String productID,  String productName,  String productDescription,  String subCategoriesId) {

        productsValues = new HashMap<String, String>();

        productsValues.put("productID", productID);

        productsValues.put("productName", productName);
        productsValues.put("productDescription", productDescription);
        productsValues.put("subCategoriesId", subCategoriesId);

        Products products = ProductsFactory.getProducts(productsValues);
        productsService.save(products);
        return "Saved";
    }

    @GetMapping(path = "/deleteProducts")
    public
    @ResponseBody
    String deleteProducts(String productID) {

        productsService.delete(productID);

        return "Product deleted";
    }


    //*************PersonDetails**************************************************************
    @Autowired
    private PersonDetailsServiceImpl personDetailsService;

    @GetMapping(path = "/addPersonDetails")

    public
    @ResponseBody
    String addPersonDetails(String personID,String firstName, String lastName) {

        PersonDetails personDetails = PersonDetailsFactory.getPersonDetails(personID,firstName,lastName);
        personDetailsService.save(personDetails);
        return "Saved";
    }


    @GetMapping(path = "/addPersonDetailsTest/{personID},{firstName},{lastName}")

    public
    @ResponseBody
    String addPersonDetailsTest(@PathVariable String personID,@PathVariable String firstName, @PathVariable String lastName) {

        PersonDetails personDetails = PersonDetailsFactory.getPersonDetails(personID,firstName,lastName);
        personDetailsService.save(personDetails);
        return "Saved";
    }

    @GetMapping(path = "/findPersonDetails")
    public
    @ResponseBody
    String findPersonDetails(String personID) {

        PersonDetails personDetails = personDetailsService.findById(personID);

        return personDetails.getPersonID() + " " + personDetails.getFirstName() + " " + personDetails.getLastName();
    }

    @GetMapping(path = "/updatePersonDetails")

    public
    @ResponseBody
    String updatePersonDetails( String personID,  String firstName, String lastName) {

        PersonDetails personDetails = PersonDetailsFactory.getPersonDetails(personID,firstName,lastName);
        personDetailsService.save(personDetails);
        return "Saved";
    }

    @GetMapping(path = "/deletePersonDetails{id}")
    public
    @ResponseBody
    String deletePersonDetails(String personID) {

        personDetailsService.delete(personID);

        return "Person deleted";
    }


    //*************BusinessDetails*********************************
    @Autowired
    private BusinessDetailsServiceImpl businessDetailsService;

    Map<String, String> businessDetailsValues;

    @GetMapping(path = "/addBusinessDetails")
    public
    @ResponseBody
    String addBusinessDetails( String businessId, String businessName,  String businessDescription) {
        businessDetailsValues = new HashMap<String, String>();

        businessDetailsValues.put("businessId", businessId);
        businessDetailsValues.put("businessName", businessName);
        businessDetailsValues.put("businessDescription", businessDescription);
        BusinessDetails businessDetails = BusinessDetailsFactory.getBusinessDetails(businessDetailsValues);
        businessDetailsService.save(businessDetails);
        return "Saved";
    }

    @GetMapping(path = "/findBusinessDetails")
    public
    @ResponseBody
    String findBusinessDetails(String businessId) {

        BusinessDetails businessDetails = businessDetailsService.findById(businessId);

        return businessDetails.getBusinessId() + " " + businessDetails.getBusinessName() + " " + businessDetails.getBusinessDescription();
    }

    @GetMapping(path = "/updateBusinessDetails")
    public
    @ResponseBody
    String updateBusinessDetails(String businessId, String businessName, String businessDescription) {
        businessDetailsValues = new HashMap<String, String>();

        businessDetailsValues.put("businessId", businessId);
        businessDetailsValues.put("businessName", businessName);
        businessDetailsValues.put("businessDescription", businessDescription);
        BusinessDetails businessDetails = BusinessDetailsFactory.getBusinessDetails(businessDetailsValues);
        businessDetailsService.save(businessDetails);
        return "Saved";
    }

    @GetMapping(path = "/deleteBusinessDetails")
    public
    @ResponseBody
    String deleteBusinessDetails(String businessId) {

        productsService.delete(businessId);

        return "Business deleted";
    }

    //*************ContactDetails*********************************
    @Autowired
    private ContactDetailsServiceImpl contactDetailsService;

    Map<String, String> contactDetailsValues;

    @GetMapping(path = "/addContactDetails")
    public
    @ResponseBody
    String addContactDetails(String contactID, String cellNumber,String homeNumber,String emailAddress, String website, String otherLinks) {
        contactDetailsValues = new HashMap<String, String>();
        contactDetailsValues.put("contactID", contactID);
        contactDetailsValues.put("cellNumber", cellNumber);
        contactDetailsValues.put("homeNumber", homeNumber);
        contactDetailsValues.put("emailAddress", emailAddress);
        contactDetailsValues.put("website", website);
        contactDetailsValues.put("otherLinks", otherLinks);

        ContactDetails contactDetails = ContactDetailsFactory.getContactDetails(contactDetailsValues);
        contactDetailsService.save(contactDetails);
        return "Contact Details Saved";
    }

    @GetMapping(path = "/findContactDetails")
    public
    @ResponseBody
    String findContactDetails(String contactID) {

        ContactDetails contactDetails = contactDetailsService.findById(contactID);

        return contactDetails.getContactID() + " " + contactDetails.getCellNumber() + " " + contactDetails.getHomeNumber() + " " + contactDetails.getEmailAddress() + " " + contactDetails.getWebsite() + " " + contactDetails.getOtherLinks();
    }


    @GetMapping(path = "/updateContactDetails")
    public
    @ResponseBody
    String updateContactDetails(String contactID, String cellNumber, String homeNumber, String emailAddress,String website,  String otherLinks) {
        contactDetailsValues = new HashMap<String, String>();
        contactDetailsValues.put("contactID", contactID);
        contactDetailsValues.put("cellNumber", cellNumber);
        contactDetailsValues.put("homeNumber", homeNumber);
        contactDetailsValues.put("emailAddress", emailAddress);
        contactDetailsValues.put("website", website);
        contactDetailsValues.put("otherLinks", otherLinks);

        ContactDetails contactDetails = ContactDetailsFactory.getContactDetails(contactDetailsValues);
        contactDetailsService.save(contactDetails);
        return "Contact Details Saved";
    }


    @GetMapping(path = "/deleteContactDetails")
    public
    @ResponseBody
    String deleteContactDetails(String contactID) {

        contactDetailsService.delete(contactID);

        return "Contact deleted";
    }

    //*************ItemDetails*********************************
//    @Autowired
//    private ItemServiceImpl itemService;
//
//
//    @GetMapping(path = "/addItems")
//    public
//    @ResponseBody
//    String addItem(String itemID, PersonDetails personDetails, Address address, BusinessDetails businessDetails, ContactDetails contactDetails,MainCategories mainCategories,SubCategories subCategories) {
//        Item item = ItemFactory.getItem(itemID,personDetails,address, businessDetails, contactDetails,mainCategories,subCategories);
//        itemService.save(item);
//        return "Item Details Saved";
//    }
//
//    @GetMapping(path = "/findItem")
//    public
//    @ResponseBody
//    String findItem(String itemID) {
//
//        Item item = itemService.findById(itemID);
//
//        return item.getItemID() +" "+ item.getBusinessDetails()+" "+ item.getPersonDetails()+" "+ item.getAddress()+" "+item.getContactDetails()+" "+item.getMainCategories()+" "+item.getSubCategories();
//    }
//
//
//
//    @GetMapping(path = "/updateItem")
//    public
//    @ResponseBody
//    String updateItem(String itemID, PersonDetails personDetails, Address address, BusinessDetails businessDetails, ContactDetails contactDetails,MainCategories mainCategories,SubCategories subCategories) {
//        Item item = ItemFactory.getItem(itemID,personDetails,address, businessDetails, contactDetails,mainCategories,subCategories);
//        itemService.save(item);
//        return "Item Details Saved";
//    }
//
//
//    @GetMapping(path = "/deleteItem")
//    public
//    @ResponseBody
//    String deleteItem(String itemID) {
//
//        itemService.delete(itemID);
//
//        return "Item deleted";
//    }

    //*************ItemDetails Revised*********************************

//    @GetMapping(path = "/addItem")
//    public
//
//    String addItem(PersonDetails personDetails, Address address, BusinessDetails businessDetails, ContactDetails contactDetails,MainCategories mainCategories,SubCategories subCategories) {
//     //   Item item = ItemFactory.getItem(personDetails,address, businessDetails, contactDetails,mainCategories,subCategories);
     //  addPersonDetails(personDetails.getPersonID(),personDetails.getFirstName(),personDetails.getLastName());
//       addUpdateAddress(address.getAddressId(),address.getStreetNumber(),address.getStreetName(),address.getArea(),address.getSuburb(),address.getCity());
//       addBusinessDetails(businessDetails.getBusinessId(),businessDetails.getBusinessName(),businessDetails.getBusinessDescription());
//       addContactDetails(contactDetails.getContactID(),contactDetails.getCellNumber(),contactDetails.getHomeNumber(),contactDetails.getEmailAddress(),contactDetails.getWebsite(),contactDetails.getOtherLinks());
//       addMainCategories(mainCategories.getCatergoryId(),mainCategories.getCategory());
//       addSubCategories(subCategories.getCatergoryId(),subCategories.getCategory());
//
//        return "Item Details Saved";
//    }


    @Autowired
    private PersonDetailsServiceImpl personDetailsServices;

    @GetMapping(path = "/addItemPersonalDetails")

    public
    @ResponseBody


    String addItemPersonalDetails(PersonDetails personDetails) {

        Item item=ItemFactory.getPersonItem(personDetails);

        PersonDetails personDetail = PersonDetailsFactory.getPersonDetails(item.getPersonDetails().getPersonID(),item.getPersonDetails().getFirstName(),item.getPersonDetails().getLastName());
        personDetailsServices.save(personDetail);
        return "Saved";
    }


    //mysql workbench
    public static void main(String[] args) throws Exception {
       // ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/application.properties");

        SpringApplication.run(Application.class, args);
    }
}
