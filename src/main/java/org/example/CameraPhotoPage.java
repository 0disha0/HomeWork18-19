package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CameraPhotoPage extends Utils{

    public void toGetProductName(){
        List<WebElement> productTitle= driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println(productTitle.size());
        for(WebElement element :productTitle){
            System.out.println(element.getText());
        }
//
//        List<String> studentsNameList = new ArrayList<>();
//        studentsNameList.add("Daishu");
//        studentsNameList.add("Ganddu");
//        for (String s : studentsNameList) {
//            System.out.println(s);
//        }

    }
}
