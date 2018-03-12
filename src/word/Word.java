package word;

public class Word {
	private long id;
	private String engl;
	private String ukr;
	
	public Word(){		
	}
	public Word(String engl,String ukr){
		this.engl=engl;
		this.ukr=ukr;
	}
	public Word(int id,String engl,String ukr){
		this.id=id;
		this.engl=engl;
		this.ukr=ukr;
	}
	public long getId(){return id;}
	public void setId(long id){this.id=id;}
	public String getEngl(){return engl;}
	public void setEngl(){this.engl=engl;}
	public String getUkr(){return ukr;}
	public void setUkr(){this.ukr=ukr;}
}
