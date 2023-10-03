package montres;

public class Personnes {
	String name;
	boolean hasWatch;
	
	
	public Personnes(String _name, boolean _hasWatch) {
		this.name = _name;
		this.hasWatch = _hasWatch;
	}
	
	public void equipWatch() {
		if(this.hasWatch) {
			this.hasWatch = false;
			System.out.println("Montre d�s�quip�e");
		}else {
			this.hasWatch = true;
			System.out.println("Montre �quip�e");
		}
	}
	
	public String tellTime(Montre _montre) {
		String time = (_montre.heure + ":" +  _montre.minutes).toString();
		String noTime = "Impossible, pas de montre";
		if(this.hasWatch) {
			return time;
		}else {
			return noTime;
		}
	}
}
