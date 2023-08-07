package Gün34._04_Protecdet._01_Paket;

public class P1Hayvan {

    public String ad;  // her yerden , bütün paketlerden ulaşılabilir
    int yas;           // default : sadece aynı paketten ulaşabilir
    protected String cinsi;  // default gibi, sadece bir yöntemle diğer paketlerden ulaşılabilir
    private String renk; // sadece kendi bulunduğu class dan ulaşılabilir.
}


