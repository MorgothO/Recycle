package com.demotxt.myapp.recyclerview;


public class Book implements Comparable{

     String Title;
     String Category ;
     String Description ;
     int price;
     int Thumbnail ;

    public Book() {
    }

    public Book(String title, String category, String description, int thumbnail,int p) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        price = p;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }



 private int getprice()
 {
     return this.price;

 }
    @Override
    public int compareTo(Object comparestu) {
       comparestu = (Book)comparestu;
        int compareage=((Book)comparestu).getprice();
        /* For Ascending order*/
        return this.price-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

}
