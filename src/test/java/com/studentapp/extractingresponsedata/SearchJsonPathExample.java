package com.studentapp.extractingresponsedata;

import org.junit.Test;

/**
 * Created by Jay
 */
public class SearchJsonPathExample {

    private static final String API_KEY = "75e3u4sgb2khg673cbv2gjup";


    // 1) Extract numItems
    @Test
    public void test001() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The total number of items are: ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 2) Extract query
    @Test
    public void test002() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The search query is: ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 3) Extract first productName by providing list index value
    @Test
    public void test003() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The product name is: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 4) Get the first map from imageEntities for the first product
    @Test
    public void test004() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The gift options under the first product are: ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 5)Print the size of items
    @Test
    public void test005() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The size of the items is: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 6) Get All the Names
    @Test
    public void test006() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The names of the products are:: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 7) Get the all the values for Name == Apple iPod touch 32GB  (Assorted Colors)
    @Test
    public void test007() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The values for item name Apple iPod touch 32GB  (Assorted Colors) are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 8) Get the sale price for Name == Apple iPod Touch 6th Generation 32GB Refurbished
    @Test
    public void test008() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The sale price is ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 9) Get the Names which have salePrice less than 200
    @Test
    public void test009() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The names of items that price is less than 200 are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 10) Get the msrp of items that Start with name = Ref
    @Test
    public void test010() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The msrp of items that start with Ref are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 11) Get the sale price of items that End with name =ed
    @Test
    public void test011() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The msrp of items that end with ed are: ");
        System.out.println("------------------End of Test---------------------------");
    }

}
