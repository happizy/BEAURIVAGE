
public class Emplacement {
	int num,numcont,numcli;
	String nomcli,date,cat;
	public Emplacement(int num, int numcont, int numcli, String nomcli, String date, String cat) {
		super();
		this.num = num;
		this.numcont = numcont;
		this.numcli = numcli;
		this.nomcli = nomcli;
		this.date = date;
		this.cat = cat;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNumcont() {
		return numcont;
	}
	public void setNumcont(int numcont) {
		this.numcont = numcont;
	}
	public int getNumcli() {
		return numcli;
	}
	public void setNumcli(int numcli) {
		this.numcli = numcli;
	}
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
}
