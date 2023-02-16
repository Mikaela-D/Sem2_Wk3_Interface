package ie.atu.productv5;

import ie.atu.productv5.Book;
import ie.atu.productv5.Music;
import ie.atu.productv5.Product;
import ie.atu.productv5.*;

public class ProductDB {
    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.50);
            myMusic.setLabel("Columbia Group");
            myMusic.setArtist("Pink Floyd");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Latest Samsung TV");
            myTV.setPrice(999.99);
            myTV.setScreen_size("60 inches");
            myTV.setManufacture("Samsung TV");
            p =myTV;
        } else if (productCode.equalsIgnoreCase("horse")) {
            Horse myHorse = new Horse();
            myHorse.setType(productCode);
            myHorse.setPrice(8.50);
            myHorse.setAge(23);
            myHorse.setBreed("Arabian");
            myHorse.setDam("Mary");
            myHorse.setSire("Jon");
            myHorse.setHeight(178);
            p = myHorse;
        } else if (productCode.equalsIgnoreCase("dog")) {
            Dog myDog = new Dog();
            myDog.setType(productCode);
            myDog.setPrice(5.99);
            myDog.setAge(5);
            myDog.setBreed("German");
            myDog.setVaccination("Yes");
            myDog.setShedding("No");
            myDog.setNeutered("Yes");
            p = myDog;
        }
        return p;
    }
}
