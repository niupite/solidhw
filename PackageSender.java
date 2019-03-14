package io.codelex.solidexamples;

public class PackageSender {

    public static void main(String[] args) {

        PostalService postalService = new PostalService();
        postalService.SendPackage(
                "Janis", "Liepins", "200196-77299",
                "Marta", "Ozola", "121277-11223",
                "LV-1010", "Latvia", "Riga", "Brivibas", 100);
        
        postalService.SendPackage(
                "Gatis", "Kandis", "aaa912-7299",
                "Jan88", "Berzins", "33219-7 3932",
                "LV", "Lat33", "Jelgava", "At9020", null);

    }

}
