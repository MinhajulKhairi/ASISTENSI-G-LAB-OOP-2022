package Nomor2;

public class PengurusInti {
    private String jabatan;
    private int periode;

    public PengurusInti(String jabatan, int periode) {
        this.jabatan = jabatan;
        this.periode = periode;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getPeriode() {
        return periode;
    }
}

class Ketua extends PengurusInti {
    public Ketua() {
        super("Ketua", 2023);
    }
}

class WakilKetua extends PengurusInti {
    public WakilKetua() {
        super("Wakil Ketua", 2023);
    }
}

class Sekretaris extends PengurusInti {
    public Sekretaris() {
        super("Sekretaris", 2023);
    }
}

class Bendahara extends PengurusInti {
    public Bendahara() {
        super("Bendahara", 2023);
    }
}
