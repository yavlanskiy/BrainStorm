package test;

import org.testng.annotations.Test;

public class ParameterDataproviderWithClassLevel {
    @Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
    public void testMethod(String author,String searchKey) throws InterruptedException{
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
    }

    @Test
    public void testMethod2() throws InterruptedException{
        System.out.println("Welcome");
    }
}
