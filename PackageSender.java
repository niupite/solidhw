package io.codelex.solidexamples;

public class PackageSender {

    public static void main(String[] args) {

        PostalService postalService = new PostalService();
        postalService.SendPackage(
                "Janis", "Liepins",
                "Marta", "Ozola",
                "LV-1010", "Latvia", "Riga", "Brivibas", 100);

        postalService.SendPackage(
                "Gatis", "Kandis",
                "Jan88", "Berzins",
                "LV", "Lat33", "Jelgava", "At9020", null);

    }

}
