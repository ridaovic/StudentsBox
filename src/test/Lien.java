package test;

public class Lien {
	
	private String lien;

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public Lien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lien(String lien) {
		super();
		this.lien = lien;
	}
	
	public static boolean isCurrent(String current,String item) {
		
		boolean resultat=false;
		
		current=current.substring(47);
		current=current.substring(0,current.length()-4);
		if(current.equals(item))resultat=true;
		
		return resultat;
	}
	

}
