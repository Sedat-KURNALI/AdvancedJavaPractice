package HaLukHoca22.JavaProjects.P09_kitapYonetimi;

public class EklenenKitaplar {
	
	public int kitapNo;
	public String kitapAdi;
	public String yazar;
	public int kitapFiyati;
	
	
	public EklenenKitaplar() {
		
	}
	
	
	public EklenenKitaplar (int kitapNo, String kitapAdi, String yazar, int kitapFiyati) {
		this.kitapNo= Kitapci_KitapEkle.count;
		this.kitapAdi = kitapAdi;
		this.yazar=yazar;
		this.kitapFiyati = kitapFiyati;
	}


}
