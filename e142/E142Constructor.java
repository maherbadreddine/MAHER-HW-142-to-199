package org.example.e142;

class SyntaxTechnologies {

    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;


    public SyntaxTechnologies() {

    }


    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfSchool) {


        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfSchool;


    }

    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}

public class E142Constructor {
    public static void main(String[] args) {

        SyntaxTechnologies e = new SyntaxTechnologies("Syntax", 6, 2020, "07302020");
        SyntaxTechnologies e2 = new SyntaxTechnologies();

        e2.display();
        e.display();
    }

}