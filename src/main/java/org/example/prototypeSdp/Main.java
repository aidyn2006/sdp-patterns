package org.example.prototypeSdp;



public class Main {
    public static void main(String[] args) {
        TemplateDocument document=new TemplateDocument();
        document.setTitle("Kemel Adam");
        document.setPages("200");
        document.setText("Ote kushti kitap");

        System.out.println("Original: "+document);

        TemplateDocument document1=document.cloneDocument();
        document1.setText("modifyed text");

        System.out.println("Clone: "+document1);

    }
}
