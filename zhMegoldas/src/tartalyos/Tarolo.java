package tartalyos;

public abstract class Tarolo {
	
	private int terfogat;

	public Tarolo(int terfogat) {
		super();
		this.terfogat = terfogat;
	}
	
	public abstract boolean isDangrous();

	public int getTerfogat() {
		return terfogat;
	}

	public void setTerfogat(int terfogat) {
		this.terfogat = terfogat;
	}

	
}
