package tartalyos;

import com.sun.org.apache.regexp.internal.recompile;

public class Tartaly extends Tarolo {

	
	private double nyomas;
	public Tartaly(int terfogat,double nyomas) {
		super(terfogat);
		this.nyomas=nyomas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isDangrous() {
	
		if ((getTerfogat()*nyomas)>100) {
			return true;
		}
		return false;
		
	}

	public double getNyomas() {
		return nyomas;
	}

	public void setNyomas(double nyomas) {
		this.nyomas = nyomas;
	}

	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + "terfogat = " +getTerfogat()+", veszelyes =" + isDangrous() + "]";
	}

	
	public boolean isBiggerThan(Tartaly tartaly) {
		
		if (this.nyomas>tartaly.getNyomas()) {
			return true;
		}
		else return false;
	}
	
	public static Tartaly getBiggerTartaly(Tartaly tartaly1, Tartaly tartaly2) {
		
		if (tartaly1.getTerfogat()>tartaly2.getTerfogat()) {
			return tartaly1;
		}
		else return tartaly2;
		
	}
}


