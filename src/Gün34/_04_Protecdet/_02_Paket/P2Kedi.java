package Gün34._04_Protecdet._02_Paket;

import Gün34._04_Protecdet._01_Paket.P1Hayvan;

public class P2Kedi extends P1Hayvan {
        public P2Kedi(String isim, String tur) {
            super.ad = isim; // public
            super.cinsi = tur; // protected
            // defaulttan farklı olarak
            // extend edildiğinde diğer paketlerden de
            // erişilebilir.

        }


    }

