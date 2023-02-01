package model;

public class Category extends MainCategory{


    public Category(int seat, int sofa, String genre) {
        super(seat, sofa);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    String Genre;

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Genre:" + this.getGenre());
    }


}